import java.util.ArrayList;

class Room {
    
    private String roomName;
    private double size;

    public Room(String roomName, double size) {
        
        this.roomName = roomName;
        this.size = size;
        
    }

    public double getSize() {
        
        return size;
        
    }

    public void getInfo() {
        
        System.out.println("Room: " + roomName +
                           ", Size: " + size + " sq.ft");
        
    }
}
