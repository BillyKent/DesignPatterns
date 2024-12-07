package structural_patterns.bridge_boilerplate_2.solution;

public class Produce implements Workshop {
    @Override
    public void work() {
        System.out.print("Produced");
    }
}
