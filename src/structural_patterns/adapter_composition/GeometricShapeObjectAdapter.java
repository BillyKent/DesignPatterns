package structural_patterns.adapter_composition;

import structural_patterns.adapter_composition.legacy.Shape;
import structural_patterns.adapter_composition.external.GeometricShape;
import structural_patterns.adapter_composition.external.Rectangle;
import structural_patterns.adapter_composition.external.Triangle;

public class GeometricShapeObjectAdapter implements Shape {

    // Also called adaptee
    private GeometricShape geometricShape;

    public GeometricShapeObjectAdapter(GeometricShape geometricShape) {
        this.geometricShape = geometricShape;
    }

    @Override
    public String description() {
        if (geometricShape instanceof Triangle) {
            return "A Triangle";
        } else if (geometricShape instanceof Rectangle) {
            return "A Rectangle";
        } else {
            return "A Unknown Shape";
        }
    }

    @Override
    public void resize() {
        System.out.println("Cannot be resized");
    }

    @Override
    public void draw() {
        geometricShape.drawShape();
    }

    @Override
    public boolean isHide() {
        return false;
    }

    @Override
    public boolean isSelected() {
        return false;
    }
}
