class Coche2 {
    private String marca;
    private String modelo;
    private Motor motor;
    private Ruedas ruedas;
    private Asientos asientos;
    private Volante volante;
    private Puertas puertas;
    private DepositoCombustible deposito;
    private SistemaFrenos frenos;

    public Coche2(String marca, String modelo, Motor motor, Ruedas ruedas,
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

    // 2b. Getters PRIVADOS (no accesibles desde fuera)
    private Motor getMotor() {
        return motor;
    }

    private Ruedas getRuedas() {
        return ruedas;
    }

    // Métodos que acceden a funcionalidades de las partes SIN usar getters públicos
    public void arrancarCoche() {
        // Accede al motor directamente
        if (deposito.getNivelActual() > 0) {
            System.out.println("Arrancando el motor...");
            // En lugar de motor.encender(), creamos un método que lo haga internamente
            encenderMotor();
        } else {
            System.out.println("Sin combustible");
        }
    }

    private void encenderMotor() {
        // Acceso directo sin getter público
        if (motor != null) {
            motor.encender();
        }
    }

    public void inflarRuedasCoche(int presion) {
        System.out.println("Inflando ruedas del coche...");
        if (ruedas != null) {
            ruedas.inflar(presion);
        }
    }

    public void activarCalefaccionAsientos() {
        System.out.println("Activando calefacción...");
        if (asientos != null) {
            asientos.activarCalefaccion();
        }
    }

    public void girarVolanteCoche(String direccion) {
        System.out.print("Coche girando: ");
        if (volante != null) {
            volante.girar(direccion);
        }
    }

    public void repostarCoche(int litros) {
        System.out.println("Repostando el coche...");
        if (deposito != null) {
            deposito.repostar(litros);
        }
    }

    public void frenarCoche() {
        System.out.println("Coche frenando...");
        if (frenos != null) {
            frenos.frenar();
        }
    }

    public void mostrarEstadoCoche() {
        System.out.println("\n=== ESTADO DEL COCHE ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);

        // Acceso a información sin getters públicos
        if (deposito != null) {
            System.out.println("Combustible: Disponible");
        }

        if (ruedas != null) {
            System.out.println("Ruedas: Infladas");
        }

        if (motor != null && motor.estaEncendido()) {
            System.out.println("Motor: ENCENDIDO");
        } else {
            System.out.println("Motor: APAGADO");
        }
    }
}