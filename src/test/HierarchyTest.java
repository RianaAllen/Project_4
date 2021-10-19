//Riana Franklin Allen
//CMSC 350 6383 Data Structures and Analysis
//Oct 12, 2021

package test;

import main.DirectedGraph;
import main.Hierarchy;
import main.Main;
import org.junit.Test;
import java.io.*;
import java.net.URL;
import static org.junit.Assert.assertEquals;

public class HierarchyTest {
    @Test()
    public void testString() throws IOException {
        String path = "src/test/resources/testClass.txt";
        File file = new File(path);
        DirectedGraph<String> graph = Main.fileReader(file);
        Hierarchy<String> test = new Hierarchy<>();
        graph.depth_first_search("Denver", test);
        String hierarchyString = "Denver/n/tAustin";
        assertEquals(hierarchyString, test.toString());
    }
}
