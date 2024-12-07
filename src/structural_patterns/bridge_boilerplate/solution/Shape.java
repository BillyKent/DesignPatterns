package structural_patterns.bridge_boilerplate.solution;

// Esta es la abstraccion
public abstract class Shape {

    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColorToShape();


}
