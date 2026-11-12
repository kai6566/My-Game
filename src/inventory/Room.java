package inventory;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Room implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Room[] room;
    private LinkedHashMap<String, Items> items;
    private boolean isLocked;

    
    public static HashMap<String, Room> rooms = new HashMap<>();

    public Room(String n) {
        name = n;
        room = new Room[6];
        items = new LinkedHashMap<>();
        isLocked = false;
        rooms.put(name, this);
    }

    public boolean getIslocked() {
        return isLocked;
    }

    public void setIslocked(boolean n) {
        isLocked = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        rooms.remove(name);
        name = n;
        rooms.put(name, this);
    }

    public static HashMap<String, Room> getRooms() {
        return rooms;
    }

    
    public String getDescription() {
        String description = Game.roomDescription.get(name);
        return description == null ? "No description found for this room." : description;
    }

    public void setDescription(String d) {
        Game.roomDescription.put(name, d);
    }

    
    public Items getItems(String n) {
        return items.get(n);
    }

    
    public Collection<Items> getItems() {
        return items.values();
    }

    
    
    public void setItems(Items i) {
        items.put(i.getName(), i);
    }

    public void addItem(Items i) {
        setItems(i);
    }

    public void removeItems(String n) {
        items.remove(n);
    }

    @Override
    public String toString() {
        return name + "\n" + getDescription();
    }

    
    public void addExit(Room z, int n) {
        room[n] = z;
    }

    public Room getExit(int n) {
        return room[n];
    }
}
