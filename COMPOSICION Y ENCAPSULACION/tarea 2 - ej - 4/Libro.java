public class Libro {
    // Campos privados - ¡BIEN!
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;
    private int copiasTotales;
    private int copiasDisponibles;
    private boolean estaActivo; // Para baja lógica

    // Constantes
    private static final int ANIO_MINIMO = 1455; // Año de la Biblia de Gutenberg
    private static final int ANIO_MAXIMO = 2024;

    // Constructor con validaciones
    public Libro(String titulo, String autor, String isbn, int anioPublicacion, int copiasTotales) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío");
        }
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío");
        }
        if (!validarISBN(isbn)) {
            throw new IllegalArgumentException("ISBN inválido");
        }
        if (anioPublicacion < ANIO_MINIMO || anioPublicacion > ANIO_MAXIMO) {
            throw new IllegalArgumentException("Año de publicación inválido");
        }
        if (copiasTotales <= 0) {
            throw new IllegalArgumentException("Debe haber al menos 1 copia");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.copiasTotales = copiasTotales;
        this.copiasDisponibles = copiasTotales;
        this.estaActivo = true;
    }

    // Método privado para validar ISBN
    private boolean validarISBN(String isbn) {
        if (isbn == null || isbn.length() != 13) {
            return false;
        }
        // Validación básica de ISBN-13
        return isbn.matches("978-\\d{1,5}-\\d{1,7}-\\d{1,6}-\\d");
    }

    // Método para prestar libro con validaciones
    public boolean prestar() {
        if (!estaActivo) {
            System.out.println("Error: El libro está dado de baja");
            return false;
        }

        if (copiasDisponibles <= 0) {
            System.out.println("Error: No hay copias disponibles de '" + titulo + "'");
            return false;
        }

        copiasDisponibles--;
        System.out.println("Libro '" + titulo + "' prestado exitosamente");
        System.out.println("Copias disponibles ahora: " + copiasDisponibles + " de " + copiasTotales);
        return true;
    }

    // Método para devolver libro
    public boolean devolver() {
        if (!estaActivo) {
            System.out.println("Error: El libro está dado de baja");
            return false;
        }

        if (copiasDisponibles >= copiasTotales) {
            System.out.println("Error: Todas las copias ya están disponibles");
            return false;
        }

        copiasDisponibles++;
        System.out.println("Libro '" + titulo + "' devuelto exitosamente");
        System.out.println("Copias disponibles ahora: " + copiasDisponibles + " de " + copiasTotales);
        return true;
    }

    // Método para agregar más copias
    public boolean agregarCopias(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser positiva");
            return false;
        }

        if (!estaActivo) {
            System.out.println("Error: No se pueden agregar copias a un libro dado de baja");
            return false;
        }

        copiasTotales += cantidad;
        copiasDisponibles += cantidad;
        System.out.println("Se agregaron " + cantidad + " copias de '" + titulo + "'");
        System.out.println("Total de copias ahora: " + copiasTotales);
        return true;
    }

    // Método para dar de baja lógica
    public void darDeBaja() {
        if (copiasDisponibles != copiasTotales) {
            System.out.println("Error: No se puede dar de baja. Hay " +
                    (copiasTotales - copiasDisponibles) + " copias prestadas");
            return;
        }

        estaActivo = false;
        System.out.println("Libro '" + titulo + "' dado de baja correctamente");
    }

    // Método para reactivar
    public void reactivar() {
        estaActivo = true;
        System.out.println("Libro '" + titulo + "' reactivado");
    }

    // Getters con información controlada
    public String getInformacion() {
        String estado = estaActivo ? "Disponible" : "Dado de baja";
        return "'" + titulo + "' por " + autor +
                " (" + anioPublicacion + ") - " +
                copiasDisponibles + "/" + copiasTotales + " copias - " + estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // Getter parcial para ISBN (ocultando parte)
    public String getISBNAbreviado() {
        if (isbn == null || isbn.length() < 4) {
            return "****";
        }
        return isbn.substring(0, 4) + "-****-****-*";
    }

    public boolean estaDisponible() {
        return estaActivo && copiasDisponibles > 0;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public int getCopiasTotales() {
        return copiasTotales;
    }

    public boolean isActivo() {
        return estaActivo;
    }

    // Método para mostrar estado detallado
    public void mostrarEstado() {
        System.out.println("\n=== INFORMACIÓN DEL LIBRO ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anioPublicacion);
        System.out.println("ISBN: " + getISBNAbreviado());
        System.out.println("Estado: " + (estaActivo ? "Activo" : "Dado de baja"));
        System.out.println("Copias: " + copiasDisponibles + " disponibles de " + copiasTotales);
        System.out.println("============================\n");
    }
}
