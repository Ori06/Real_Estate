package Property;

public class Apartment extends Residential {
    private int rooms = 1;

    public Apartment() {
        super();
    }

    public Apartment(String address, double area, double price, int parkingLots, int rooms) {
        super(address, area, price, parkingLots);
        setRooms(rooms);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if(rooms<1){
            System.out.println("Number of rooms can't be lesser than 1.");
            return;
        }
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Apartment Details:\n" +
                "  - Rooms: " + rooms + "\n" +
                "  - Parking Lots: " + parkingLots + "\n" +
                "  - Address: " + address + "\n" +
                "  - Area: " + area + " sq. units\n" +
                "  - Price: $" + String.format("%,.2f", price);
    }

//    public double taxlt() {
//        return price * 0.08;
//    }
}
