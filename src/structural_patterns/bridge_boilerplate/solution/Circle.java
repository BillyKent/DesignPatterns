package structural_patterns.bridge_boilerplate.solution;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColorToShape() {
        System.out.print("Circle filled with color ");
        color.applyColor();
    }
}
