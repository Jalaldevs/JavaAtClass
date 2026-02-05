package Tarea5Ej4;

public abstract class Forma {
    private int numLados;

    public Forma(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}