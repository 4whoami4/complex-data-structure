package com.saxion;

import com.saxion.records.Package;
import com.saxion.records.Customer;
import com.saxion.utils.PackageStatus;
import com.saxion.utils.Reader;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Package> packages = new ArrayList<>();

    public static void main(String[] args) {
        LoadData();

        packages.stream().filter(pack -> pack.status() == PackageStatus.Pending).forEach(System.out::println);
    }

    private static void LoadData() {
        customers = Reader.ReadCustomers();
        packages = Reader.ReadPackages();
    }
}