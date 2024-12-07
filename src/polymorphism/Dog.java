package polymorphism;

public class Dog extends Animal {

    @Override
    public void makeAnimalSound() {
        System.out.println("The Dog says: Bow");
    }
}
