package Property;

public class Plot extends Property {

    public enum TYPE {
        URBAN, AGRICULTURAL, INDUSTRIAL;
    }

    private TYPE type;

    public Plot(TYPE type) {
        super();
        this.type = type;
    }

    public Plot(String address, double area, double price, TYPE type) {
        super(address, area, price);
         this.type = type;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        if (type != TYPE.URBAN && type != TYPE.AGRICULTURAL && type != TYPE.INDUSTRIAL) {
            System.out.println("Plot type incorrect.");
        }
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plot Details:\n" +
                "  - Address: " + getAddress() + "\n" +
                "  - Area: " + getArea() + " sq. units\n" +
                "  - Price: $" + String.format("%,.2f", getPrice()) + "\n" +
                "  - Type: " + type;
    }

    public double taxlt() {
        return switch (type) {
            case URBAN -> price * 0.1;
            case INDUSTRIAL -> price * 0.05;
            case AGRICULTURAL -> price * 0.02;
            default -> throw new IllegalArgumentException("Invalid type: " + type);
        };
    }

}


