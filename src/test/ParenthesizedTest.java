package test;

import main.DirectedGraph;
import main.Hierarchy;
import main.Main;
import main.ParenthesizedList;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ParenthesizedTest {
    @Test()
    public void testString() throws IOException {
        String path = "src/test/resources/testClass.txt";
        File file = new File(path);
        DirectedGraph<String> graph = Main.fileReader(file);
        ParenthesizedList<String> test = new ParenthesizedList<>();
        graph.depth_first_search("Denver", test);
        String parenthesizedString = "( Denver ( Austin ))";
        assertEquals(parenthesizedString, test.toString());
    }

    @Test()
    public void testLongString() throws IOException {
        String path = "src/test/resources/ClassDependencies.txt";
        File file = new File(path);
        DirectedGraph<String> graph = Main.fileReader(file);
        ParenthesizedList<String> test = new ParenthesizedList<>();
        graph.depth_first_search("ClassA", test);
        String parenthesizedString = "( ClassA " +
                "( ClassC * " +
                "ClassE " +
                "( ClassB " +
                "( ClassD " +
                " ClassG ) " +
                "ClassF " +
                "ClassH ) " +
                " ClassJ " +
                "( ClassB " +
                "( ClassD " +
                "ClassG"+
                " ))))";
        assertEquals(parenthesizedString, test.toString());
    }
}
