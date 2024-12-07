package structural_patterns.composite_box;

public class Client {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        ElectronicProduct ipadAir = new ElectronicProduct("iPad", 4000d, "Air");
        ElectronicProduct ipadMini = new ElectronicProduct("iPad", 2500d, "Mini");
        ElectronicProduct iphone = new ElectronicProduct("iPhone", 7000d, "14");

        WeighableProduct papasNativas = new WeighableProduct("Papas nativas", 4d, 5d); // 20
        WeighableProduct happyBrownie = new WeighableProduct("Happy Brownie", 20d, 3d); // 60


        ipadAir.describe();
        ipadMini.describe();
        iphone.describe();
        papasNativas.describe();
        happyBrownie.describe();

        Box cajaSmall = new Box();
        cajaSmall.addElement(papasNativas);
        cajaSmall.addElement(iphone);
        cajaSmall.describe();

        Box cajaMedium = new Box();
        cajaMedium.addElement(ipadAir);
        cajaMedium.addElement(ipadMini);
        cajaMedium.describe();

        Box cajaLarge = new Box();
        cajaLarge.addElement(cajaSmall);
        cajaLarge.addElement(cajaMedium);
        cajaLarge.addElement(happyBrownie);
        cajaLarge.describe();

        cajaLarge.removeElement(cajaMedium);
        cajaLarge.describe();
    }

}
