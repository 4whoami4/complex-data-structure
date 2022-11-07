package com.saxion.graph;

import java.util.*;

public class Vertex {
    public int addressX, addressY;
    public int distance = Integer.MAX_VALUE;
    public Map<Vertex, Integer> adjacencies = new HashMap<>();
    public List<Vertex> shortestPath = new LinkedList<>();

    public Vertex(int addressX, int addressY) {
        this.addressX = addressX;
        this.addressY = addressY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressX, addressY);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vertex vertex)
            return addressX == vertex.addressX && addressY == vertex.addressY;
        return false;
    }

    @Override
    public String toString() {
        return "(" + addressX + ", " + addressY + ")";
    }
}
