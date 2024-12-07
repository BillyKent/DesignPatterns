package structural_patterns.adapter.legacy;


/**
 * La clase Vehicle esta creada para crear clases que muestren en pantalla
 * su velocidad en millas por hora (MPH)
 *
 * */
public abstract class Vehicle {

    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract int getSpeed();

    public String showDisplay() {
        return brand + " : " + getSpeed() + " MPH";
    }
}
