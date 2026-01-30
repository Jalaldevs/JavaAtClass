public class Impresora {

    private int nivelToner;
    private int paginasImpresas;
    private boolean conDobleCara;

    public Impresora(boolean conDobleCara) {
        this.nivelToner = 0;
        this.paginasImpresas = 0;
        this.conDobleCara = conDobleCara;
    }

    // GETTERS
    public int getNivelToner() {
        return nivelToner;
    }

    public int getPaginasImpresas() {
        return paginasImpresas;
    }

    // MÉTODOS

    public int anadirToner(int cantidad) {
        if (cantidad < 0 || cantidad > 100) {
            return -1;
        }

        if (this.nivelToner + cantidad > 100) {
            return -1;
        }

        this.nivelToner += cantidad;
        return this.nivelToner;
    }

    public int paginasAImprimir(int numeroDePaginas) {
        int paginasFisicas;

        if (conDobleCara) {
            paginasFisicas = (numeroDePaginas / 2) + (numeroDePaginas % 2);
        } else {
            paginasFisicas = numeroDePaginas;
        }

        this.paginasImpresas += paginasFisicas;
        return paginasFisicas;
    }
}
