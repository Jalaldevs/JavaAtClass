package LINKEDLIST;

public class CancionNasheed {

    private String titulo;
    private double duracion;

    public CancionNasheed(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "CancionNasheed{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                '}';
    }

}
