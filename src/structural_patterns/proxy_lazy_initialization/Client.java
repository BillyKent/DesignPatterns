package structural_patterns.proxy_lazy_initialization;

public class Client {

    /**
     *  Ejemplo de lazy initialization. Al instanciar la clase RealImage, se realiza
     *  la carga desde el disco de la imagen, sin embargo esta no se usa en 30 min.
     *
     *  Usando el patron Proxy, nos aseguramos de cargar la foto solamente la primera vez que necesitemos
     *  de ella.
     *
     * */
    public static void main(String[] args) {

        System.out.println("Preparing images ... ");
        Image realImage = new RealImage("My Photo.jpg");
        System.out.println("Waiting 30 min... ");
        realImage.display();
        realImage.display();
        realImage.display();

        System.out.println(" ... ");

        System.out.println("Preparing images2 ... ");
        Image proxyImage = new ProxyImage("My Photo2.jpg");
        System.out.println("Waiting 30 min... ");
        proxyImage.display();
        proxyImage.display();
        proxyImage.display();
    }


}
