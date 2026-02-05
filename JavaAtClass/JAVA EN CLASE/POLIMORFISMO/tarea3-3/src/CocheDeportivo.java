public class CocheDeportivo extends Coche {

    public CocheDeportivo(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public void acelerar() {
        System.out.println("El coche deportivo acelera muy rápido.");
    }

    @Override
    public void frenar() {
        System.out.println("El coche deportivo frena con frenos de alto rendimiento.");
    }
}
