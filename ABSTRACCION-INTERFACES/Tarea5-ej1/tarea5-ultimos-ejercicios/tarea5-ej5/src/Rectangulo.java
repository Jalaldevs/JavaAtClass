import java.awt.*;

public class Rectangulo implements Redimensionable, Comparable<Rectangulo>{

    private double ancho;
    private double altura;

    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    public double getArea() {
        return ancho * altura;
    }

    public double getPerimetro() {
        return 2 * (ancho + altura);
    }

    // Métodos getter para obtener los valores actuales
    public double getAncho() {
        return ancho;
    }

    public double getAltura() {
        return altura;
    }

    // Implementación del método de la interfaz Redimensionable
    @Override
    public void redimensionar(int x) {
        this.ancho *= x;
        this.altura *= x;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", altura=" + altura +
                ", area=" + getArea() +
                ", perimetro=" + getPerimetro() +
                '}';
    }

    @Override
    public int compareTo(Rectangulo o) {
        if (this.getArea() < o.getArea()) {
            return -1;  // Este rectángulo es MENOR
        } else if (this.getArea() > o.getArea()) {
            return 1;   // Este rectángulo es MAYOR
        } else {
            return 0;   // Son iguales en área
        }
    }
}
