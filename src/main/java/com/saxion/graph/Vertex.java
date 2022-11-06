package com.saxion.graph;

public class Vertex {
    public String label;

    public Vertex(String label) {
        this.label = label;
    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vertex) {
            var vertex = (Vertex) obj;
            return label.equals(vertex.label);
        }
        return false;
    }

    @Override
    public String toString() {
        return label;
    }
}
