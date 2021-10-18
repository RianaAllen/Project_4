package main;
//two additional classes that both implement the interface.
//Hierarchy, should produce a hierarchical representation of the class dependencies
//should override toString method.

public class Hierarchy<T> implements DFSActions<T>{
    @Override
    public void cycleDetected() {

    }

    @Override
    public void addVertex(T vertex) {

    }

    @Override
    public void performDescend() {

    }

    @Override
    public void performAscend() {

    }
}
