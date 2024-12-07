package structural_patterns.adapter.legacy;

public class Porche extends Vehicle {
    public Porche() {
        super("Porche");
    }

    @Override
    public int getSpeed() {
        return 220;
    }
}
