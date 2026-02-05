public class Coche {
    private String marca;
    private String modelo;
    private Motor motor;
    private Ruedas ruedas;
    private Asientos asientos;
    private Volante volante;
    private Puertas puertas;
    private DepositoCombustible deposito;
    private SistemaFrenos frenos;

    // Constructor con todas las partes
    public Coche(String marca, String modelo, Motor motor, Ruedas ruedas,
                 Asientos asientos, Volante volante, Puertas puertas,
                 DepositoCombustible deposito, SistemaFrenos frenos) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.ruedas = ruedas;
        this.asientos = asientos;
        this.volante = volante;
        this.puertas = puertas;
        this.deposito = deposito;
        this.frenos = frenos;
    }

    // 2a. Métodos para acceder a las partes (usando getters públicos)
    public Motor getMotor() {
        return motor;
    }

    public Ruedas getRuedas() {
        return ruedas;
    }

    public Asientos getAsientos() {
        return asientos;
    }

    public Volante getVolante() {
        return volante;
    }

    public Puertas getPuertas() {
        return puertas;
    }

    public DepositoCombustible getDeposito() {
        return deposito;
    }

    public SistemaFrenos getFrenos() {
        return frenos;
    }

    // Métodos del coche que usan las partes
    public void arrancar() {
        if (deposito.getNivelActual() > 0) {
            motor.encender();
            System.out.println(marca + " " + modelo + " arrancado");
        } else {
            System.out.println("No hay combustible para arrancar");
        }
    }

    public void conducir(int distancia) {
        if (motor.estaEncendido()) {
            System.out.println("Conduciendo " + distancia + " km");
            deposito.consumir(distancia / 10); // consume 1L cada 10km
            ruedas.desgastar(distancia / 1000); // desgaste por km
        } else {
            System.out.println("Primero debe arrancar el coche");
        }
    }

    public void mostrarInfo() {
        System.out.println("=== " + marca + " " + modelo + " ===");
        System.out.println("Motor: " + motor.getPotencia() + " HP");
        System.out.println("Combustible: " + deposito.getNivelActual() + "/" + deposito.getCapacidad() + "L");
        System.out.println("Puertas: " + puertas.getNumeroPuertas());
        System.out.println("Asientos: " + asientos.getNumeroAsientos());
    }
}

