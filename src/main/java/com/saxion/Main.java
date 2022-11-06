package com.saxion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = Reader.ReadCustomers();
        ArrayList<Package> packages = Reader.ReadPackages();

        Customer customer = Search.Linear(customers, customers.get(0));
        System.out.println(customer);

        Package pack = Search.Binary(packages, packages.get(2));
        System.out.println(pack);
    }
}