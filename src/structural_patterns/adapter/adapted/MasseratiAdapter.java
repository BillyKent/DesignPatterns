package structural_patterns.adapter.adapted;

public class MasseratiAdapter extends VehicleAdapter {
    public MasseratiAdapter() {
        super("Masserati From Adapter");
    }

    @Override
    public int speedInKMH() {
        return (int) (200 * 1.6);
    }
}
