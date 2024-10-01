import java.lang.reflect.Array;
import java.util.ArrayList;

public class map {
    private Room currentRoom;





    map() {
        buildMap();
    }

    public void buildMap() {
        ArrayList<Item> room1Item = new ArrayList<>();
        ArrayList<Item> room2Item = new ArrayList<>();
        ArrayList<Item> room3Item = new ArrayList<>();
        ArrayList<Item> room4Item = new ArrayList<>();
        ArrayList<Item> room5Item = new ArrayList<>();
        ArrayList<Item> room6Item = new ArrayList<>();
        ArrayList<Item> room7Item = new ArrayList<>();
        ArrayList<Item> room8Item = new ArrayList<>();
        ArrayList<Item> room9Item = new ArrayList<>();


        Room room1 = new Room("room1 " , "This room is empty,but there are two big doors. " , room1Item   );
        Item item1 = new Item("swond" , "wapend");
        room1Item.add(item1);


        Room room2 = new Room("room2 " , "This is a quiet library. " , room2Item);
        Item item2 = new Item("abe" , "dyr");
        room2Item.add(item2);


        Room room3 = new Room("room3 " , "You are in a bright room with large windows. " , room3Item);
        Item item3 = new Item("book" , "k");
        room3Item.add(item3);

        Room room4 = new Room("room4 " , "A damp cave with dripping water. " ,room4Item );
        Item item4 = new Item("a" , " m");
        room4Item.add(item4);

        Room room5 = new Room("room5 " , "A mystical room with strange symbols. "  , room5Item);
        Item item5 = new Item("s" , "p");
        room5Item.add(item5);

        Room room6 = new Room("room6 ", "An empty room with an old chair. " , room6Item);
        Item item6 = new Item("q" ,"k");
        room6Item.add(item6);

        Room room7 = new Room("room7 " , "A dark room with no visible exits. " , room7Item);
        Item item7 = new Item("bo" , "kurt");
        room7Item.add(item7);

        Room room8 = new Room("room8 " , "A dimly lit room with a flickering lantern. " , room8Item);
        Item item8 = new Item("p" , " m ");
        room8Item.add(item8);

        Room room9 = new Room("room9 " , "A cold, quiet room with stone walls. " , room9Item);
        Item item9 = new Item("a " , " l" );
        room9Item.add(item9);



        room1.setNeighBourEast(room2);
        room1.setNeighBourSouth(room4);

        room2.setNeighBourEast(room3);
        room2.setNeighBourWest(room1);

        room3.setNeighBourSouth(room6);
        room3.setNeighBourWest(room2);

        room4.setNeighBourSouth(room7);
        room4.setNeighbourNorth(room1);

        room5.setNeighBourSouth(room8);

        room6.setNeighbourNorth(room3);
        room6.setNeighBourSouth(room9);

        room7.setNeighbourNorth(room4);
        room7.setNeighBourEast(room8);

        room8.setNeighbourNorth(room5);
        room8.setNeighBourWest(room7);
        room8.setNeighBourEast(room9);

        room9.setNeighbourNorth(room6);
        room9.setNeighBourWest(room8);

        currentRoom = room1;
    }
    public Room getCurrentRoom() {
        return currentRoom;
    }

}
