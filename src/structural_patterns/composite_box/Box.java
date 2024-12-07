package structural_patterns.composite_box;

import java.util.ArrayList;
import java.util.Optional;

public class Box implements IProductComponent {

    private ArrayList<IProductComponent> children;

    public Box() {
        children = new ArrayList<>();
    }

    public void addElement(IProductComponent element) {
        children.add(element);
    }

    public void removeElement(IProductComponent element) {
        children.remove(element);
    }

    @Override
    public double computePrice() {
        Optional<Double> computedTotal = children.stream()
                .map(pc -> pc.computePrice())
                .reduce((first, second) -> first + second);
        return computedTotal.orElse(0.0);
    }

    @Override
    public void describe() {
        System.out.println("Caja con valor: " + computePrice());
    }
}
