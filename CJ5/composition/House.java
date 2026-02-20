package CJ5.composition;

class Room {
    String typeOfRoom;

    Room(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }
}

public class House {

    String name;
    String location;
    Room[] rooms;   // House has Rooms (Composition)

    House(String name, String location, Room[] rooms) {
        this.name = name;
        this.location = location;
        this.rooms = rooms;
    }

    void showDetails() {
        System.out.println("House Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Rooms:");

        for (Room r : rooms) {
            System.out.println(r.typeOfRoom);
        }
    }

    public static void main(String[] args) {
        Room r1 = new Room("Bedroom");
        Room r2 = new Room("Kitchen");
        Room r3 = new Room("Hall");

        Room[] roomList = { r1, r2, r3 };

        House h = new House("MyHouse", "Chennai", roomList);
        h.showDetails();
    }
}