package Tarea5Ej4;

public class Rectangulo extends Forma {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        super(4); // Un rectángulo siempre tiene 4 lados
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double getArea() {
        return ancho * alto;
    }

    @Override
    public double getPerimeter() {
        return 2 * (ancho + alto);
    }

    // Getters adicionales
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
}