package structural_patterns.adapter.adapted;

public class BuggatiAdapter extends VehicleAdapter {
    public BuggatiAdapter() {
        super("Buggati From Adapter");
    }

    @Override
    public int speedInKMH() {
        return (int) (240 * 1.6);
    }
}
