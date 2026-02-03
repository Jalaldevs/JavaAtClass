// Pintura.java
public class Pintura {
    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double calcularCantidad(Forma forma) {
        double area = forma.area();
        double cantidad = area / cobertura;

        System.out.println("Para pintar " + forma + " (área: " +
                String.format("%.2f", area) + " m²)");
        System.out.println("se necesitan " +
                String.format("%.2f", cantidad) +
                " litros de pintura\n");

        return cantidad;
    }
}