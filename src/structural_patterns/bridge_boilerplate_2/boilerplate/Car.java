package structural_patterns.bridge_boilerplate_2.boilerplate;

public class Car extends Vehicle {
    @Override
    public void manufacture() {
        CarAssembleWorkshop w1 = new CarAssembleWorkshop();
        CarProduceWorkshop w2 = new CarProduceWorkshop();

        w1.assemble();
        w2.produce();

    }
}
