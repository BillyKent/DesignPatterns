package structural_patterns.adapter_inheritance.external;

public class Rectangle implements GeometricShape {

    int b;
    int h;

    public Rectangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return b * h;
    }

    @Override
    public double perimeter() {
        return 2 * (b + h);
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing Rectangle with area: " + area() + " and perimeter: " + perimeter());
    }
}
