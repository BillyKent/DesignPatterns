package structural_patterns.adapter.adapted;

import structural_patterns.adapter.AdapterService;
import structural_patterns.adapter.legacy.Vehicle;

/**
 * Con esta clase Adapter, crearemos objetos que muestren por pantalla
 * su velocidad PERO, en kilometros por hora (KMH)
 */
public abstract class VehicleAdapter extends Vehicle implements AdapterService {
    public VehicleAdapter(String brand) {
        super(brand);
    }

    @Override
    public int getSpeed() {
        return speedInKMH();
    }

    @Override
    public String showDisplay() {
        return getBrand() + " : " + getSpeed() + " KMH";
    }

}
