package Composition;

public class Room {
    private String name;
    public Room(String name){
        this.name = name;
    }
    public void displayRoomInfo(){
        System.out.println("Room: "+ name);
    }
}
