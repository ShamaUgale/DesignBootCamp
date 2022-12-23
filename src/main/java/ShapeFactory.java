public class ShapeFactory {

    public Shape createShape(String shape) throws IllegalAccessException {
        if(shape.equals(Shape.RECTANGLE)){
            return new Rectangle();
        }else if(shape.equals(Shape.SQUARE)){
            return new Square();
        }else{
            throw new IllegalAccessException("The shape cannot be null");
        }
    }
}
