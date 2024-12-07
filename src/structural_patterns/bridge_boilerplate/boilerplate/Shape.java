package structural_patterns.bridge_boilerplate.boilerplate;

public abstract class Shape {

    String color;
    String shape;

    public Shape(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "The shape is " + color + " " + shape;
    }
}
