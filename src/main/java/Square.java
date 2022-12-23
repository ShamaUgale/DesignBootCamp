public class Square implements Shape {

    int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return 0;
    }

    @Override
    public int perimeter() {
        return 0;
    }
}
