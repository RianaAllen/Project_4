//Riana Franklin Allen
//CMSC 350 6383 Data Structures and Analysis
//Oct 12, 2021
//Implement the interface.ParenthesizedList should produce an alternate representation
// that is also returned by toString method.

package main;

public class ParenthesizedList<T> implements DFSActions<T> {
    StringBuilder parenthesize = new StringBuilder();
    int level = 0;

    @Override
    public String toString() {
        return parenthesize.toString();
    }

    @Override
    public void cycleDetected() {
        parenthesize.append("*");
    }

    @Override
    public void addVertexAction(T vertex) {
        parenthesize.append(" " + vertex + " " );
    }

    @Override
    public void performDescend() {
        parenthesize.append("(");

    }

    @Override
    public void performAscend() {
        parenthesize.append(")");
    }
}

