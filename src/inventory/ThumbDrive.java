package inventory;

public class ThumbDrive extends Items {
    private boolean foundCode;

    public ThumbDrive() {
        super("thumbdrive", false);
        foundCode = false;
    }

    @Override
    public void useItem() {
        if (Game.getCurrentRoom().getItems("computer") == null) {
            Game.print("You cannot use the thumbdrive here.");
        } else if (foundCode) {
            Game.print("you already found the code");
        } else {
            RackCode code = new RackCode();
            Game.item.add(code);
            foundCode = true;
            Game.print("you plugged the thumbdrive into the computer and \n You found the rack code!");
        }
    }
}
