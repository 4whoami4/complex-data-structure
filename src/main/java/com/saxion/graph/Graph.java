package com.saxion.graph;

import java.util.*;

public class Graph {
    private final Map<Vertex, List<Vertex>> vertices;

    public Graph() {
        vertices = new HashMap<>();
    }

    public Map<Vertex, List<Vertex>> GetVertices() {
        return vertices;
    }

    public void AddVertex(int addressX, int addressY) {
        vertices.putIfAbsent(new Vertex(addressX, addressY), new ArrayList<>());
    }

    public void RemoveVertex(int addressX, int addressY) {
        Vertex v = new Vertex(addressX, addressY);

        vertices.values().forEach(e -> e.remove(v));
        vertices.remove(new Vertex(addressX, addressY));
    }

    public void AddEdge(int addressX1, int addressY1, int addressX2, int addressY2) {
        Vertex v1 = new Vertex(addressX1, addressY1);
        Vertex v2 = new Vertex(addressX2, addressY2);

        vertices.get(v1).add(v2);
        vertices.get(v2).add(v1);
    }

    public void RemoveEdge(int addressX1, int addressY1, int addressX2, int addressY2) {
        Vertex v1 = new Vertex(addressX1, addressY1);
        Vertex v2 = new Vertex(addressX2, addressY2);

        List<Vertex> eV1 = vertices.get(v1);
        List<Vertex> eV2 = vertices.get(v2);

        if (eV1 != null) eV1.remove(v2);
        if (eV2 != null) eV2.remove(v1);
    }

    public List<Vertex> GetAdjacentVertices(Vertex vertex) {
        return vertices.get(vertex);
    }

    public List<Vertex> GetAdjacentVertices(int addressX, int addressY) {
        return GetAdjacentVertices(new Vertex(addressX, addressY));
    }

    public Set<Vertex> BreadthFirstTraversal(Graph graph, Vertex root) {
        Set<Vertex> visited = new LinkedHashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);

        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            for (Vertex v : graph.GetAdjacentVertices(vertex)) {
                if (visited.contains(v))
                    continue;
                visited.add(v);
                queue.add(v);
            }
        }
        return visited;
    }

    public Set<Vertex> DepthFirstTraversal(Graph graph, Vertex root) {
        Set<Vertex> traversed = new LinkedHashSet<>();
        Stack<Vertex> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Vertex vertex = stack.pop();
            if (traversed.contains(vertex))
                continue;
            traversed.add(vertex);
            for (Vertex v : graph.GetAdjacentVertices(vertex))
                stack.push(v);
        }
        return traversed;
    }

    public Graph CalculateShortestPathFromSource(Graph graph, Vertex source) {
        source.distance = 0;
        Set<Vertex> settledNodes = new HashSet<>();
        Set<Vertex> unsettledNodes = new HashSet<>();
        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {
            Vertex currentNode = GetLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Map.Entry<Vertex, Integer> adjacencyPair : currentNode.adjacencies.entrySet()) {
                Vertex adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    CalculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }

    private Vertex GetLowestDistanceNode(Set<Vertex> unsettledNodes) {
        Vertex lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Vertex node : unsettledNodes) {
            int nodeDistance = node.distance;
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private void CalculateMinimumDistance(Vertex evaluationNode, Integer edgeWeigh, Vertex sourceNode) {
        Integer sourceDistance = sourceNode.distance;

        if (sourceDistance + edgeWeigh >= evaluationNode.distance)
            return;
        
        evaluationNode.distance = sourceDistance + edgeWeigh;
        LinkedList<Vertex> shortestPath = new LinkedList<>(sourceNode.shortestPath);
        shortestPath.add(sourceNode);
        evaluationNode.shortestPath = shortestPath;
    }
}
