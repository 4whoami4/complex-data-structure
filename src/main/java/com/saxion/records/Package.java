package com.saxion.records;

import com.saxion.utils.PackageStatus;

public record Package(int packageId, int length, int width, int height, float weight, String entryDate,
                      PackageStatus status, int clientId) implements Comparable<Package> {
    public String toString() {
        return packageId + ";" + length + ";" + width + ";" + height + ";" + weight + ";" + entryDate + ";" + status + ";" + clientId;
    }

    @Override
    public int compareTo(Package pack) {
        return packageId - pack.packageId;
    }
}

