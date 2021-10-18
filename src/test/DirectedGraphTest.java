package test;

import main.DirectedGraph;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectedGraphTest {

    @Test()
    public void testSimple () {
        DirectedGraph graph = new DirectedGraph();
    }

    @Test()
    public void testAddRow () {
        DirectedGraph<String> graph = new DirectedGraph();
        graph.addVertex("Denver");
        graph.addVertex("Atlanta");
        graph.addVertex("Austin");
        assertEquals(0, graph.rowIndex("Denver"));
        assertEquals(1, graph.rowIndex("Atlanta"));
        assertEquals(2, graph.rowIndex("Austin"));
    }

    @Test()
    public void testAddEdges () {
        DirectedGraph<String> graph = new DirectedGraph<>();
        graph.addVertex("Denver");
        graph.addEdge("Denver", "Austin");
        assertEquals(0,graph.columnIndex("Denver","Austin"));
    }
}
