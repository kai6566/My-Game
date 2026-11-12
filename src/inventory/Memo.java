package inventory;

public class Memo extends Items {
    public Memo() {
        super("memo", false);
    }

    @Override
    public void read() {
        Game.print("The memo mentions the equipment rack in John's Office.");
    }
}
