package Property;

public class Vacation extends Residential {
    private int guests = 1;

    public Vacation() {
        super();
    }

    public Vacation(String address, double area, double price, int parkingLots, int guests) {
        super(address, area, price, parkingLots);
        setGuests(guests);
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        if(guests<1){
            System.out.println("Number of guests can't be lesser than 1.");
            return;
        }
        this.guests = guests;
    }

    @Override
    public String toString() {
        return "Vacation Details:\n" +
                "  - Guests: " + guests + "\n" +
                "  - Parking Lots: " + parkingLots + "\n" +
                "  - Address: " + address + "\n" +
                "  - Area: " + area + " sq. units\n" +
                "  - Price: $" + String.format("%,.2f", price);
    }

//    public double taxlt() {
//        return price * 0.08;
//    }

}
