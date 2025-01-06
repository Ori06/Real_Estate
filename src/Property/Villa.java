package Property;

public class Villa extends Residential {
    private int levels = 1;

    public Villa() {
        super();
    }

    public Villa(String address, double area, double price, int parkingLots, int levels) {
        super(address, area, price, parkingLots);
        setLevels(levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if(levels<1){
            System.out.println("Number of levels can't be lesser than 1.");
            return;
        }
        this.levels = levels;
    }

    @Override
    public String toString() {
        return "Villa Details:\n" +
                "  - Levels: " + levels + "\n" +
                "  - Parking Lots: " + parkingLots + "\n" +
                "  - Address: " + address + "\n" +
                "  - Area: " + area + " sq. units\n" +
                "  - Price: $" + String.format("%,.2f", price);
    }

    @Override
    public double taxlt() {
        return price * 0.25;
    }

}
