package inventory;

public class Binder extends Items {
    private boolean foundCode;

    public Binder() {
        super("binder", false);
        foundCode = false;
    }

    @Override
    public void read() {
        if (foundCode) {
            Game.print("you already found the code");
        } else {
            Code code = new Code("classroom5code");
            Game.item.add(code);
            foundCode = true;
            Game.print("You found the classroom 5 code!");
        }
    }
}
