package abstractClass_Interface.thuchanh.lopAnimal_va_interface.animal;

import abstractClass_Interface.thuchanh.lopAnimal_va_interface.edible.Edible;
import abstractClass_Interface.thuchanh.lopAnimal_va_interface.animal.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}