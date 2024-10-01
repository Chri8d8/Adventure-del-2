public class Adventure {

    Player player;
    map map;

    public Adventure() {
        map = new map();
        player = new Player(map.getCurrentRoom());
    }

    public String move(String direction) {
        Room room = player.move(direction);
        if (room != null) {
            return "you move to " + player.placement.getName() + " " +
             player.placement.getRoomDescription();
        } else {
            return "connot go this way";
        }
    }
    public void takeItem(String itemName) {
        Item item = player.placement.findItem(itemName);
        if (item != null) {
            player.placement.remmoveIte(item);
            player.addItem(item);
            System.out.println("you have taken the " + itemName);
        } else {
            System.out.println("there is nothing like " + itemName + " to take around here.");
        }
    }
    public void removeItem(String itemName) {
        Item item = player.findItemInInventory(itemName);
        if (item != null) {
            player.placement.addItem(item);
            player.dropItem(item);
            System.out.println("you have dropped the " + itemName);
        } else {
            System.out.println("there is nothing like " + itemName + " to take around here.");
        }
    }
}
