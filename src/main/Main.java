package main;//Riana Franklin Allen
//CMSC 350 6383 Data Structures and Analysis
//Oct 12, 2021
//Allow a user to select the input file from the default directory by using the JFileChooser class. It should then add
//the edges to a directed graph that defines these class dependencies.

import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public Main() throws IOException {

        //Allows the user to select the input file from the default directory by using an object of the JFileChooser class.
        JFileChooser jfc = new JFileChooser();
        //int returnValue = jfc.showOpenDialog(null);
        FileReader fr = new FileReader(jfc.getSelectedFile());
        int read = fr.read();
        while (read != -1){

        }

    }
}
