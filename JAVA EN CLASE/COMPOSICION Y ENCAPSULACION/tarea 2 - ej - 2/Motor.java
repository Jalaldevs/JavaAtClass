public class Motor {
    private int potencia;
    private String tipoCombustible;
    private boolean encendido;

    public Motor(int potencia, String tipoCombustible) {
        this.potencia = potencia;
        this.tipoCombustible = tipoCombustible;
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("Motor encendido");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("Motor apagado");
    }

    public boolean estaEncendido() {
        return encendido;
    }

    // Getters para parte 2a
    public int getPotencia() {
        return potencia;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
}