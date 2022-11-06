package com.saxion.graph;

import java.util.*;

public class Vertex {
    public String value;
    public int distance = Integer.MAX_VALUE;
    public Map<Vertex, Integer> adjacencies = new HashMap<>();
    public List<Vertex> shortestPath = new LinkedList<>();

    public Vertex(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vertex vertex)
            return value.equals(vertex.value);
        return false;
    }

    @Override
    public String toString() {
        return value;
    }
}
