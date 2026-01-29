public class DepositoCombustible {
    private int capacidad; // en litros
    private int nivelActual;
    private String tipoCombustible;

    public DepositoCombustible(int capacidad, String tipoCombustible) {
        this.capacidad = capacidad;
        this.tipoCombustible = tipoCombustible;
        this.nivelActual = 0;
    }

    public void repostar(int litros) {
        if (nivelActual + litros <= capacidad) {
            nivelActual += litros;
            System.out.println("Repostados " + litros + " litros. Nivel actual: " + nivelActual + "L");
        } else {
            nivelActual = capacidad;
            System.out.println("Depósito lleno. Nivel: " + nivelActual + "L");
        }
    }

    public void consumir(int litros) {
        nivelActual -= litros;
        if (nivelActual < 0) nivelActual = 0;
    }

    // Getters para parte 2a
    public int getCapacidad() {
        return capacidad;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
}
