package polymorphism;

public class Cat extends Animal {

    @Override
    public void makeAnimalSound() {
        System.out.println("The Cat says: Meow");
    }
}
