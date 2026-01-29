public class MainCoche {
    public static void main(String[] args) {

        System.out.println("=== PARTE 2A: Con getters públicos ===");

        // Crear las partes del coche
        Motor motor1 = new Motor(150, "Gasolina");
        Ruedas ruedas1 = new Ruedas("Michelin", 32);
        Asientos asientos1 = new Asientos("Cuero", true, 5);
        Volante volante1 = new Volante("Cuero", true, 38);
        Puertas puertas1 = new Puertas(5, true);
        DepositoCombustible deposito1 = new DepositoCombustible(60, "Gasolina");
        SistemaFrenos frenos1 = new SistemaFrenos("disco", true);

        // Crear el coche (composición)
        Coche miCoche = new Coche("Toyota", "Corolla", motor1, ruedas1, asientos1,
                volante1, puertas1, deposito1, frenos1);

        // Probar el coche
        miCoche.mostrarInfo();
        deposito1.repostar(50);
        miCoche.arrancar();
        miCoche.conducir(50);

        // Acceder a partes individuales usando getters públicos
        System.out.println("\nAccediendo a partes específicas:");
        System.out.println("Potencia motor: " + miCoche.getMotor().getPotencia() + " HP");
        System.out.println("Material asientos: " + miCoche.getAsientos().getMaterial());
        miCoche.getFrenos().frenar();

        System.out.println("\n=== PARTE 2B: Con getters privados ===");

        // Crear otro coche con getters privados
        Coche2 miCoche2 = new Coche2("Honda", "Civic",
                new Motor(180, "Diésel"),
                new Ruedas("Bridgestone", 34),
                new Asientos("Tela", false, 5),
                new Volante("Plástico", false, 36),
                new Puertas(3, false),
                new DepositoCombustible(55, "Diésel"),
                new SistemaFrenos("disco", true)
        );

        // Probar métodos que acceden internamente
        miCoche2.mostrarEstadoCoche();
        miCoche2.repostarCoche(40);
        miCoche2.arrancarCoche();
        miCoche2.inflarRuedasCoche(5);
        miCoche2.girarVolanteCoche("izquierda");
        miCoche2.frenarCoche();

        // No podemos acceder directamente a las partes:
        // miCoche2.getMotor(); // ERROR: getMotor() es privado
        // miCoche2.motor.encender(); // ERROR: motor es privado
    }
}