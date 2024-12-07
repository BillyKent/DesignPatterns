package structural_patterns.bridge_boilerplate;

import structural_patterns.bridge_boilerplate.boilerplate.*;
import structural_patterns.bridge_boilerplate.boilerplate.Shape;
import structural_patterns.bridge_boilerplate.solution.*;

public class Client {

    public static void main(String[] args) {
        // withoutBridgePattern();
        withBridgePattern();
    }

    /**
     * Sin el uso del patron Bridge, la abstraccion de la clase Shape, que tiene dos parametros
     * en su constructor (color y shape), genera boilerplate al agregar nuevos colores y formas.
     * Suponiendo que mañana o mas tarde, se agrega el color morado (Purple), se tendria que crear
     * una clase para el Circulo y otra para el Cuadrado: PurpleCircle y PurpleSquare.
     * De momento no es tan grave.
     * Pero si despues tenemos que agregar otro shape, por ejemplo Rhombus (rombo). Se tendría que crear
     * tres subclases: OrangeRhombus, RedRhombus, y PurpleRhombus. de modo que crece exponencialmente
     * la cantidad de clases para soportar una forma con diferente color.
     */
    private static void withoutBridgePattern() {

        Shape s1 = new OrangeCircle();
        Shape s2 = new OrangeSquare();
        Shape s3 = new RedCircle();
        Shape s4 = new RedSquare();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }


    /**
     * Con el uso del patron Bridge, se elimina el boilerplate cambiando la manera de crear nuevas clases Shape
     * de utilizar herencia, a utilizar composicion, de forma que se creen nuevos shapes, de forma independiente
     * a la creacion de nuevas clases Color. Si mañana o más tarde se crea un nuevo color, o un nuevo shape, se podría
     * hacer sin afectar o tener que crear nuevas clases obligatoriamente
     */
    private static void withBridgePattern() {
        structural_patterns.bridge_boilerplate.solution.Shape s1 = new Circle(new BlueColor());
        s1.applyColorToShape();

        structural_patterns.bridge_boilerplate.solution.Shape s2 = new Rhombus(new PurpleColor());
        s2.applyColorToShape();

        structural_patterns.bridge_boilerplate.solution.Shape s3 = new Square(new RedColor());
        s3.applyColorToShape();

        structural_patterns.bridge_boilerplate.solution.Shape s4 = new Rhombus(new YellowColor());
        s4.applyColorToShape();


    }
}
