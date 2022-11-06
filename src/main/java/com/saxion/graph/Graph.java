package com.saxion.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private final Map<Vertex, List<Vertex>> vertices;

    public Graph() {
        vertices = new HashMap<>();
    }

    public void AddVertex(String label) {
        vertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void RemoveVertex(String val) {
        Vertex v = new Vertex(val);

        vertices.values().forEach(e -> e.remove(v));
        vertices.remove(new Vertex(val));
    }

    public void AddEdge(String val, String val1) {
        Vertex v1 = new Vertex(val);
        Vertex v2 = new Vertex(val1);

        vertices.get(v1).add(v2);
        vertices.get(v2).add(v1);
    }

    public void RemoveEdge(String val, String val1) {
        Vertex v1 = new Vertex(val);
        Vertex v2 = new Vertex(val1);

        List<Vertex> eV1 = vertices.get(v1);
        List<Vertex> eV2 = vertices.get(v2);

        if (eV1 != null) eV1.remove(v2);
        if (eV2 != null) eV2.remove(v1);
    }

    public List<Vertex> GetAdjacentVertices(String val) {
        return vertices.get(new Vertex(val));
    }
}
