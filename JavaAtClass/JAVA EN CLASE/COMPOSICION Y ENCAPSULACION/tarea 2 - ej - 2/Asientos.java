class Asientos {
    private String material;
    private boolean calefaccion;
    private int numeroAsientos;

    public Asientos(String material, boolean calefaccion, int numeroAsientos) {
        this.material = material;
        this.calefaccion = calefaccion;
        this.numeroAsientos = numeroAsientos;
    }

    public void activarCalefaccion() {
        if (calefaccion) {
            System.out.println("Calefacción de asientos activada");
        } else {
            System.out.println("Este modelo no tiene calefacción en asientos");
        }
    }

    // Getters para parte 2a
    public String getMaterial() {
        return material;
    }

    public boolean tieneCalefaccion() {
        return calefaccion;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }
}