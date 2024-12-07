package structural_patterns.composite_box;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WeighableProduct extends Product {

    private double weigh;

    public WeighableProduct(String name, Double price, double weigh) {
        super(name, price);
        this.weigh = weigh;
    }

    @Override
    public double computePrice() {
        return BigDecimal.valueOf(weigh)
                .multiply(BigDecimal.valueOf(getPrice()))
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

    @Override
    public void describe() {
        System.out.print("Producto pesable [" + getName() + "] ");
        System.out.print("[" + weigh + "KG] ");
        System.out.print("[Precio por KG:" + getPrice() + "] ");
        System.out.println("con precio: " + computePrice());
    }

}
