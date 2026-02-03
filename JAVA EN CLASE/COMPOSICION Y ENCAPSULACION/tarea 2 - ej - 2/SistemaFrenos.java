public class SistemaFrenos {
    private String tipo; // disco o tambor
    private boolean abs;
    private int desgastePastillas; // porcentaje

    public SistemaFrenos(String tipo, boolean abs) {
        this.tipo = tipo;
        this.abs = abs;
        this.desgastePastillas = 0;
    }

    public void frenar() {
        System.out.println("Frenando...");
        if (abs) {
            System.out.println("Sistema ABS activado");
        }
        desgastarPastillas(1);
    }

    private void desgastarPastillas(int cantidad) {
        desgastePastillas += cantidad;
        if (desgastePastillas > 100) desgastePastillas = 100;
    }

    // Getters para parte 2a
    public String getTipo() {
        return tipo;
    }

    public boolean tieneABS() {
        return abs;
    }

    public int getDesgastePastillas() {
        return desgastePastillas;
    }
}