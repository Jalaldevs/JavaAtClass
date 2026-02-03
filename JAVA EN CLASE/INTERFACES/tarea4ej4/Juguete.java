package INTERFACES.tarea4ej4;

public class Juguete extends Bienes implements Regalo{

    private int edadMinima;

    @Override
    public String RegaloPorCompra() {
        return "El usuario puede comprar otro articulo gratis del mismo precio al ya comprado";
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "edadMinima=" + edadMinima +
                '}';
    }
}
