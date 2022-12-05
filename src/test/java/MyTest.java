import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class MyTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final List<String> testList = List.of("1", "2", "Foo", "4", "Bar", "Foo", "7",
            "1", "2", "Foo", "4", "Bar", "Foo", "7",
            "1", "2", "Foo", "4", "Bar", "Foo", "7");

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testString() {
        int count = 8;
        List<String> list = new ArrayList<>();
        Main.solution1(count);
        Main.solution2(count);
        Main.solution3(count);
        list.add(output.toString());
        if (list.size() == (count - 1) * 3) {
            Assert.assertEquals(testList, list);
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
