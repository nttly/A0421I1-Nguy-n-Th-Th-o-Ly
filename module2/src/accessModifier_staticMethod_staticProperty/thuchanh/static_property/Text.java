package accessModifier_staticMethod_staticProperty.thuchanh.static_property;

public class Text {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6", "Skyative 6");
        System.out.println(Car.numberOfCars);
    }
}
