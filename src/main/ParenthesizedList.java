//Riana Franklin Allen
//CMSC 350 6383 Data Structures and Analysis
//Oct 12, 2021
//Implement the interface. ParenthesizedList should produce an alternate representation
// that is also returned by toString method.

package main;

public class ParenthesizedList<T> implements DFSActions<T> {
    StringBuilder parenthesize = new StringBuilder();
    boolean descend = true;

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
        if (descend == true){
            parenthesize.append("(");
            descend = false;
        }
        parenthesize.append(" " + vertex + " " );
    }

    @Override
    public void performDescend() {
        descend = true;
    }

    @Override
    public void performAscend() {
        parenthesize.append(")");
    }
}

