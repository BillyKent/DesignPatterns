package structural_patterns.adapter.legacy;

public class Buggati extends Vehicle {
    public Buggati() {
        super("Buggati");
    }

    @Override
    public int getSpeed() {
        return 240;
    }
}
