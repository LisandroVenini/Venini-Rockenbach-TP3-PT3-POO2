import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * La clase Logger implementa el patrón Singleton para garantizar que
 * solo exista una instancia a lo largo de toda la aplicación.
 * Permite registrar mensajes de información, advertencia y error
 * en un archivo de log.
 */
public class Logger {

    /** Instancia única de la clase Logger. */
    private static Logger instance;

    /** Nombre del archivo de log. */
    private static final String LOG_FILE = "application.log";

    /**
     * Constructor privado para evitar instanciación externa.
     */
    private Logger() {
    }

    /**
     * Obtiene la única instancia de la clase Logger.
     * 
     * @return La instancia única de Logger.
     */
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Registra un mensaje en el archivo de log con un nivel especificado.
     * 
     * @param message  El mensaje a registrar.
     * @param logLevel El nivel de log (INFO, WARNING, ERROR).
     */
    private void log(String message, String logLevel) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             PrintWriter pw = new PrintWriter(fw)) {
            
            // Obtener la fecha y hora actual
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            
            // Escribir el mensaje en el archivo de log
            pw.println("[" + timestamp + "] [" + logLevel + "] " + message);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de log: " + e.getMessage());
        }
    }

    /**
     * Registra un mensaje de información en el archivo de log.
     * 
     * @param message El mensaje de información a registrar.
     */
    public void info(String message) {
        log(message, "INFO");
    }

    /**
     * Registra un mensaje de advertencia en el archivo de log.
     * 
     * @param message El mensaje de advertencia a registrar.
     */
    public void warning(String message) {
        log(message, "WARNING");
    }

    /**
     * Registra un mensaje de error en el archivo de log.
     * 
     * @param message El mensaje de error a registrar.
     */
    public void error(String message) {
        log(message, "ERROR");
    }
}
