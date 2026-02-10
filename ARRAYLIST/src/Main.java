import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {

        String nombre;
        String numero;
        String nombreContacto;
        String numeroContacto;
        String nombreNuevoContacto;
        String numeroNuevoContacto;
        Scanner sc = new Scanner(System.in);
        System.out.println("|------------------ CREA SU TELEFONO MOVIL ----------------|");
        System.out.println("Introduzca Su Nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduzca Su Numero De Telefono:");
        numero = sc.nextLine();

        ArrayList<Contacto> listContacts = new ArrayList<>();
        TelefonoMovil t = new TelefonoMovil(numero, listContacts);

        int respuestaUsuario = -1;

        do {
            try {
                System.out.println(FuncionesMain.mainMenu());
                System.out.println("Selecciona Una Opción: ");
                respuestaUsuario = sc.nextInt();

                switch (respuestaUsuario) {
                    case 0:
                        System.out.println("Cerrando programa...");
                        break;
                    case 1:
                        System.out.println(t.printContacts());
                        break;
                    case 2:
                        System.out.println("Introduce Nombre De Contacto:");
                        nombreContacto = sc.nextLine();
                        System.out.println("Introduce Numero De Contacto:");
                        numeroContacto = sc.nextLine();
                        Contacto c = new Contacto(nombreContacto, numeroContacto);
                        if (t.addNewContact(c) == true) {
                            listContacts.add(c);
                        }
                        System.out.println("Contacto Añadido Correctamente!");
                        break;
                    case 3:
                        System.out.println("Introduce Nombre De Contacto:");
                        nombreContacto = sc.nextLine();
                        System.out.println("Introduce Numero De Contacto:");
                        numeroContacto = sc.nextLine();
                        Contacto antiguoContacto = new Contacto(nombreContacto, numeroContacto);
                        if (t.queryContact(nombreContacto) != null) {
                            for (int i = 0; i < listContacts.size(); i++) {
                                if (listContacts.get(i).getName() == nombreContacto) {
                                    System.out.println("Introduce Nuevo Nombre De Contacto:");
                                    nombreNuevoContacto = sc.nextLine();
                                    System.out.println("Introduce Nuevo Numero De Contacto:");
                                    numeroNuevoContacto = sc.nextLine();
                                    Contacto nuevoContacto = new Contacto(nombreNuevoContacto, numeroNuevoContacto);
                                    if (t.updateContact(antiguoContacto,nuevoContacto) == true) {
                                        for (int x = 0; x < listContacts.size(); x++) {
                                            if (listContacts.get(x) == antiguoContacto) {
                                                listContacts.get(x).setName(nombreNuevoContacto);
                                                listContacts.get(x).setPhoneNumber(numeroNuevoContacto);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Introduce Nombre De Contacto:");
                        nombreContacto = sc.nextLine();
                        if (t.queryContact(nombreContacto) != null) {
                            for (int i = 0; i < listContacts.size(); i++) {
                                if (listContacts.get(i).getName() == nombreContacto) {
                                    listContacts.remove(listContacts.get(i));
                                }
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Introduce Nombre De Contacto:");
                        nombreContacto = sc.nextLine();
                        if (t.queryContact(nombreContacto) != null) {
                            for (int i = 0; i < listContacts.size(); i++) {
                                if (listContacts.get(i).getName() == nombreContacto) {
                                    System.out.println(listContacts.get(i).getName());
                                    System.out.println(listContacts.get(i).getPhoneNumber());
                                }
                            }
                        }
                        break;
                    case 6:
                        System.out.println(FuncionesMain.mainMenu());
                        System.out.println("Selecciona Una Opción: ");
                        respuestaUsuario = sc.nextInt();
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Error: debe introducir un número.");
                sc.nextLine(); // 🔥 LIMPIA el buffer
            }
        } while (respuestaUsuario != 0);

        System.out.println("Programa Cerrado Con Éxito...");
    }
}
