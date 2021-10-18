package main;//Riana Franklin Allen
//CMSC 350 6383 Data Structures and Analysis
//Oct 12, 2021
//Should be a generic class, whose generic parameter specifies the type of the labels that are associated with the
//vertices of the graph. the internal representation of the graph should be the alternate adjacency list representation
//from figure 10.7. Unlike the graph, however, this graph will not be a weighted graph.
//Should contain a method that allows the edges to be added to the graph, which is how the main method will initially
//build the graph. It should also contain a method that performs a depth-first search of that graph.


public class DirectedGraph<T> {
   public static final int NULL_EDGE = 0;
   private static final int DEFCAP = 50; //default capacity
   private int numVertices;
   private int maxVertices;
   private T[] vertices;
   private int[][] edges;
   private boolean[] marks; //marks[i] is mark for vertices[i]

   public DirectedGraph() {
    // Instantiates a graph with capacity DEFCAP vertices.
    numVertices = 0;
    maxVertices = DEFCAP;
    vertices = (T[]) new Object[DEFCAP];
    marks = new boolean[DEFCAP];
    edges = new int[DEFCAP][DEFCAP];
   }

   public DirectedGraph(int maxV) {
    // Instantiates a graph with capacity maxV.
    numVertices = 0;
    maxVertices = maxV;
    vertices = (T[]) new Object[maxV];
    marks = new boolean[maxV];
    edges = new int[maxV][maxV];
   }

   public void addVertex(T vertex) {
    // Preconditions:   This graph is not full.
    //                  vertex is not already in this graph.
    //                  vertex is not null.
    //
    // Adds vertex to this graph.
    vertices[numVertices] = vertex;
    for (int index = 0; index < numVertices; index++) {
     edges[numVertices][index] = NULL_EDGE;
     edges[index][numVertices] = NULL_EDGE;
    }
    numVertices++;
   }

   private int indexIs(T vertex) {
    // Returns the index of vertex in vertices.
    int index = 0;
    while (!vertex.equals(vertices[index]))
     index++;
    return index;
   }

   public void addEdge(T fromVertex, T toVertex, int weight) {
    // Adds an edge with the specified weight from fromVertex to toVertex.
    int row;
    int column;
    row = indexIs(fromVertex);
    column = indexIs(toVertex);
    edges[row][column] = weight;
   }

  }
  //Method for depth first search, it should first initialize all the vertices to the undiscovered state and being the search at
  //the vertex that corresponds to the first name in the input file.

  //Method should allow the main method to display any unreachable classes by examining all the vertices of the graph
  //to see which remain undiscovered.



