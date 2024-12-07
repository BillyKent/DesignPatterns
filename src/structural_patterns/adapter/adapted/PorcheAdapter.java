package structural_patterns.adapter.adapted;

public class PorcheAdapter  extends VehicleAdapter{
    public PorcheAdapter() {
        super("Porche From Adapter");
    }

    @Override
    public int speedInKMH() {
        return (int) (220 * 1.6);
    }
}
