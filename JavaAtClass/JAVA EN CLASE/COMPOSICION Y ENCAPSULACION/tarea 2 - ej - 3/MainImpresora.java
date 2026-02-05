public class MainImpresora {
    public static void main(String[] args) {
        Impresora MiNuevaImpresora = new Impresora(true);
        MiNuevaImpresora.anadirToner(50);
        MiNuevaImpresora.paginasAImprimir(4, false);
        System.out.println(MiNuevaImpresora.getPaginasImpresas() + " paginas impresas con esta impresora");
    }
}