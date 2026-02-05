public class SUV extends Coche {

    public SUV(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public void arrancar() {
        System.out.println("El SUV arranca preparado para todo terreno.");
    }
}
