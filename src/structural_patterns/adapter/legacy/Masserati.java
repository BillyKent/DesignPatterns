package structural_patterns.adapter.legacy;

public class Masserati extends Vehicle {

    public Masserati() {
        super("Masserati");
    }

    @Override
    public int getSpeed() {
        return 200;
    }
}
