package structural_patterns.bridge_boilerplate.solution;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColorToShape() {
        System.out.print("Square filled with color ");
        color.applyColor();
    }
}
