package structural_patterns.adapter_composition.legacy;

public class Line implements Shape{
    @Override
    public String description() {
        return "A line";
    }

    @Override
    public void resize() {
        System.out.println("Resizing Line");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Line");
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
