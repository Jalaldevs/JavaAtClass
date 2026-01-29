public class Lampara {

    private String estilo;
    private boolean bateria;
    private int calificacion;

    // CONSTRUCTOR

    public Lampara(String estilo, boolean bateria, int calificacion) {
        this.estilo = estilo;
        this.bateria = bateria;
        this.calificacion = calificacion;
    }

    // UTILS

    public String getEstilo() {
        return estilo;
    }

    public int getCalificacion() {
        return calificacion;
    }

    // METHODS

    public void encender() {
        this.bateria = true;
        System.out.println("La lampara se ha encendido.");
    }

    public boolean hayBateria() {
        return this.bateria;
    }


}
