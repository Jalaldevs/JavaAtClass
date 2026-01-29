public class Puertas {
    private int numeroPuertas;
    private boolean automaticas;
    private boolean cerradas;

    public Puertas(int numeroPuertas, boolean automaticas) {
        this.numeroPuertas = numeroPuertas;
        this.automaticas = automaticas;
        this.cerradas = true;
    }

    public void abrir() {
        this.cerradas = false;
        System.out.println("Puertas abiertas");
    }

    public void cerrar() {
        this.cerradas = true;
        System.out.println("Puertas cerradas");
    }

    // Getters para parte 2a
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public boolean sonAutomaticas() {
        return automaticas;
    }

    public boolean estanCerradas() {
        return cerradas;
    }
}
