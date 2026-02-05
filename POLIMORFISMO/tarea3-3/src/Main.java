public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Genérico", 4);
        Coche coche2 = new CocheElectrico("Tesla Model 3", 0);
        Coche coche3 = new CocheDeportivo("Ferrari", 8);
        Coche coche4 = new SUV("Toyota Land Cruiser", 6);

        Coche[] coches = { coche1, coche2, coche3, coche4 };

        for (Coche c : coches) {
            c.arrancar();
            c.acelerar();
            c.frenar();
            System.out.println("----");
        }
    }
}
