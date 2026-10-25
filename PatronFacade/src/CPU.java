public class CPU {

    public void iniciar() {
        System.out.println("CPU: iniciando procesador...");
    }

    public void ejecutar(long direccion) {
        System.out.println("CPU: ejecutando instrucciones desde la dirección " + direccion);
    }

    public void detener() {
        System.out.println("CPU: deteniendo procesador...");
    }
}