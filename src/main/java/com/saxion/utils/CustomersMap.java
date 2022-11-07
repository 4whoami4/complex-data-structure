package com.saxion.utils;

import java.util.HashMap;

public class CustomersMap {
    private final HashMap<String, Integer> customersIds = new HashMap<>();

    public int getCustomerId(String customerName) {
        return customersIds.get(customerName);
    }

    public void addCustomer(String customerName, int customerId) {
        customersIds.put(customerName, customerId);
    }

    public boolean containsCustomer(String customerName) {
        return customersIds.containsKey(customerName);
    }

    public int size() {
        return customersIds.size();
    }
}


