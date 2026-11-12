package inventory;

public class Code extends Items {
    private boolean usedCode;

    public Code(String n) {
        super(n, false);
        usedCode = false;
    }

    @Override
    public void useItem() {
        if (usedCode) {
            Game.print("You already unlocked this classroom!");
        } else if (getName().equals("classroom1code") && Game.getCurrentRoom().getName().equals("Fischbachs_office")) {
            Game.getCurrentRoom().getExit(3).setIslocked(false);
            usedCode = true;
            Game.print("You unlocked classroom 1!");
        } else if (getName().equals("classroom1code") && Game.getCurrentRoom().getName().equals("Second Floor Stairs")) {
            Game.getCurrentRoom().getExit(2).setIslocked(false);
            usedCode = true;
            Game.print("You unlocked classroom 1!");
        } else if (getName().equals("classroom2code") && Game.getCurrentRoom().getName().equals("johns_office")) {
            Game.getCurrentRoom().getExit(3).setIslocked(false);
            usedCode = true;
            Game.print("You unlocked classroom 2!");
        } else if (getName().equals("classroom2code") && Game.getCurrentRoom().getName().equals("restroom")) {
            Game.getCurrentRoom().getExit(1).setIslocked(false);
            usedCode = true;
            Game.print("You unlocked classroom 2!");
        } else if (getName().equals("classroom3code") && Game.getCurrentRoom().getName().equals("Lecture_hall")) {
            Game.getCurrentRoom().getExit(3).setIslocked(false);
            usedCode = true;
            Game.print("You unlocked classroom 3!");
        } else if (getName().equals("classroom3code") && Game.getCurrentRoom().getName().equals("Restroom_2")) {
            Game.getCurrentRoom().getExit(1).setIslocked(false);
            usedCode = true;
            Game.print("You unlocked classroom 3!");
        } else if (getName().equals("classroom5code") && Game.getCurrentRoom().getName().equals("classroom1")) {
            Game.getCurrentRoom().getExit(1).setIslocked(false);
            usedCode = true;
            Game.print("You unlocked classroom 5!");
        } else {
            Game.print("You cannot use this code here.");
        }
    }
}
