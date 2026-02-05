public class Circulo {

    private double radio;

    public Circulo(double radio) {
        if (radio < 0) {
            this.radio = 0;
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return this.radio * this.radio * Math.PI;
    }
}
