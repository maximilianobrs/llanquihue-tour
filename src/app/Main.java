package app;
import service.AgenciaService;
import ui.TourUI;

/**
 * Clase principal del sistema Llanquihue Tour.
 * Es el punto de entrada de la aplicación.
 * - Cargar los datos desde archivos externos
 * - Inicializar los servicios del sistema
 * - Iniciar la interfaz de usuario (UI)
 *
 * @author Maximiliano
 */

public class Main {
    public static void main(String[] args) {

        // Se crea el servicio y se cargan los datos desde el archivo
        AgenciaService agencia = new AgenciaService();

        TourUI ui = new TourUI(agencia);

        // Muestra la información de los tours por consola
        ui.mostrar();
    }
}
