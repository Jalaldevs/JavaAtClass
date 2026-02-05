// ===== MAL USO DE ENCAPSULACIÓN =====
public class LibroMalo {
    // Campos públicos - ¡MAL!
    public String titulo;
    public String autor;
    public boolean prestado;
    public int copiasDisponibles;

    // Constructor
    public LibroMalo(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
        this.copiasDisponibles = 1;
    }

    public void prestar() {
        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }
}
