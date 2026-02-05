public class CocheElectrico extends Coche {

    public CocheElectrico(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public void arrancar() {
        System.out.println("El coche eléctrico arranca en silencio.");
    }

    @Override
    public void acelerar() {
        System.out.println("El coche eléctrico acelera instantáneamente.");
    }
}
