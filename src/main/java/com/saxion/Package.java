package com.saxion;

public record Package(int packageId, int length, int width, int height, float weight, String entryDate,
                      int clientId) implements Comparable<Package> {
    public String toString() {
        return packageId + ";" + length + ";" + width + ";" + height + ";" + weight + ";" + entryDate + ";" + clientId;
    }

    @Override
    public int compareTo(Package pack) {
        return packageId - pack.packageId;
    }
}