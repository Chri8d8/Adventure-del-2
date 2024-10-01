import java.util.ArrayList;
import java.util.List;

public class Player {
    Room placement;
    ArrayList<Item> inventory;


    public Player(Room placement) {
        this.placement = placement;
        this.inventory = new ArrayList<>();
    }

    public Room getPlacement() {
        return placement;
    }

    public void setPlacement(Room placement) {
        this.placement = placement;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
    public void addItem(Item item) {
        inventory.add(item);
    }
    public void dropItem(Item item) {
        inventory.remove(item);
    }


    public Room move(String movement) {
        if (movement.equalsIgnoreCase("go north")&&
                placement.getNeighbourNorth()!= null) {
            placement = placement.getNeighbourNorth();
        } else if (movement.equalsIgnoreCase("go south") &&
        placement.getNeighBourSouth() != null) {
          placement = placement.getNeighBourSouth();
        } else if (movement.equalsIgnoreCase("go west") &&
        placement.getNeighBourWest() != null) {
            placement = placement.getNeighBourWest();
        } else if (movement.equalsIgnoreCase("go east") &&
        placement.getNeighBourEast() != null) {
            placement = placement.getNeighBourEast();
        } else {
            return null;
        }
        return placement;
    }

    public Item findItemInInventory(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }
    public String getInventoryDescription() {
        if (inventory.isEmpty()) {
            return "You are not carrying any items.";
        }
        StringBuilder invDesc = new StringBuilder("You are carrying: ");
        for (Item item : inventory) {
            invDesc.append(item.getName()).append(",");
            invDesc.append(item.getType()).append(",");
        }
        return invDesc.toString();
    }


}
