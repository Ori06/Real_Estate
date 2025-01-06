import Property.*;

import java.util.ArrayList;


public class DataManager {



    public static ArrayList<Property> generateData() {
        ArrayList<Property> properties = new ArrayList<>();
        properties.add(new Apartment("Tel Aviv, Frishman 12", 55.4, 12_249, 2, 5));
        properties.add(new Apartment("Tel Aviv, Rothschild 45", 78.1, 15_432,1, 4));
        properties.add(new Villa("Jerusalem, King George 17", 63.2, 10_500, 3, 3));
        properties.add(new Villa("Haifa, Ben Gurion 5", 54.7, 8_800, 2, 3));
        properties.add(new Vacation("Eilat, Negev 3", 120.5, 20_000,2, 10));
        properties.add(new Vacation("Beer Sheva, Herzl 9", 70.3, 9_600,2, 8));
        properties.add(new Office("Netanya, Jabotinsky 8", 88.0, 13_750));
        properties.add(new Office("Ramat Gan, Rothschild 10", 56.8, 11_300));
        properties.add(new Commercial("Netanya, Jabotinsky 12", 64.0, 13_750, 124, false));
        properties.add(new Commercial("Tel Aviv, Rothschild 19", 56.0, 11_720, 63, true));
        properties.add(new Plot("Haifa, Ben Gurion 16", 250.7, 28_800, Plot.TYPE.AGRICULTURAL));
        properties.add(new Plot("Eilat, Negev 2", 240.5, 30_000, Plot.TYPE.URBAN));

        return properties;
    }



}
