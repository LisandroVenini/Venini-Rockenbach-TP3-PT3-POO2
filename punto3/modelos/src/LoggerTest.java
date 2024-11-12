/**
 * La clase LoggerTest simula el uso del sistema de logging mediante varios hilos.
 * Cada hilo escribe mensajes de diferentes niveles en el archivo de log utilizando
 * la instancia única de Logger.
 */
public class LoggerTest {

    /**
     * Método principal que ejecuta múltiples hilos para registrar mensajes en el log.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Simulamos múltiples hilos que intentan escribir en el log
        Runnable task = () -> {
            Logger logger = Logger.getInstance();
            logger.info("Información de un proceso.");
            logger.warning("Advertencia de un proceso.");
            logger.error("Error de un proceso.");
        };

        // Crear y ejecutar 5 hilos que intentan escribir en el log
        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }
    }
}

