package structural_patterns.bridge_boilerplate_2.solution;

public class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.print("Assembled");
    }
}
