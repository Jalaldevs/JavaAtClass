// Rectangulo.java
public class Rectangulo extends Forma {
    private double longitud;
    private double ancho;

    public Rectangulo(double longitud, double ancho) {
        super("Rectángulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return longitud * ancho;
    }

    @Override
    public String toString() {
        return super.toString() + " de " + longitud + " x " + ancho;
    }
}
