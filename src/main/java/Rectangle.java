public class Rectangle implements Shape{

    int width;
    int length;

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return getWidth() * getLength();
    }

    @Override
    public int perimeter() {
        return 0;
    }
}