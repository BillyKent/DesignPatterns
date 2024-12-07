package structural_patterns.adapter_inheritance;


import structural_patterns.adapter_inheritance.adapters.TriangleAdapter;
import structural_patterns.adapter_inheritance.external.GeometricShape;
import structural_patterns.adapter_inheritance.external.Rectangle;
import structural_patterns.adapter_inheritance.legacy.Circle;
import structural_patterns.adapter_inheritance.legacy.Line;
import structural_patterns.adapter_inheritance.legacy.Shape;

public class Client {

    /**
     * Ejemplo de patron Adapter usando herencia
     */
    public static void main(String[] args) {

        // withoutAdapter();
        withAdapter();

    }

    /**
     * Usando las clases "Adaptadoras", podemos tratar objetos del API Externo, como si fueran
     * objetos del API Legacy (Shape). Para lograr esto, tenemos que crear un adaptador
     * por cada implementación concreta del API Externo que se quiera "Adaptar" a nuestra API Legacy
     */
    private static void withAdapter() {
        Shape s1 = new Line();
        s1.draw();

        Shape s2 = new TriangleAdapter(4, 2, 4);
        s2.draw();
    }

    /**
     * La API Shape es incompatible con la API externa GeometricShape.
     * No podemos tratar las implementaciones concretas del API externa como
     * objetos del API Legacy
     */
    private static void withoutAdapter() {
        Shape s1 = new Circle();
        s1.draw();

        GeometricShape gs1 = new Rectangle(10, 2);
        gs1.drawShape();
    }


}
