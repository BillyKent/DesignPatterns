package structural_patterns.adapter;

import structural_patterns.adapter.adapted.BuggatiAdapter;
import structural_patterns.adapter.adapted.MasseratiAdapter;
import structural_patterns.adapter.adapted.PorcheAdapter;
import structural_patterns.adapter.legacy.Buggati;
import structural_patterns.adapter.legacy.Masserati;
import structural_patterns.adapter.legacy.Porche;
import structural_patterns.adapter.legacy.Vehicle;

public class Client {

    /**
     * En resumen: Ahora podemos crear nuevas subclases de Vehicle
     * pero adaptadas para mostrar otros datos usando el mismo metodo legacy (showDisplay)
     */
    public static void main(String[] args) {
        withoutAdapter();
        withAdapter();
    }

    /**
     * La implementacion legacy de Vehicle, obliga a sus subclases a
     * sobreescribir el metodo que devuelve la velocidad en MPH. Sin embargo,
     * se requiere que los nuevos vehiculos muestren la informacion en KMH
     */
    private static void withoutAdapter() {
        System.out.println("Implementacion legacy (Mostrando en MPH) ...");

        Vehicle v1 = new Masserati();
        Vehicle v2 = new Porche();
        Vehicle v3 = new Buggati();

        System.out.println(v1.showDisplay());
        System.out.println(v2.showDisplay());
        System.out.println(v3.showDisplay());
    }

    /**
     * Con la nueva implementacion ahora podemos crear objetos legacy (Vehicle)
     * que muestran en pantalla la velocidad pero en KHM
     */
    private static void withAdapter() {

        System.out.println("\nNueva implementacion (Mostrando en KMH) ...");

        Vehicle v1 = new MasseratiAdapter();
        Vehicle v2 = new PorcheAdapter();
        Vehicle v3 = new BuggatiAdapter();

        System.out.println(v1.showDisplay());
        System.out.println(v2.showDisplay());
        System.out.println(v3.showDisplay());

    }

}
