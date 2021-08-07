import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SquareTest {

    @Test
    public void testComputeArea() {
        Shape shape = new Square(4);
        Assert.assertEquals(shape.computeArea(), 16);
    }

    @Test
    public void testChangeSide() {
        Square square = new Square(4);
        square.setSide(2);
        Assert.assertNotEquals(square.getSide(), 4);
        Assert.assertEquals(square.getSide(), 2);
    }

    @Test
    public void testComputeAreaAfterSideChange() {
        Square square = new Square(4);
        square.setSide(3);
        Assert.assertNotEquals(square.computeArea(), 16);
        Assert.assertEquals(square.computeArea(), 9);
    }

}