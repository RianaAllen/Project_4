package main;
//generic interface named DFSActions, whose generic parameter again specifies the type of the labels that are
// associated with the vertices of the graph.
// contain 4 method signatures that correspond with the four actions performed in the depth first search: cycle detect
//process vertex, descend, and ascend.
public interface DFSActions<T> {
    boolean isEmpty();

    //returns true if this graph is empty; otherwise returns false
    boolean isFull();

    //returns true if this graph is full; otherwise returns false
    void addVertex(T vertex);

    //Preconditions: This graph is not full
    //               vertex is not already in this graph
    //               vertex is not null
    //Adds vertex to this graph
    boolean hasVertex(T vertex);

    //Returns true if this graph contains vertex; otherwise returns false
    boolean addEdge(T fromVertex, T toVertex);

    //Adds an edge from fromVertex totoVertex
    //QueueInterface<T> getToVertices(T vertex);

    //Returns a queue of the vertices that vertex is adjacent to
    void clearMarks();

    //unmarks all vertices.
    void markVertex(T vertex);

    //marks vertex
    boolean isMarked(T vertex);

    //returns true if vertex is marked; otherwise returns false.
    T getUnmarked();
    //Returns an unmarked vertex if any exist; otherwise returns null
}