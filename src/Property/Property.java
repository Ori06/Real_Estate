package Property;

import javax.lang.model.type.NullType;

public abstract class Property {
    protected String address = "NA";
    protected double area = 0.0;
    protected double price = 0.0;

    // Default constructor
    public Property() {
        // Default values already set by field initializations
    }

    // Constructor with all fields
    public Property(String address, double area, double price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.equals("")) {
            System.out.println("Address can't be empty.");
            return;
        }
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area < 0) {
            System.out.println("Area can't be a negative number.");
            return;
        }
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price can't be a negative number.");
            return;
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Property Details:\n" +
                "  - Address: " + address + "\n" +
                "  - Area: " + area + " sq. units\n" +
                "  - Price: $" + String.format("%,.2f", price);
    }

    public abstract double taxlt();
}