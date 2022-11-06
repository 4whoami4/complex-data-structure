package com.saxion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
    public static ArrayList<Customer> ReadCustomers() {
        ArrayList<Customer> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Customers.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("ClientID")) continue;
                records.add(ParseCustomer(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }

    public static ArrayList<Package> ReadPackages() {
        ArrayList<Package> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Packages.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("PackageID")) continue;
                records.add(ParsePackage(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }

    private static Customer ParseCustomer(String line) {
        String[] values = line.split(";");
        return new Customer(Integer.parseInt(values[0]), values[1], values[2], Integer.parseInt(values[3]), Integer.parseInt(values[4]));
    }

    private static Package ParsePackage(String line) {
        String[] values = line.split(";");
        return new Package(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]), Float.parseFloat(values[4]), values[5], Integer.parseInt(values[6]));
    }
}
