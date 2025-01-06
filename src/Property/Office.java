package Property;

public class Office extends Property {

    public Office(){
        super();
    }

    public Office(String address, double area, double price) {
        super(address, area, price);
    }

    @Override
    public String toString() {
        return "Office Details:\n" +
                "  - Address: " + address + "\n" +
                "  - Area: " + area + " sq. units\n" +
                "  - Price: $" + String.format("%,.2f", price);
    }

    public double taxlt() {
        return price * 0.05;
    }
}
