public class Memoria {

    public void cargar(long direccion, String datos) {
        System.out.println("Memoria: cargando '" + datos + "' en la dirección " + direccion);
    }

    public void liberar() {
        System.out.println("Memoria: liberando memoria...");
    }
}