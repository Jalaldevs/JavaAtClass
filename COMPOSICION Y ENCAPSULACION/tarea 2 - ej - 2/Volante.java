public class Volante {
    private String material;
    private boolean multifuncion;
    private int diametro; // en cm

    public Volante(String material, boolean multifuncion, int diametro) {
        this.material = material;
        this.multifuncion = multifuncion;
        this.diametro = diametro;
    }

    public void girar(String direccion) {
        System.out.println("Girando el volante hacia la " + direccion);
    }

    // Getters para parte 2a
    public String getMaterial() {
        return material;
    }

    public boolean esMultifuncion() {
        return multifuncion;
    }

    public int getDiametro() {
        return diametro;
    }
}
