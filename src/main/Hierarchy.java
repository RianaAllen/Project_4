//Riana Franklin Allen
//CMSC 350 6383 Data Structures and Analysis
//Oct 12, 2021
//Implement the interface. Hierarchy, should produce a hierarchical representation of the class dependencies
//should override toString method.

package main;

public class Hierarchy<T> implements DFSActions<T>{
    @Override
    public void cycleDetected() {

    }

    @Override
    public void addVertex(T vertex) {
        String hierarchy = null;
        vertex.toString();

    }

    @Override
    public void performDescend() {

    }

    @Override
    public void performAscend() {

    }
}
