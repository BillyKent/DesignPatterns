package structural_patterns.adapter_inheritance.legacy;

public class Circle implements Shape {
    @Override
    public String description() {
        return "A Circle";
    }

    @Override
    public void resize() {
        System.out.println("Resizing Circle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
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
