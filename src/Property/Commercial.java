package Property;

public class Commercial extends Property {
    private double yield = 0.0;
    private boolean storeroom = false;


    public Commercial() {
        super();
    }

    public Commercial(String address, double area, double price, double yield) {
        super(address, area, price);
        setYield(yield);
    }

    public Commercial(String address, double area, double price, double yield, boolean storeroom) {
        super(address, area, price);
        setYield(yield);
        this.storeroom = storeroom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        if(yield<0){
            System.out.println("Yield can't be a negative number.");
            return;
        }
        this.yield = yield;
    }

    public boolean isStoreroom() {
        return storeroom;
    }

    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public double excpectedMonthlyYield() {
        return price * (yield / 100) / 12;
    }

    @Override
    public String toString() {
        return "Commercial Details:\n" +
                "  - Yield: " + yield + "%\n" +
                "  - Storeroom: " + storeroom + "\n" +
                "  - Address: " + address + "\n" +
                "  - Area: " + area + " sq. units\n" +
                "  - Price: $" + String.format("%,.2f", price);
    }

    public double taxlt() {
        return price * 0.05;
    }
}
