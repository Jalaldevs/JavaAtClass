import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|------------------ CREA SU TELEFONO MOVIL ----------------|");
        System.out.println("Introduzca Su Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduzca Su Numero De Telefono:");
        String numero = sc.nextLine();

        ArrayList<Contacto> listContacts = new ArrayList<>();
        TelefonoMovil t = new TelefonoMovil(numero, listContacts);

        int respuestaUsuario = -1;

        do {
            try {
                System.out.println(FuncionesMain.mainMenu());
                System.out.println("Selecciona Una Opción: ");
                respuestaUsuario = sc.nextInt();
                sc.nextLine(); // ⭐ Consumir salto de línea

                switch (respuestaUsuario) {
                    case 0:
                        System.out.println("Cerrando programa...");
                        break;

                    case 1:
                        System.out.println(t.printContacts());
                        break;

                    case 2:
                        System.out.println("Introduce Nombre De Contacto:");
                        String nombreContacto = sc.nextLine();
                        System.out.println("Introduce Numero De Contacto:");
                        String numeroContacto = sc.nextLine();
                        Contacto c = new Contacto(nombreContacto, numeroContacto);

                        // ⭐ CAMBIO: No añadir manualmente, addNewContact ya lo hace
                        if (t.addNewContact(c)) {
                            System.out.println("✅ Contacto Añadido Correctamente!");
                        } else {
                            System.out.println("❌ El contacto ya existe.");
                        }
                        break;

                    case 3:
                        System.out.println("Introduce Nombre De Contacto a actualizar:");
                        nombreContacto = sc.nextLine();
                        Contacto antiguoContacto = t.queryContact(nombreContacto);

                        if (antiguoContacto != null) {
                            System.out.println("Introduce Nuevo Nombre:");
                            String nombreNuevo = sc.nextLine();
                            System.out.println("Introduce Nuevo Numero:");
                            String numeroNuevo = sc.nextLine();
                            Contacto nuevoContacto = new Contacto(nombreNuevo, numeroNuevo);

                            if (t.updateContact(antiguoContacto, nuevoContacto)) {
                                System.out.println("✅ Contacto actualizado!");
                            }
                        } else {
                            System.out.println("❌ Contacto no encontrado.");
                        }
                        break;

                    case 4:
                        System.out.println("Introduce Nombre De Contacto a eliminar:");
                        nombreContacto = sc.nextLine();
                        Contacto contactoEliminar = t.queryContact(nombreContacto);

                        if (contactoEliminar != null) {
                            if (t.removeContact(contactoEliminar)) {
                                System.out.println("✅ Contacto eliminado!");
                            }
                        } else {
                            System.out.println("❌ Contacto no encontrado.");
                        }
                        break;

                    case 5:
                        System.out.println("Introduce Nombre De Contacto:");
                        nombreContacto = sc.nextLine();
                        Contacto encontrado = t.queryContact(nombreContacto);

                        if (encontrado != null) {
                            System.out.println("📱 Nombre: " + encontrado.getName());
                            System.out.println("📞 Número: " + encontrado.getPhoneNumber());
                        } else {
                            System.out.println("❌ Contacto no encontrado.");
                        }
                        break;

                    case 6:
                        // El menú se muestra automáticamente
                        break;

                    default:
                        System.out.println("❌ Opción inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Error: debe introducir un número.");
                sc.nextLine();
            }
        } while (respuestaUsuario != 0);

        sc.close();
        System.out.println("✅ Programa Cerrado Con Éxito...");
    }
}