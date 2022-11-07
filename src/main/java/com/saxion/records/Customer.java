package com.saxion.records;

public record Customer(int clientId, String name, String initials, int addressX,
                       int addressY) implements HasId {
    public String toString() {
        return clientId + ";" + name + ";" + initials + ";" + addressX + ";" + addressY;
    }

    @Override
    public int id() {
        return clientId;
    }
}