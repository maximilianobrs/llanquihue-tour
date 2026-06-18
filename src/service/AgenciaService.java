package service;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

/**
 * Servicio encargado de la lógica de negocio de la agencia.
 * Permite listar y filtrar tours.
 * @author Maximiliano
 */

public class AgenciaService {

    private ArrayList<Tour> tours;

    /**
     * Al crear la agencia, se leen los paseos desde el archivo de texto.
     */
    public AgenciaService() {
        tours = GestorDatos.cargarTours("resources/tours.txt");
    }

    /**
     * Muestra en la pantalla todos los tours guardados.
     */
    public void listarTours() {
        System.out.println("\n==== TODOS LOS TOURS REGISTRADOS ====\n");

        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    /**
     * Muestra solo los paseos que cuesten más que el precio ingresado.
     * @param precio costo mínimo a buscar.
     */
    public void toursCaros(int precio) {
        System.out.println("\n==== TOURS CON PRECIO MAYOR A $" + precio + " ====\n");

        for (Tour tour : tours) {
            if (tour.getPrecio() > precio) {
                System.out.println(tour);
            }
        }
    }

    /**
     * Muestra solo los paseos que coincidan con la categoría buscada.
     * @param tipo categoría del paseo Naturaleza o Aventura etc.
     */
    public void toursPorTipo(String tipo) {
        System.out.println("\n==== TOURS " + tipo + " ====\n");

        for (Tour tour : tours) {
            if (tour.getTipoTour().equalsIgnoreCase(tipo)) {
                System.out.println(tour);
            }
        }
    }
}
