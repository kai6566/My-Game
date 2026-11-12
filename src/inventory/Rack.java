package inventory;

public class Rack extends Items {
    private boolean isLocked;
    private boolean foundKey;

    public Rack() {
        super("rack", true);
        isLocked = true;
        foundKey = false;
    }

    @Override
    public void useItem() {
        isLocked = false;
    }

    @Override
    public void open() {
        if (isLocked) {
            Game.print("The rack is locked.");
        } else if (foundKey) {
            Game.print("You already found the key. There is nothing else in here.");
        } else {
            ExitKey key = new ExitKey();
            Game.getCurrentRoom().addItem(key);
            foundKey = true;
            Game.print("You opened the rack and found a key.");
        }
    }

    @Override
    public void close() {
        Game.print("You closed the rack.");
    }
}
