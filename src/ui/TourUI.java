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
        service.toursCaros(40000);
        service.toursPorTipo("Naturaleza");
    }

}
