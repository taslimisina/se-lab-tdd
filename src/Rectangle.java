public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int computeArea() {
        return width * height;
    }

    public int getWidth() {
        return 0;
    }

    public void setWidth(int width) { }

    public int getHeight() {
        return 0;
    }

    public void setHeight(int height) { }
}
