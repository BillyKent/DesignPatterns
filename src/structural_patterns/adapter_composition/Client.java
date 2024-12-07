package structural_patterns.adapter_composition;

import structural_patterns.adapter_composition.legacy.Circle;
import structural_patterns.adapter_composition.legacy.Line;
import structural_patterns.adapter_composition.legacy.Shape;
import structural_patterns.adapter_composition.external.GeometricShape;
import structural_patterns.adapter_composition.external.Rectangle;
import structural_patterns.adapter_composition.external.Triangle;

public class Client {

    /**
     * Ejemplo de patron Adapter usando composicion
     */
    public static void main(String[] args) {

        // withoutAdapter();
        withAdapter();

    }

    /**
     * Usando la clase Adapter creada, podemos usar objetos del API externo (GeometricShape)
     * como si fueran objetos del codigo legacy. Sin embargo, para crear los nuevos Shape
     * tenemos que usar composicion y pasarle el GeometricShape por constructor, por eso este
     * enfoque es considerado "Por composicion"
     */
    private static void withAdapter() {
        Shape s1 = new Line();
        s1.draw();

        Shape s2 = new GeometricShapeObjectAdapter(new Triangle(4, 2, 4));
        s2.draw();
    }

    /**
     * La API shape es incompatible con la API externa GeometricShape.
     * No podemos tratar las implementaciones concretas del API externo
     * y usarlas como objetos legacy, osea como Shape.
     */
    private static void withoutAdapter() {
        Shape s1 = new Circle();
        s1.draw();

        GeometricShape gs1 = new Rectangle(10, 2);
        gs1.drawShape();
    }


}
