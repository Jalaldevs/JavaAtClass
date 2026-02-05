// Forma.java
public class Forma {
    private String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public double area() {
        return 0.0;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
