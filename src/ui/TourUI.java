package ui;
import service.AgenciaService;

/**
 * Clase encargada de la interfaz de usuario del sistema.
 * - Mostrar información al usuario
 * - Solicitar datos de entrada (si aplica)
 * - Invocar los servicios de negocio (AgenciaService)
 */
public class TourUI {

    private AgenciaService service;

    public TourUI(AgenciaService service) {
        this.service = service;
    }

    public void mostrar() {
        service.listarTours();
        service.toursCaros(40000);
        service.toursPorTipo("Cultural");
    }

}
