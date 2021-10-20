//Riana Franklin Allen
//CMSC 350 6383 Data Structures and Analysis
//Oct 12, 2021
//Allow a user to select the input file from the default directory by using the JFileChooser class. It should then add
//the edges to a directed graph that defines these class dependencies.
package main;
import javax.swing.*;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //Allows the user to select the input file from the default directory by using an object of the JFileChooser class.
        JFileChooser jfc = new JFileChooser();
        File file = jfc.getSelectedFile();
        int returnValue = jfc.showOpenDialog(null);
        FileReader fileToRead = new FileReader(file);
        BufferedReader br = new BufferedReader(fileToRead);
        String eachLine = br.readLine();
        DirectedGraph<String> graph = new DirectedGraph();
        while (eachLine != null) {
            StringTokenizer tokenLine = new StringTokenizer(eachLine, " ", false);
            if (tokenLine.hasMoreElements()) {
                String token = tokenLine.nextToken();
                String vertex = token;
                graph.addVertex(vertex);
                while (tokenLine.hasMoreElements()) {
                    //    get the next token, add edges
                    token = tokenLine.nextToken();
                    graph.addEdge(vertex, token);
                }
            }
            eachLine = br.readLine();
        }
        System.out.println(graph);
    }

    public static DirectedGraph<String> fileReader(File file) throws IOException {FileReader fileToRead = new FileReader(file);
        BufferedReader br = new BufferedReader(fileToRead);
        String eachLine = br.readLine();
        DirectedGraph graph = new DirectedGraph();
        while (eachLine != null) {
            StringTokenizer tokenLine = new StringTokenizer(eachLine, " ", false);
            if (tokenLine.hasMoreElements()) {
                String token = tokenLine.nextToken();
                String vertex = token;
                graph.addVertex(vertex);
                while (tokenLine.hasMoreElements()) {
                    //    get the next token, add edges
                    token = tokenLine.nextToken();
                    graph.addEdge(vertex, token);
                }
            }
            eachLine = br.readLine();
        }
        return graph;
    }
}
