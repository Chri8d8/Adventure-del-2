import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private String roomDescription;
    private ArrayList<Item>items;

    private Room neighbourNorth,neighBourSouth,neighBourWest,neighBourEast;
    public Room(String name , String roomDescription , ArrayList<Item> items  ) {
        this.name = name;
        this.roomDescription = roomDescription;
        this.items = items;
    }


    public String getName() {
        return name;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Room getNeighbourNorth() {
        return neighbourNorth;
    }

    public void setNeighbourNorth(Room neighbourNorth) {
        this.neighbourNorth = neighbourNorth;
    }

    public Room getNeighBourSouth() {
        return neighBourSouth;
    }

    public void setNeighBourSouth(Room neighBourSouth) {
        this.neighBourSouth = neighBourSouth;
    }

    public Room getNeighBourWest() {
        return neighBourWest;
    }

    public void setNeighBourWest(Room neighBourWest) {
        this.neighBourWest = neighBourWest;
    }

    public Room getNeighBourEast() {
        return neighBourEast;
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void remmoveIte(Item item) {
        items.remove(item);
    }

    public void setNeighBourEast(Room neighBourEast) {
        this.neighBourEast = neighBourEast;
    }
    public Item findItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }

        }
        return null;
    }

    public String getItemsDescription() {
        if (items.isEmpty()) {
            return "There are no items here.";
        }
        StringBuilder itemDesc = new StringBuilder("Items in this room: ");
        for (Item item : items) {
            itemDesc.append(item.getType()).append(" ,");
        }
        return itemDesc.toString();
    }


}
