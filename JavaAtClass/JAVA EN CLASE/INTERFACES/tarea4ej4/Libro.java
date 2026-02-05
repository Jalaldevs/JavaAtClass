package INTERFACES.tarea4ej4;

public class Libro extends Bienes implements Regalo {
    private String autor;

    public Libro(String autor, String descripcion, double precio) {
        this.autor = autor;
        super(descripcion, precio);
    }

    @Override
    public String RegaloPorCompra() {
        return "El usuario puede comprar otro articulo gratis del mismo precio al ya comprado";
    }
    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                '}';
    }
}
