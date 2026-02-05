package Tarea5Ej4;

public class Triangulo extends Forma {
    private double ancho;  // base del triángulo
    private double alto;   // altura del triángulo

    public Triangulo(double ancho, double alto) {
        super(3); // Un triángulo siempre tiene 3 lados
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double getArea() {
        return (ancho * alto) / 2;
    }

    @Override
    public double getPerimeter() {
        // Para calcular el perímetro necesitamos los 3 lados
        // Como solo tenemos base y altura, asumiremos que es un triángulo
        // rectángulo donde los catetos son 'ancho' y 'alto'
        double hipotenusa = Math.sqrt(ancho * ancho + alto * alto);
        return ancho + alto + hipotenusa;
    }

    // Getters adicionales
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
}