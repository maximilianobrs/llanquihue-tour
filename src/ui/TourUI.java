package ui;
import service.AgenciaService;

/**
 * Clase encargada de presentar la información por consola.
 * Invoca los servicios de negocio y muestra los resultados.
 *
 * @author Maximiliano
 */

public class TourUI {

    private AgenciaService service;

    public TourUI(AgenciaService service) {
        this.service = service;
    }

    public void mostrar() {
        service.listarTours();
        service.mostrarToursDesde(30000);
        service.toursPorTipo("Cultural");
    }

}
