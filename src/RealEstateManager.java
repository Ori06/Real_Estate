import Property.Property;

import java.util.ArrayList;


public class RealEstateManager {
    private String name = "NA";
    private ArrayList<Property> properties = new ArrayList<>();



    public RealEstateManager(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            System.out.println("Address can't be empty.");
            return;
        }
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    @Override
    public String toString() {
        return "RealEstateManager Details:\n" +
                "  - Name: " + name + "\n" +
                "  - Properties: " + properties.size() + " properties";
    }

    public void printProperties() {
        System.out.println(name + "'s properties list:");
        for (Property p : properties) {
            System.out.println(p);
        }
    }

    public ArrayList<Property> belowPriceList(int price) {
        ArrayList<Property> belowPriceList = new ArrayList<>();
        for (Property p : properties) {
            if (p.getPrice() < price) {
                belowPriceList.add(p);
            }
        }
        return belowPriceList;
    }


}
