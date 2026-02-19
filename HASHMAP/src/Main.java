import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Clase Main
public class Main {
    private Map<Integer, Ubicacion> ubicaciones;

    public Main() {
        ubicaciones = new HashMap<>();

        // Crear las ubicaciones
        ubicaciones.put(0, new Ubicacion(0, "Estás sentado en la clase de programación"));
        ubicaciones.put(1, new Ubicacion(1, "Estás en la cima de una montaña"));
        ubicaciones.put(2, new Ubicacion(2, "Estás bañándote en la playa"));
        ubicaciones.put(3, new Ubicacion(3, "Estás dentro de un edificio muy alto"));
        ubicaciones.put(4, new Ubicacion(4, "Estás de pie en un puente"));
        ubicaciones.put(5, new Ubicacion(5, "Estás en un bosque"));

        // Configurar las salidas según el dibujo
        // Ubicación 1 - Montaña
        ubicaciones.get(1).addExit("N", 5); // Bosque
        ubicaciones.get(1).addExit("S", 3); // Edificio
        ubicaciones.get(1).addExit("E", 4); // Puente
        ubicaciones.get(1).addExit("O", 2); // Playa

        // Ubicación 2 - Playa
        ubicaciones.get(2).addExit("N", 1); // Montaña
        ubicaciones.get(2).addExit("S", 4); // Puente
        ubicaciones.get(2).addExit("E", 5); // Bosque

        // Ubicación 3 - Edificio
        ubicaciones.get(3).addExit("N", 4); // Puente
        ubicaciones.get(3).addExit("O", 1); // Montaña
        ubicaciones.get(3).addExit("E", 5); // Bosque

        // Ubicación 4 - Puente
        ubicaciones.get(4).addExit("N", 2); // Playa
        ubicaciones.get(4).addExit("S", 3); // Edificio
        ubicaciones.get(4).addExit("O", 1); // Montaña
        ubicaciones.get(4).addExit("E", 5); // Bosque

        // Ubicación 5 - Bosque
        ubicaciones.get(5).addExit("S", 1); // Montaña
        ubicaciones.get(5).addExit("O", 4); // Puente

        // MEJORA: Añadir salida "Q" a todas las ubicaciones de forma automática
        for (Ubicacion ubicacion : ubicaciones.values()) {
            ubicacion.addExit("Q", 0);
        }
    }

    public static void main(String[] args) {
        Main juego = new Main();
        Scanner scanner = new Scanner(System.in);

        int ubicacionActual = 1;
        boolean continuar = true;

        while (continuar) {
            Ubicacion ubicacion = juego.ubicaciones.get(ubicacionActual);
            System.out.println(ubicacion.getDescripcion());

            // Mostrar salidas válidas
            System.out.print("Tus salidas válidas son ");
            boolean primera = true;
            for (String direccion : ubicacion.getExits().keySet()) {
                if (!primera) {
                    System.out.print(", ");
                }
                System.out.print(direccion);
                primera = false;
            }
            System.out.println();

            System.out.print("INPUT: ");
            String direccion = scanner.nextLine().toUpperCase();

            // Verificar si la dirección es válida
            if (ubicacion.getExits().containsKey(direccion)) {
                int siguienteUbicacion = ubicacion.getExits().get(direccion);

                // Verificar si la ubicación destino existe
                if (juego.ubicaciones.containsKey(siguienteUbicacion)) {
                    ubicacionActual = siguienteUbicacion;

                    // Salir del juego si se introduce Q
                    if (direccion.equals("Q")) {
                        continuar = false;
                    }
                } else {
                    System.out.println("No puedes ir a ese lugar.");
                }
            } else {
                System.out.println("No puede ir en esa dirección");
            }

            System.out.println();
        }

        scanner.close();
    }
}