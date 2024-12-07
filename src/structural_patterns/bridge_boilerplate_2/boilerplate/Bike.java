package structural_patterns.bridge_boilerplate_2.boilerplate;

public class Bike extends Vehicle {
    @Override
    public void manufacture() {
        BikeAssembleWorkshop w1 = new BikeAssembleWorkshop();
        BikeProduceWorkshop w2 = new BikeProduceWorkshop();

        w1.assemble();
        w2.produce();

    }
}
