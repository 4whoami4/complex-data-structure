package com.saxion;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = Reader.ReadCustomers();
        ArrayList<Package> packages = Reader.ReadPackages();

        HashMap<Integer, Customer> customerHashMap = new HashMap<>();
        for (Customer customer : customers) {
            customerHashMap.put(customer.clientId(), customer);
        }
    }
}