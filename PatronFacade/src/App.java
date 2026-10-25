public class App {
    public static void main(String[] args) {
        ComputadoraFacade computadora = new ComputadoraFacade();

        System.out.println("=== Encendiendo la computadora ===");
        computadora.encender(); // una sola llamada, múltiples pasos internos

        System.out.println();

        System.out.println("=== Apagando la computadora ===");
        computadora.apagar();
    }
}