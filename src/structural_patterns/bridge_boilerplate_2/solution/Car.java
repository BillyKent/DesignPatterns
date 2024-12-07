package structural_patterns.bridge_boilerplate_2.solution;

public class Car extends Vehicle {

    public Car(Workshop assembleWorkshop, Workshop produceWorkshop) {
        super(assembleWorkshop, produceWorkshop);
    }

    @Override
    public void manufacture() {
        System.out.print("Car ");
        assembleWorkshop.work();
        System.out.print(" And ");
        produceWorkshop.work();
        System.out.print("\n");
    }
}
