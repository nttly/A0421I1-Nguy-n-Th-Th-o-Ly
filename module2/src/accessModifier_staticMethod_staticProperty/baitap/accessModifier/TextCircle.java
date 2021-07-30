package accessModifier_staticMethod_staticProperty.baitap.accessModifier;

public class TextCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        System.out.println("Bán kính hình tròn :"+circle.getRadius());
        System.out.println("Diện tích hình tròn: "+circle.getArea());
    }
}
