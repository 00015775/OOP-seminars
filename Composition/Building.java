package Composition;

public class Building {
    private Room[] rooms;

    public Building(){
        rooms = new Room[]{
            new Room("Living Room"),
            new Room("Kitchen"),
            new Room("Bathroom")
        };
    }

    public void displayBuildingInfo(){
        System.out.println("Building contains: ");
        for(Room room: rooms){
            room.displayRoomInfo();
        }
    }

}