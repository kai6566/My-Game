package inventory;

public class ExitKey extends Items {
    private boolean usedKey;

    public ExitKey() {
        super("exitkey", false);
        usedKey = false;
    }

    @Override
    public void useItem() {
        if (Game.getCurrentRoom().getName().equals("lobby")) {
            if (usedKey) {
                Game.print("You already unlocked the main entrance!");
            } else {
                Game.getCurrentRoom().getExit(3).setIslocked(false);
                usedKey = true;
                Game.print("You unlocked the main entrance!");
            }
        } else {
            Game.print("You cannot use the exit key here.");
        }
    }
}
