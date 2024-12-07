package encapsulation;

// Child Class
public class Car extends Vehicle {

    // Attributes
    private float weight;
    private String color;

    public Car(float weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Methods
    public void drive() {
        System.out.println("Driving..");
    }

    public void brake() {
        System.out.println("Stopping..");
    }

}
