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
        String hierarchyString = "Denver\n"
                               + "    Austin\n";
        assertEquals(hierarchyString, test.toString());
    }

    @Test()
    public void testLongString() throws IOException {
        String path = "src/test/resources/ClassDependencies.txt";
        File file = new File(path);
        DirectedGraph<String> graph = Main.fileReader(file);
        Hierarchy<String> test = new Hierarchy<>();
        graph.depth_first_search("ClassA", test);
        String hierarchyString = "\nClassA\n" +
                                 "    ClassC *\n" +
                                 "    ClassE\n" +
                                 "        ClassB\n" +
                                 "            ClassD\n" +
                                 "            ClassG\n" +
                                 "        ClassF\n" +
                                 "        ClassH\n" +
                                 "    ClassJ\n" +
                                 "        ClassB\n" +
                                 "            ClassD\n" +
                                 "            ClassG";
        assertEquals(hierarchyString, test.toString());
    }
}
