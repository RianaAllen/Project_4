package main;

//ParenthesizedList should produce an alternate representation that is also returned by toString method.
public class ParenthesizedList<T> implements DFSActions<T> {

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

    //@Override
    //public QueueInterface<T> getToVertices(T vertex) {
     //   return null;
    //}

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

