//Riana Franklin Allen
//CMSC 350 6383 Data Structures and Analysis
//Oct 12, 2021
//Implement the interface. Hierarchy, should produce a hierarchical representation of the class dependencies
//should override toString method.

package main;

public class Hierarchy<T> implements DFSActions<T>{
    StringBuilder hierarchy = new StringBuilder();
    int level = 0;

    @Override
    public String toString() {
        return hierarchy.toString();
    }

    @Override
    public void cycleDetected() {
        hierarchy.append(" *");
    }

    @Override
    public void addVertexAction(T vertex) {
        hierarchy.append("\n");
        for (int i = 0; i < level; i++){
            hierarchy.append("    ");
        }
        hierarchy.append(vertex.toString());

    }

    @Override
    public void performDescend() {
        ++level;
    }

    @Override
    public void performAscend() {
        --level;

    }


}
