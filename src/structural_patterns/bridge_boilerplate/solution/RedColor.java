package structural_patterns.bridge_boilerplate.solution;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Red");
    }
}
