package inventory;

public class Desk extends Items {
    private boolean isLocked;
    private boolean foundMemo;

    public Desk() {
        super("desk", true);
        isLocked = true;
        foundMemo = false;
    }

    @Override
    public void useItem() {
        isLocked = false;
    }

    @Override
    public void open() {
        if (isLocked) {
            Game.print("The desk drawer is locked.");
        } else if (foundMemo) {
            Game.print("You already found the memo. There is nothing else in here.");
        } else {
            Memo memo = new Memo();
            Game.getCurrentRoom().addItem(memo);
            foundMemo = true;
            Game.print("You opened the desk and found a memo.");
        }
    }

    @Override
    public void close() {
        Game.print("You closed the desk.");
    }
}
