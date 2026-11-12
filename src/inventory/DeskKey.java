package inventory;

public class DeskKey extends Items {
    private boolean usedKey;

    public DeskKey() {
        super("deskkey", false);
        usedKey = false;
    }

    @Override
    public void useItem() {
        if (Game.getCurrentRoom().getName().equals("Fischbachs_office")) {
            if (usedKey) {
                Game.print("You already unlocked the desk!");
            } else {
                Game.getCurrentRoom().getItems("desk").useItem();
                usedKey = true;
                Game.print("You unlocked the desk!");
            }
        } else {
            Game.print("You cannot use the desk key here.");
        }
    }
}
