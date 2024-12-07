package interfaces;

public class Cat implements Animal {
    @Override
    public void makeAnimalSound() {
        System.out.println("Cat is saying: Meow");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping now..");
    }
}
