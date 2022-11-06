package com.saxion;

public record Customer(int clientId, String name, String initials, int addressX,
                       int addressY) implements Comparable<Customer> {
    public String toString() {
        return clientId + ";" + name + ";" + initials + ";" + addressX + ";" + addressY;
    }

    @Override
    public int compareTo(Customer customer) {
        return clientId - customer.clientId;
    }
}