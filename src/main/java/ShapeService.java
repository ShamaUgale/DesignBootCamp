public class ShapeService {
    public static void main(String[] args) throws IllegalAccessException {
        ShapeFactory factory = new ShapeFactory();
        Shape rectangle = factory.createShape("RECTANGLE");
        int area = rectangle.area();
        System.out.println("Area of Rectangle : " + area);
    }
}