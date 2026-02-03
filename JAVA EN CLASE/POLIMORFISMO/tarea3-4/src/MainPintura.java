// MainPintura.java
public class MainPintura {
    public static void main(String[] args) {
        // Crear pintura con cobertura de 250 m² por litro
        Pintura pintura = new Pintura(250);

        // Crear las formas
        Forma rectangulo = new Rectangulo(20, 35);
        Forma esfera = new Esfera(15);
        Forma cilindro = new Cilindro(10, 30);

        System.out.println("=== CÁLCULO DE PINTURA NECESARIA ===\n");

        // Calcular pintura para cada forma
        pintura.calcularCantidad(rectangulo);
        pintura.calcularCantidad(esfera);
        pintura.calcularCantidad(cilindro);

        // DEMOSTRACIÓN DEL POLIMORFISMO
        System.out.println("=== DEMOSTRACIÓN DEL POLIMORFISMO ===");

        // Array de formas (polimorfismo)
        Forma[] formas = {rectangulo, esfera, cilindro};

        double totalPintura = 0;
        for (Forma forma : formas) {
            // Llamada polimórfica: Java decide en tiempo de ejecución
            // qué método area() llamar según el tipo real del objeto
            double cantidad = pintura.calcularCantidad(forma);
            totalPintura += cantidad;
        }

        System.out.println("Total de pintura necesaria para todas las formas: " +
                String.format("%.2f", totalPintura) + " litros");
    }
}