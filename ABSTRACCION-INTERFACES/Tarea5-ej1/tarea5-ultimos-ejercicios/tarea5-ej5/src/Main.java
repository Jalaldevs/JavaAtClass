import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // b. Definir un Rectángulo (ancho = 2, altura = 3)
        Rectangulo rect = new Rectangulo(2, 3);

        // c. Imprime el área y el perímetro del Rectángulo
        System.out.println("Rectángulo original:");
        System.out.println("Ancho: " + rect.getAncho());
        System.out.println("Altura: " + rect.getAltura());
        System.out.println("Área: " + rect.getArea());
        System.out.println("Perímetro: " + rect.getPerimetro());

        // d. Cambiar el tamaño del Rectángulo por factor de 2
        rect.redimensionar(2);

        // e. Vuelva a imprimir el área y el perímetro del rectángulo
        System.out.println("\nRectángulo redimensionado (factor 2):");
        System.out.println("Ancho: " + rect.getAncho());
        System.out.println("Altura: " + rect.getAltura());
        System.out.println("Área: " + rect.getArea());
        System.out.println("Perímetro: " + rect.getPerimetro());

        // Ejercicio 6

        Rectangulo[] rectangulos = new Rectangulo[10];
        rectangulos[0] = new Rectangulo(8, 4);    // area: 32
        rectangulos[1] = new Rectangulo(2, 10);   // area: 20
        rectangulos[2] = new Rectangulo(5, 5);    // area: 25
        rectangulos[3] = new Rectangulo(1, 15);   // area: 15
        rectangulos[4] = new Rectangulo(7, 3);    // area: 21
        rectangulos[5] = new Rectangulo(3, 6);    // area: 18
        rectangulos[6] = new Rectangulo(9, 2);    // area: 18
        rectangulos[7] = new Rectangulo(4, 7);    // area: 28
        rectangulos[8] = new Rectangulo(6, 2);    // area: 12
        rectangulos[9] = new Rectangulo(2, 9);

        Arrays.sort(rectangulos);

        for (Rectangulo r : rectangulos) {
            System.out.println(r);
        }

        // Ejercicio 7

        Estudiante[] estudiantes = new Estudiante[5];
        estudiantes[0] = new Estudiante(170, 12, "Patri");
        estudiantes[1] = new Estudiante(173, 43, "Manuel");
        estudiantes[2] = new Estudiante(189, 72, "Javier");
        estudiantes[3] = new Estudiante(168, 52, "Alicia");
        estudiantes[4] = new Estudiante(189, 35, "Alberto");

        System.out.println("\nEstudiantes sin ordenar:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println((i + 1) + ". " + estudiantes[i].getNombre() +
                    " - Altura: " + estudiantes[i].getAltura() +
                    " - Edad: " + estudiantes[i].getEdad());
        }

        Arrays.sort(estudiantes);

        System.out.println("\nEstudiantes ordenados:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println((i + 1) + ". " + estudiantes[i].getNombre() +
                    " - Altura: " + estudiantes[i].getAltura() +
                    " - Edad: " + estudiantes[i].getEdad());
        }
    }

}