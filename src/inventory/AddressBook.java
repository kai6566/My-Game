package inventory;

public class AddressBook extends Items {
    private boolean foundCode;

    public AddressBook() {
        super("addressbook", false);
        foundCode = false;
    }

    @Override
    public void read() {
        if (foundCode) {
            Game.print("you already found the code");
        } else {
            Code code = new Code("classroom2code");
            Game.item.add(code);
            foundCode = true;
            Game.print("You found the classroom 2 code!");
        }
    }
}
