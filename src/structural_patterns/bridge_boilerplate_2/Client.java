package structural_patterns.bridge_boilerplate_2;

import structural_patterns.bridge_boilerplate_2.boilerplate.Car;
import structural_patterns.bridge_boilerplate_2.solution.*;

public class Client {

    /***
     * Bridge es un patrón de diseño estructural que te permite dividir una clase grande,
     * o un grupo de clases estrechamente relacionadas, en dos jerarquías separadas
     * (abstracción e implementación) que pueden desarrollarse independientemente la una de la otra.
     */
    public static void main(String[] args) {

        withoutBridgePattern();
        withBridgePattern();
    }

    /**
     * Sin el uso del patron Bridge, Si creamos nuevos workshop, tendriamos que crear uno para cada vehiculo
     * De manera que se crean muchas clases. Estamos creando las clases en base a dos dimensiones: Vehiculo y Taller
     * Y Crear un nuevo vehiculo implica crear nuevos talleres, y viceversa.
     * */
    private static void withoutBridgePattern() {
        Car car = new Car();
        car.manufacture();
    }

    /**
     * Con el uso del patron Bridge, separamos e independizamos la creacion de nuevos vehiculos, y la creacion de nuevos
     * talleres. En nuestroc aso tomamos la clase Vehicle como la "Abstraccion" y la separamos de la clase Workshop, que
     * viene a ser nuestra "Implementacion". Al cambiar herencia por composición, tenemos que desglosar las dimensiones
     * de forma que encontremos una relación de composición. Para nuestro caso: UN Vehiculo se construye con (o necesita de)
     * Uno o mas talleres.
     * */
    private static void withBridgePattern() {
        Vehicle v1 = new structural_patterns.bridge_boilerplate_2.solution.Car(new Assemble(), new Produce());
        v1.manufacture();

        Vehicle v2 = new Truck(new Assemble(), new Produce(), new Paint());
        v2.manufacture();
    }


}
