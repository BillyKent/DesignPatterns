package structural_patterns.bridge_boilerplate_2.solution;

public class Bike extends Vehicle {

    public Bike(Workshop assembleWorkshop, Workshop produceWorkshop) {
        super(assembleWorkshop, produceWorkshop);
    }

    @Override
    public void manufacture() {
        System.out.print("Bike ");
        assembleWorkshop.work();
        System.out.print(" And ");
        produceWorkshop.work();
        System.out.print("\n");
    }
}
