
public class Main {
    public static void main(String[] args) {

       
        Room r1 = new Room("Bedroom", 200);
        Room r2 = new Room("Kitchen", 120);
        Room r3 = new Room("Drawing Room", 250);

      
        House house = new House("My House", "Abbottabad");

        house.addRoom(r1);
        house.addRoom(r2);
        house.addRoom(r3);

        house.showRooms();
    }
}
