package app;
import service.AgenciaService;
import ui.TourUI;

/**
 * Clase principal del sistema Llanquihue Tour.
 * Actúa como punto de entrada de la aplicación.
 * Se encarga de:
 * - Crear e inicializar los componentes principales del sistema.
 * - Instanciar el servicio de gestión de tours.
 * - Iniciar la interfaz de usuario.
 *
 * @author Maximiliano
 */

public class Main {
    public static void main(String[] args) {

        // Se crea el servicio y se cargan los datos desde el archivo
        AgenciaService agencia = new AgenciaService();

        // Se crea la interfaz de usuario y se le entrega el servicio
        TourUI ui = new TourUI(agencia);

        // Muestra la información de los tours por consola
        ui.mostrar();
    }
}
