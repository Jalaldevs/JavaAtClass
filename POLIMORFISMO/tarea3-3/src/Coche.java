public class Coche {

    private String modelo;
    private int cilindros;
    private boolean motor;
    private int ruedas;

    // Constructor
    public Coche(String modelo, int cilindros) {
        this.modelo = modelo;
        this.cilindros = cilindros;
        this.motor = true;
        this.ruedas = 4;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public int getCilindros() {
        return cilindros;
    }

    public boolean isMotor() {
        return motor;
    }

    public int getRuedas() {
        return ruedas;
    }

    // Métodos
    public void arrancar() {
        System.out.println("El coche está arrancando.");
    }

    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }

    public void frenar() {
        System.out.println("El coche está frenando.");
    }
}
