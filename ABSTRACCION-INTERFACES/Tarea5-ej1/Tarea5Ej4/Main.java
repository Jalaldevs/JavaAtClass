package Tarea5Ej4;

public class Main {
    public static void main(String[] args) {
        // Crear un Rectángulo
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
        System.out.println("=== RECTÁNGULO ===");
        System.out.println("Número de lados: " + rectangulo.getNumLados());
        System.out.println("Ancho: " + rectangulo.getAncho());
        System.out.println("Alto: " + rectangulo.getAlto());
        System.out.println("Área: " + rectangulo.getArea());
        System.out.println("Perímetro: " + rectangulo.getPerimeter());

        System.out.println(); // Línea en blanco para separar

        // Crear un Triángulo
        Triangulo triangulo = new Triangulo(4.0, 3.0);
        System.out.println("=== TRIÁNGULO ===");
        System.out.println("Número de lados: " + triangulo.getNumLados());
        System.out.println("Base: " + triangulo.getAncho());
        System.out.println("Altura: " + triangulo.getAlto());
        System.out.println("Área: " + triangulo.getArea());
        System.out.println("Perímetro: " + triangulo.getPerimeter());


    }
}