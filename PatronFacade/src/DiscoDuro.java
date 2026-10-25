public class DiscoDuro {

    public String leer(long sector, int tamano) {
        System.out.println("Disco: leyendo " + tamano + " bytes desde el sector " + sector);
        return "Sistema Operativo";
    }

    public void detener() {
        System.out.println("Disco: deteniendo discos...");
    }
}