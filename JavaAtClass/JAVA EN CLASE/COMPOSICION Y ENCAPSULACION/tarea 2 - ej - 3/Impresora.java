public class Impresora {

    private int nivelToner;
    private int paginasImpresas;
    private boolean conDobleCara;

    public Impresora(boolean conDobleCara) {
        this.nivelToner = 10;
        this.paginasImpresas = 0;
        this.conDobleCara = conDobleCara;
    };

    // GETTER

    public int getPaginasImpresas() {
        return paginasImpresas;
    }

    // METODOS

    public int anadirToner(int cantidadTonerEntre0y100) {
        if (cantidadTonerEntre0y100 < 0 || cantidadTonerEntre0y100 > 100 || 100 - cantidadTonerEntre0y100 > this.nivelToner) {
            return -1;
        }
        return this.nivelToner = cantidadTonerEntre0y100;
    }

    public int paginasAImprimir(int numeroDePaginas, boolean tieneDobleCara) {
        if (tieneDobleCara) {
            return numeroDePaginas / 2;
        }
        this.paginasImpresas = numeroDePaginas;
        return numeroDePaginas;
    }


}
