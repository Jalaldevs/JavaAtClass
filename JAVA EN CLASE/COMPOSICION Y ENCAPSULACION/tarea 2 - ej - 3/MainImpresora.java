public class MainImpresora {
    public static void main(String[] args) {
         Impresora impresora = new Impresora(true); // con doble cara

        System.out.println("Nivel de toner: " + impresora.anadirToner(50));
        System.out.println("Páginas físicas impresas: " + impresora.paginasAImprimir(5));
        System.out.println("Total páginas impresas: " + impresora.getPaginasImpresas());

        System.out.println("Nivel de toner actual: " + impresora.getNivelToner());
    }
}
