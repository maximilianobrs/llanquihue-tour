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

        AgenciaService agencia = new AgenciaService();
        agencia.cargarDatos(); //inicia la lectura del gestor de datos

        TourUI ui = new TourUI(agencia);
        ui.mostrar(); // Muestra la información de los tours por consola
    }
}
