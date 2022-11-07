import com.saxion.graph.Graph;
import com.saxion.graph.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

public class GraphTest {

    private Graph graph;

    @BeforeEach
    public void Setup() {
        graph = new Graph();

        graph.AddVertex(1, 2);
        graph.AddVertex(2, 3);
        graph.AddVertex(4, 3);
        graph.AddEdge(4, 3, 2, 3);
    }

    @Test
    public void AddVertex() {
        assert graph.GetVertices().size() == 3;
        graph.AddVertex(1, 1);
        assert graph.GetVertices().size() == 4;
    }

    @Test
    public void RemoveVertex() {
        assert graph.GetVertices().size() == 3;
        graph.RemoveVertex(1, 2);
        assert graph.GetVertices().size() == 2;
    }

    @Test
    public void AddEdge() {
        graph.AddEdge(1, 2, 4, 3);
        List<Vertex> adjacentVertices = graph.GetAdjacentVertices(1, 2);
        assert adjacentVertices.size() == 1;
    }

    @Test
    public void RemoveEdge() {
        graph.RemoveEdge(1, 2, 2, 3);
        List<Vertex> adjacentVertices = graph.GetAdjacentVertices(1, 2);
        assert adjacentVertices.size() == 0;
    }

    @Test
    public void AdjacentVertices() {
        List<Vertex> adjacent = graph.GetAdjacentVertices(4, 3);
        assert adjacent.size() == 1;
    }

    @Test
    public void BreadthFirstTraversal() {
        Set<Vertex> traversed = graph.BreadthFirstTraversal(graph, new Vertex(4, 3));
        assert traversed.size() == 2;
    }

    @Test
    public void DepthFirstTraversal() {
        Set<Vertex> traversed = graph.DepthFirstTraversal(graph, new Vertex(4, 3));
        assert traversed.size() == 2;
    }
}
