package structural_patterns.adapter_inheritance.adapters;

import structural_patterns.adapter_inheritance.legacy.Shape;
import structural_patterns.adapter_inheritance.external.Rectangle;

public class RectangleAdapter extends Rectangle implements Shape {
    public RectangleAdapter(int b, int h) {
        super(b, h);
    }

    @Override
    public String description() {
        return "A Rectangle From Adapter";
    }

    @Override
    public void resize() {
        System.out.println("Rectangle can't be resized by now");
    }

    @Override
    public void draw() {
        this.drawShape();
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
