import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class RectangleTest {
    Shape shape;

    @Test
    public void testComputeArea() {
        shape = new Rectangle(4, 5);
        Assert.assertEquals(shape.computeArea(), 20);
    }

}