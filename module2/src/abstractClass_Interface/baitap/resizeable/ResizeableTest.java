package abstractClass_Interface.baitap.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(3);
        shapes[2] = new Rectangle(3,4);
        System.out.println("before increase percent");
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + " " + shape.getArea());
        }
        for (Shape shape : shapes) {
            shape.resize(Math.floor(Math.random() * 5 + 10));
        }
        System.out.println("after increase percent");
        for (Shape shape : shapes) {
            System.out.println(" " + shape.getArea());
        }
    }
}
