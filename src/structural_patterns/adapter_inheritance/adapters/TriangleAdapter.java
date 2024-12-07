package structural_patterns.adapter_inheritance.adapters;

import structural_patterns.adapter_inheritance.legacy.Shape;
import structural_patterns.adapter_inheritance.external.Triangle;

public class TriangleAdapter extends Triangle implements Shape {
    public TriangleAdapter(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public String description() {
        return "A Triangle From Adapter";
    }

    @Override
    public void resize() {
        System.out.println("Triangle can't be resized by now");
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
