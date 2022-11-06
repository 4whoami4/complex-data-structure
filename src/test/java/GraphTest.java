import com.saxion.graph.Graph;
import com.saxion.graph.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GraphTest {

    private Graph graph;

    @BeforeEach
    public void Setup() {
        graph = new Graph();
        graph.AddVertex("Krzysztof");
        graph.AddVertex("Emilia");
        graph.AddVertex("Maciek");
        graph.AddVertex("Robert");
        graph.AddVertex("Marek");
        graph.AddEdge("Krzysztof", "Emilia");
        graph.AddEdge("Krzysztof", "Robert");
        graph.AddEdge("Emilia", "Maciek");
        graph.AddEdge("Robert", "Maciek");
        graph.AddEdge("Emilia", "Marek");
        graph.AddEdge("Robert", "Marek");
    }

    @Test
    public void AdjacentVertices() {
        List<Vertex> adjacent = graph.GetAdjacentVertices("Krzysztof");
        assert adjacent.size() == 2;
        assert adjacent.contains(new Vertex("Emilia"));
        assert adjacent.contains(new Vertex("Robert"));
    }
}
