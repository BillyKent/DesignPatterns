package structural_patterns.bridge_boilerplate_2.solution;

public class Truck extends Vehicle {

    private Workshop paintWorkshop;
    public Truck(Workshop assembleWorkshop, Workshop produceWorkshop, Workshop paintWorkshop) {
        super(assembleWorkshop, produceWorkshop);
        this.paintWorkshop = paintWorkshop;
    }

    @Override
    public void manufacture() {
        System.out.print("Car ");
        assembleWorkshop.work();
        System.out.print(" And ");
        produceWorkshop.work();
        System.out.print(" And ");
        paintWorkshop.work();
        System.out.print("\n");
    }
}
