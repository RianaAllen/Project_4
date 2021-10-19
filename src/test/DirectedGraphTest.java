//Riana Franklin Allen
//CMSC 350 6383 Data Structures and Analysis
//Oct 12, 2021

package test;

import main.DirectedGraph;
import main.Main;
import org.junit.Test;
import java.io.*;
import java.net.URL;
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

    @Test()
    public void testFindFile () throws IOException {
        String path = "src/test/resources/testClass.txt";
        File file = new File(path);
        DirectedGraph graph = Main.fileReader(file);
        DirectedGraph<String> testGraph = new DirectedGraph<>();
        testGraph.addVertex("Denver");
        testGraph.addEdge("Denver", "Austin");
        assertEquals(testGraph, graph);
    }
    @Test()
    public void testTestGraph() throws IOException {
        String path = "src/test/resources/ClassDependencies.txt";
        File file = new File(path);
        DirectedGraph graph = Main.fileReader(file);
        DirectedGraph<String> testGraph = new DirectedGraph<>();
        testGraph.addVertex("ClassA");
        testGraph.addEdge("ClassA", "ClassC");
        testGraph.addEdge("ClassA", "ClassE");
        testGraph.addEdge("ClassA", "ClassJ");
        testGraph.addVertex("ClassB");
        testGraph.addEdge("ClassB", "ClassD");
        testGraph.addEdge("ClassB", "ClassG");
        testGraph.addVertex("ClassC");
        testGraph.addEdge("ClassC", "ClassA");
        testGraph.addVertex("ClassE");
        testGraph.addEdge("ClassE", "ClassB");
        testGraph.addEdge("ClassE", "ClassF");
        testGraph.addEdge("ClassE", "ClassH");
        testGraph.addVertex("ClassJ");
        testGraph.addEdge("ClassJ", "ClassB");
        testGraph.addVertex("ClassI");
        testGraph.addEdge("ClassI", "ClassC");
        assertEquals(testGraph, graph);
    }
}
