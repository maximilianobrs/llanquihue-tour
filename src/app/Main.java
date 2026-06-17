package app;
import model.Tour;
import data.GestorDatos;
import service.AgenciaService;
import ui.TourUI;
import java.util.ArrayList;

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

        ArrayList<Tour> tours = GestorDatos.cargarTours("resources/tours.txt");

        AgenciaService service = new AgenciaService(tours);

        TourUI ui = new TourUI(service);
        ui.mostrar();
    }
}
