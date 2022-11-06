package com.saxion.backtracking;

public class HamiltonianCycle {

    private final int V;

    public HamiltonianCycle() {
        this.V = 5;
    }

    public HamiltonianCycle(int V) {
        this.V = V;
    }

    public boolean IsSafe(int v, int[][] graph, int[] path, int pos) {
        if (graph[path[pos - 1]][v] == 0)
            return false;

        for (int i = 0; i < pos; i++) {
            if (path[i] == v)
                return false;
        }
        return true;
    }

    public boolean HamiltonianCycleUtil(int[][] graph, int[] path, int pos) {
        if (pos == V)
            return graph[path[pos - 1]][path[0]] == 1;

        for (int v = 1; v < V; v++) {
            if (!IsSafe(v, graph, path, pos))
                continue;

            path[pos] = v;

            if (HamiltonianCycleUtil(graph, path, pos + 1))
                return true;

            path[pos] = -1;
        }
        return false;
    }

    public int[] GetHamiltonianCycle(int[][] graph) {
        int[] path = new int[V];
        for (int i = 0; i < V; i++)
            path[i] = -1;

        path[0] = 0;
        if (!HamiltonianCycleUtil(graph, path, 1)) {
            throw new RuntimeException("Solution does not exist");
        }

        return path;
    }
}
