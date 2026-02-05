public class Ruedas {
    private String marca;
    private int presion; // en PSI
    private int desgaste; // porcentaje 0-100

    public Ruedas(String marca, int presion) {
        this.marca = marca;
        this.presion = presion;
        this.desgaste = 0;
    }

    public void inflar(int cantidad) {
        this.presion += cantidad;
        System.out.println("Ruedas infladas a " + presion + " PSI");
    }

    public void desgastar(int cantidad) {
        this.desgaste += cantidad;
        if (desgaste > 100) desgaste = 100;
    }

    // Getters para parte 2a
    public String getMarca() {
        return marca;
    }

    public int getPresion() {
        return presion;
    }

    public int getDesgaste() {
        return desgaste;
    }
}