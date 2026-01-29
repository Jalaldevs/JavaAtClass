public class Cilindro extends Circulo {

    private double altura;

    public Cilindro(double radio, double altura) {
        if (altura < 0) {
            this.altura = 0;
        }
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getVolume() {
        return getArea() * altura;
    }

}
