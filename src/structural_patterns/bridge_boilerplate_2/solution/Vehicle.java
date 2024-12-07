package structural_patterns.bridge_boilerplate_2.solution;

// Abstraction
public abstract class Vehicle {

    Workshop assembleWorkshop;

    Workshop produceWorkshop;

    public Vehicle(Workshop assembleWorkshop, Workshop produceWorkshop) {
        this.assembleWorkshop = assembleWorkshop;
        this.produceWorkshop = produceWorkshop;
    }

    public abstract void manufacture();
}
