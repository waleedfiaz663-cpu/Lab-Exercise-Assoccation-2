import java.util.ArrayList;
class House {
    private String name;
    private String address;
    private ArrayList<Room> rooms;

    public House(String name, String address) {
        this.name = name;
        this.address = address;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public String getAddress() {
        return address;
    }

    public void showRooms() {
        System.out.println("\nHouse: " + name);
        System.out.println("Address: " + address);

        for (Room room : rooms) {
            room.getInfo();
        }
    }
}

