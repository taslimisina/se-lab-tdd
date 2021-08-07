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

    @Test
    public void testChangeWidth() {
        Rectangle rectangle = new Rectangle(6, 7);
        rectangle.setWidth(1);
        Assert.assertNotEquals(rectangle.getWidth(), 6);
        Assert.assertEquals(rectangle.getWidth(), 1);
    }

    @Test
    public void testChangeHeight() {
        Rectangle rectangle = new Rectangle(8, 9);
        rectangle.setHeight(2);
        Assert.assertNotEquals(rectangle.getHeight(), 9);
        Assert.assertEquals(rectangle.getHeight(), 2);
    }

    @Test
    public void testComputeAreaAfterWidthChange() {
        Rectangle rectangle = new Rectangle(10, 11);
        rectangle.setWidth(2);
        Assert.assertNotEquals(rectangle.computeArea(), 110);
        Assert.assertEquals(rectangle.computeArea(), 22);
    }

    @Test
    public void testComputeAreaAfterHeightChange() {
        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.setHeight(3);
        Assert.assertNotEquals(rectangle.computeArea(), 30);
        Assert.assertEquals(rectangle.computeArea(), 15);
    }

    @Test
    public void testComputeAreaAfterWidthAndHeightChange() {
        Rectangle rectangle = new Rectangle(6, 7);
        rectangle.setWidth(5);
        rectangle.setHeight(8);
        Assert.assertNotEquals(rectangle.computeArea(), 42);
        Assert.assertEquals(rectangle.computeArea(), 40);
    }
}