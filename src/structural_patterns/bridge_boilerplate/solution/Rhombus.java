package structural_patterns.bridge_boilerplate.solution;

public class Rhombus extends Shape {
    public Rhombus(Color color) {
        super(color);
    }

    @Override
    public void applyColorToShape() {
        System.out.print("Rhombus filled with color ");
        color.applyColor();
    }
}
