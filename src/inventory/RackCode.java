package inventory;

public class RackCode extends Items {
    private boolean usedCode;

    public RackCode() {
        super("rackcode", false);
        usedCode = false;
    }

    @Override
    public void useItem() {
        if (Game.getCurrentRoom().getName().equals("johns_office")) {
            if (usedCode) {
                Game.print("You already unlocked the rack!");
            } else {
                Game.getCurrentRoom().getItems("rack").useItem();
                usedCode = true;
                Game.print("You unlocked the rack!");
            }
        } else {
            Game.print("You cannot use the rack code here.");
        }
    }
}
