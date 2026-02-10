import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {

        String nombre;
        String numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("|------------------ CREA SU TELEFONO MOVIL ----------------|");
        System.out.println("Introduzca Su Nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduzca Su Numero De Telefono:");
        numero = sc.nextLine();

        Contacto c = new Contacto(nombre, numero);

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
                        break;
                    case 2:
                        System.out.println("Ejecuntando...");
                        break;
                    case 3:
                        System.out.println("Ejecuntando...");
                        break;
                    case 4:
                        System.out.println("Ejecuntando...");
                        break;
                    case 5:
                        System.out.println("Ejecuntando...");
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
