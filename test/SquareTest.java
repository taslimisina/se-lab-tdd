import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SquareTest {
    private Square square;

    @Before
    public void init() {
        square = new Square(4);
    }

    @Test
    public void testComputeArea() {
        Shape shape = square;
        Assert.assertEquals(shape.computeArea(), 16);
    }

    @Test
    public void testChangeSide() {
        square.setSide(2);
        Assert.assertNotEquals(square.getSide(), 4);
        Assert.assertEquals(square.getSide(), 2);
    }

    @Test
    public void testComputeAreaAfterSideChange() {
        square.setSide(3);
        Assert.assertNotEquals(square.computeArea(), 16);
        Assert.assertEquals(square.computeArea(), 9);
    }

}