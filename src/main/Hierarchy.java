package main;
//two additional classes that both implement the interface.
//Hierarchy, should produce a hierarchical representation of the class dependencies
//should override toString method.

public class Hierarchy<T> implements DFSActions<T>{

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void addVertex(T vertex) {

    }

    @Override
    public boolean hasVertex(T vertex) {
        return false;
    }

    @Override
    public boolean addEdge(T fromVertex, T toVertex) {
        return false;
    }
/*
    @Override
    public QueueInterface<T> getToVertices(T vertex) {
        return null;
    }
*/
    @Override
    public void clearMarks() {

    }

    @Override
    public void markVertex(T vertex) {

    }

    @Override
    public boolean isMarked(T vertex) {
        return false;
    }

    @Override
    public T getUnmarked() {
        return null;
    }
}
