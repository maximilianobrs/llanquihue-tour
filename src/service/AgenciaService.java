package service;

import model.Tour;
import java.util.ArrayList;

/**
 * Servicio encargado de la lógica de negocio de la agencia.
 * Permite listar y filtrar tours.
 * @author Maximiliano
 */

public class AgenciaService {

    private ArrayList<Tour> tours;

    public AgenciaService(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    // Mostrar todos los tours
    public void listarTours() {
        System.out.println("\n==== TODOS LOS TOURS REGISTRADOS ====\n");

        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    // Filtrar por precio
    public void toursCaros(int precio) {
        System.out.println("\n==== TOURS CON PRECIO MAYOR A $" + precio + " ====\n");

        for (Tour tour : tours) {
            if (tour.getPrecio() > precio) {
                System.out.println(tour);
            }
        }
    }

    // Filtrar por tipo
    public void toursPorTipo(String tipo) {
        System.out.println("\n==== TOURS " + tipo + " ====\n");

        for (Tour tour : tours) {
            if (tour.getTipoTour().equalsIgnoreCase(tipo)) {
                System.out.println(tour);
            }
        }
    }
}
