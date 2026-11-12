package inventory;

public class Checklist extends Items {
    private boolean foundCode;

    public Checklist() {
        super("checklist", false);
        foundCode = false;
    }

    @Override
    public void read() {
        if (foundCode) {
            Game.print("you already found the code");
        } else {
            Code code = new Code("classroom3code");
            Game.item.add(code);
            foundCode = true;
            Game.print("You found the classroom 3 code!");
        }
    }
}
