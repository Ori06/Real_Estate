package Property;

public abstract class Residential extends Property {
    protected int parkingLots = 0;

    public Residential(){
        super();
    }

    public Residential(String address, double area, double price, int parkingLots) {
        super(address, area, price);
        setParkingLots(parkingLots);
    }

    public int getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(int parkingLots) {
        if(parkingLots<0) {
            System.out.println("Parking lots number can't be negative.");
            return;
        }
        this.parkingLots = parkingLots;
    }

    @Override
    public String toString() {
        return "Residential Details:\n" +
                "  - Parking Lots: " + parkingLots + "\n" +
                "  - Address: " + address + "\n" +
                "  - Area: " + area + " sq. units\n" +
                "  - Price: $" + String.format("%,.2f", price);
    }

    public double taxlt() {
        return price * 0.08;
    }
}
