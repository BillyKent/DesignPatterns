import abstraction.Animal;
import abstraction.Cat;
import abstraction.Dog;

public class HelloWorld {

    public static void main(String[] args) {

        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        dog1.makeAnimalSound();
        cat1.makeAnimalSound();

        cat1.sleep();
    }
}
