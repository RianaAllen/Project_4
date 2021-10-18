package main;//Riana Franklin Allen
//CMSC 350 6383 Data Structures and Analysis
//Oct 12, 2021
//Should be a generic class, whose generic parameter specifies the type of the labels that are associated with the
//vertices of the graph. the internal representation of the graph should be the alternate adjacency list representation
//from figure 10.7. Unlike the graph, however, this graph will not be a weighted graph.
//Should contain a method that allows the edges to be added to the graph, which is how the main method will initially
//build the graph. It should also contain a method that performs a depth-first search of that graph.


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DirectedGraph<T> {

   private List<T> vertices;
   private List<List<T>> edges;
   private List<Boolean> marks; //marks[i] is mark for vertices[i]

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectedGraph<?> that = (DirectedGraph<?>) o;
        return Objects.equals(vertices, that.vertices) && Objects.equals(edges, that.edges);
    }

    @Override
    public String toString() {
        return "DirectedGraph{" +
                "vertices=" + vertices +
                ", edges=" + edges +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(vertices, edges);
    }

    public DirectedGraph() {
    // Instantiates a graph.
    vertices = new ArrayList<>();
    marks = new ArrayList<>();
    edges = new ArrayList<>();
   }

   public void addVertex(T vertex) {
     vertices.add(vertex);
       List<T> newEdge = new ArrayList<>();
       edges.add(newEdge);
   }

   public int rowIndex(T vertex) {
    // Returns the index of vertex in vertices.
    return vertices.indexOf(vertex);
   }

   public int columnIndex (T fromVertex, T toVertex){
       //returns the column of a row
       int fromIndex  = vertices.indexOf(fromVertex);
       if (fromIndex != -1){
           List<T> toEdges = edges.get(fromIndex);
           return toEdges.indexOf(toVertex);
       } else {
           return -1;
       }
   }

   public void addEdge(T fromVertex, T toVertex) {
    // Adds an edge from fromVertex to toVertex.
    int row = rowIndex(fromVertex);
    int column = columnIndex(fromVertex, toVertex);
    if (row == -1){
        vertices.add(fromVertex);
        List<T> newEdge = new ArrayList<>();
        newEdge.add(toVertex);
        edges.add(newEdge);
    }
    if (column == -1){
        List<T> toEdges = edges.get(row);
        toEdges.add(toVertex);
    }
   }

  }
  //Method for depth first search, it should first initialize all the vertices to the undiscovered state and being the search at
  //the vertex that corresponds to the first name in the input file.

  //Method should allow the main method to display any unreachable classes by examining all the vertices of the graph
  //to see which remain undiscovered.



