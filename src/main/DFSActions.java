//Riana Franklin Allen
//CMSC 350 6383 Data Structures and Analysis
//Oct 12, 2021

//generic interface named DFSActions, whose generic parameter again specifies the type of the labels that are
// associated with the vertices of the graph.
// contain 4 method signatures that correspond with the four actions performed in the depth first search: cycle detect
//process vertex, descend, and ascend.
package main;

public interface DFSActions<T> {

    void cycleDetected();
    //Returns an unmarked vertex if any exist; otherwise returns null

    void addVertex(T vertex);

    void performDescend();

    void performAscend();



}