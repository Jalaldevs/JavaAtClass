public class Estudiante implements Comparable<Estudiante>{

    private String nombre;
    private int edad;
    private int altura;

    public Estudiante(int altura, int edad, String nombre) {
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Estudiante o) {
        if (this.altura < o.altura) {
            return 1;
        } else if (this.altura > o.altura) {
            return -1;
        } else if (this.altura == o.altura && this.edad > o.edad) {
            return -1;
        } else if (this.altura == o.altura && this.edad < o.edad) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
