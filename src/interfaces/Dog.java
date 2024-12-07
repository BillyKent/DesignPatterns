package interfaces;

public class Dog implements Animal {
    @Override
    public void makeAnimalSound() {
        System.out.println("Dog is saying: Bow");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping now..");
    }
}
