public class ComputadoraFacade {

    // Valores de arranque que solo la fachada necesita conocer
    private static final long DIRECCION_ARRANQUE = 0;
    private static final long SECTOR_ARRANQUE = 0;
    private static final int TAMANO_ARRANQUE = 1024;

    // REFERENCIAS AL SUBSISTEMA: privadas, el cliente no accede a ellas
    private CPU cpu;
    private Memoria memoria;
    private DiscoDuro disco;

    // La fachada crea y administra los objetos del subsistema
    public ComputadoraFacade() {
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.disco = new DiscoDuro();
    }

    // MÉTODO DE ALTO NIVEL: una sola llamada para el cliente.
    // Aquí vive la secuencia correcta de pasos (el orden importa).
    public void encender() {
        cpu.iniciar();
        String datos = disco.leer(SECTOR_ARRANQUE, TAMANO_ARRANQUE);
        memoria.cargar(DIRECCION_ARRANQUE, datos);
        cpu.ejecutar(DIRECCION_ARRANQUE);
    }

    // MÉTODO DE ALTO NIVEL: oculta la secuencia de apagado.
    public void apagar() {
        cpu.detener();
        memoria.liberar();
        disco.detener();
    }
}