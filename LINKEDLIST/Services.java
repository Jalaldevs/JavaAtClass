package LINKEDLIST;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Services {

    public static String imprimirPlayList(LinkedList<CancionNasheed> playList) {
        String playListToString = "";
        for (int i = 0; i < playList.size(); i++) {
            String titulo = playList.get(i).getTitulo();
            playListToString += titulo +"\n";
        }
        return playListToString;
    }

    public static String mainMenu() {
        return "0 – Salir de la lista de reproducción:\n" +
                "1 – Reproducir siguiente canción en la lista:\n" +
                "2 – Reproducir la canción previa de la lista:\n" +
                "3 – Repetir la canción actual:\n" +
                "4 – Imprimir la lista de canciones en la playlist:\n" +
                "5 – Volver a imprimir el menú:\n" +
                "6 – Eliminar canción actual de la playlist:\n";
    }


    public static void play(LinkedList<CancionNasheed> playList) {
        Scanner sc = new Scanner(System.in);
        int userInput = -1;
        boolean forward = true;
        CancionNasheed current = null;
        ListIterator<CancionNasheed> it = playList.listIterator();
        if (playList.isEmpty()) {
            System.out.println("La playlist está vacía.");
            return;
        }
        do {
            try {
                System.out.println(mainMenu());
                userInput = sc.nextInt();
                switch (userInput) {

                    case 0:
                        break;
                    case 1: // Siguiente canción
                        if (it.hasNext()) {
                            current = it.next();
                            System.out.println("Reproduciendo: " + current.getTitulo());
                        } else {
                            System.out.println("No hay más reproducciones.");
                        }
                        break;

                    case 2: // Canción previa
                        if (it.hasPrevious()) {
                            current = it.previous();
                            System.out.println("Reproduciendo: " + current.getTitulo());
                        } else {
                            System.out.println("Ya estás en la primera canción.");
                        }
                        break;

                    case 3: // Repetir canción actual
                        System.out.println("Reproduciendo nuevamente: " + current.getTitulo());
                        break;
                    case 4:
                        System.out.println(imprimirPlayList(playList));
                        break;
                    case 5:
                        System.out.println(mainMenu());
                        break;
                    case 6:
                        if (current == null) {
                            System.out.println("No hay canción actual para eliminar. Reproduce una primero.");
                        } else {
                            System.out.println("Eliminando la pista actual...");
                            it.remove(); // elimina la última canción reproducida
                            // Ajustar current
                            if (it.hasNext()) {
                                current = it.next();
                            } else if (it.hasPrevious()) {
                                current = it.previous();
                            } else {
                                System.out.println("La playlist está vacía.");
                                userInput = 0; // salir automáticamente
                            }
                        }
                        break;
                    default:
                        System.out.println("Wrong Option");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Introduce un número.");
                sc.next();
                userInput = -1;
            }
        } while (userInput != 0);
        System.out.println("Saliendo Del Programa...");
    }

}
