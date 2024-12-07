package structural_patterns.composite_box;

public class ElectronicProduct extends Product {

    private String model;

    public ElectronicProduct(String name, Double price, String model) {
        super(name, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double computePrice() {
        return getPrice();
    }

    @Override
    public void describe() {
        System.out.println("Producto electrónico [" + getName() + "-" + model + "] con precio: " + computePrice());
    }
}
