package inventory;

import javax.swing.*;

import java.awt.*;

public class GameGUI extends JFrame {
    private static final long serialVersionUID = 1L;

    private static JTextArea outputArea;
    private static DefaultListModel<String> inventoryModel;
    private static JLabel locationLabel;

    private JTextField commandField;

    public GameGUI() {
        setTitle("Freedom Hall - Text Adventure");
        setSize(850, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(8, 8));

        locationLabel = new JLabel("Freedom Hall", SwingConstants.CENTER);
        locationLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(locationLabel, BorderLayout.NORTH);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        outputArea.setMargin(new Insets(12, 12, 12, 12));
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        
        inventoryModel = new DefaultListModel<>();
        JList<String> inventoryList = new JList<>(inventoryModel);
        inventoryList.setFont(new Font("Monospaced", Font.PLAIN, 15));

        JPanel inventoryPanel = new JPanel(new BorderLayout());
        inventoryPanel.setPreferredSize(new Dimension(175, 0));
        inventoryPanel.add(new JLabel("Inventory"), BorderLayout.NORTH);
        inventoryPanel.add(new JScrollPane(inventoryList), BorderLayout.CENTER);
        add(inventoryPanel, BorderLayout.EAST);

        commandField = new JTextField();
        commandField.setFont(new Font("Monospaced", Font.PLAIN, 17));
        commandField.setToolTipText("Examples: south, take notebook, save, load, help");
        commandField.addActionListener(e -> {
            String command = commandField.getText().trim();
            if (!command.isEmpty()) {
                printToScreen("> " + command);
                Game.processCommand(command);
            }
            commandField.setText("");
        });
        add(commandField, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
        Game.startGame();
        commandField.requestFocusInWindow();
    }

    public static void printToScreen(String text) {
        if (outputArea == null) {
            System.out.println(text); 
            return;
        }
        outputArea.append(text + "\n");
        outputArea.setCaretPosition(outputArea.getDocument().getLength());
    }

    public static void updateInventoryList(String[] items) {
        if (inventoryModel == null) return;
        inventoryModel.clear();
        for (String each : items) inventoryModel.addElement(each);
    }

    public static void updateLocationLabel(String name) {
        if (locationLabel != null) locationLabel.setText("Current room: " + name);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameGUI();
            }
        });
    }
}
