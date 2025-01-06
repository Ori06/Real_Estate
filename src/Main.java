import Property.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


import static Property.Plot.TYPE.*; // Static import for enum values

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static RealEstateManager manager;

    public static void main(String[] args) {

        int input;

        System.out.println("Insert manager name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", welcome to the real estate agency!");

        manager = new RealEstateManager(name);

        manager.setProperties(DataManager.generateData());

        do {
            System.out.println("\nProperties menu:\n" +
                    "1-> Properties list\n" +
                    "2-> Financial report\n" +
                    "3-> Commercial yield\n" +
                    "4-> Properties by city\n" +
                    "5-> Number of cities\n" +
                    "0-> Exit");

            input = scanner.nextInt();

            switch (input) {
                case 1 -> {
                    try {
                        propertiesList();
                    } catch (PriceException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 2 -> {
                    financialReport();
                }
                case 3 -> {
                    commercialYield();
                }
                case 4 -> {
                    propertiesByCity();
                }
                case 5 -> {
                    NumberOfCities();
                }
                case 0 -> {
                    System.out.println("Exiting program.");
                }
            }
        } while (input != 0);
    }

    private static void NumberOfCities() {
        HashSet<String> citySet = new HashSet<>();
        String city;
        int count = 0;
        for (Property p : manager.getProperties()) {
            city = p.getAddress().substring(0,p.getAddress().indexOf(','));
            if(!citySet.contains(city)) {
                count++;
                citySet.add(city);
                System.out.println(city);
            }
        }
        System.out.println("Total number of cities: " + count);
    }

    private static void propertiesByCity() {
        scanner.nextLine();

        String cityInput, city;
        System.out.println("Enter city name:");
        cityInput = scanner.nextLine();
        cityInput = cityInput.toLowerCase();

        cityInput = cityInput.replace('-', ' ');

        System.out.println("City properties list:");
        for (Property p : manager.getProperties()) {
            city = (p.getAddress().substring(0,p.getAddress().indexOf(','))).toLowerCase();

            if(city.equals(cityInput)){
                System.out.println(p.toString());
            }

        }

    }

    private static void commercialYield() {
        double sum = 0;

        for (Property p : manager.getProperties()) {
            if (p instanceof Commercial) {
                sum += ((Commercial) p).getYield();
            }
        }

        System.out.println("Total yield for commercial properties: $" + sum);

    }

    private static void financialReport() {
        System.out.println("Properties details & tax list:");
        for (Property p : manager.getProperties()) {
            System.out.println(p.toString() + "\n  - Tax payed : " + p.taxlt());
        }
    }

    private static void propertiesList() throws PriceException {
        ArrayList<Property> belowPriceList = new ArrayList<>();
        System.out.println("Insert a selected price:");
        int price = scanner.nextInt();
        if (price < 0) {
            throw new PriceException("Price number can't be negative.\n");
        }
        belowPriceList = manager.belowPriceList(price);
        System.out.println("Properties below the selected price:");
        for (Property p : belowPriceList) {
            System.out.println(p);
        }
    }
}