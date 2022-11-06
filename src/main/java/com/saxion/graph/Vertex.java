package com.saxion.graph;

public class Vertex {
    public String value;

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
