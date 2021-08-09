package abstractClass_Interface.thuchanh.lopAnimal_va_interface;
import abstractClass_Interface.thuchanh.lopAnimal_va_interface.animal.Animal;
import abstractClass_Interface.thuchanh.lopAnimal_va_interface.animal.Chicken;
import abstractClass_Interface.thuchanh.lopAnimal_va_interface.animal.Tiger;
import abstractClass_Interface.thuchanh.lopAnimal_va_interface.edible.Edible;
import abstractClass_Interface.thuchanh.lopAnimal_va_interface.fruit.Fruit;
import abstractClass_Interface.thuchanh.lopAnimal_va_interface.fruit.Apple;
import abstractClass_Interface.thuchanh.lopAnimal_va_interface.fruit.Orange;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());

        }
    }
}