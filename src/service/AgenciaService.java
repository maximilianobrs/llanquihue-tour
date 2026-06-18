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

    private final ArrayList<Tour> tours;

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
        if (tours == null || tours.isEmpty()) {
            System.out.println("\n==== SIN RESULTADOS DE TOURS ====");
            System.out.println("No hay tours cargados en el sistema.");
            return;
        }

        System.out.println("\n==== TODOS LOS TOURS REGISTRADOS ====\n");

        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    /**
     * Muestra solo los paseos que cuesten más o igual que el precio ingresado.
     * @param precio costo mínimo a buscar.
     */
    public void mostrarToursDesde(int precio) {

        if (tours == null || tours.isEmpty()) {
            System.out.println("\n==== SIN RESULTADOS ====");
            System.out.println("No hay tours cargados en el sistema.");
            return;
        }

        boolean encontrado = false;

        System.out.println("\n==== TOURS CON PRECIO MAYOR O IGUAL $" + precio + " ====\n");

        for (Tour tour : tours) {
            if (tour.getPrecio() >= precio) {
                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron tours con precio mayor a: $" + precio);
        }

    }

    /**
     * Muestra solo los paseos que coincidan con la categoría buscada.
     * @param tipo categoría del paseo Naturaleza o Aventura etc.
     */
    public void toursPorTipo(String tipo) {

        if (tours == null || tours.isEmpty()) {
            System.out.println("\n==== SIN RESULTADOS ====");
            System.out.println("No hay tours cargados.");
            return;
        }

        System.out.println("\n==== TOURS " + tipo + " ====\n");

        boolean encontrado = false;

        for (Tour tour : tours) {
            if (tour.getTipoTour().equalsIgnoreCase(tipo)) {
                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron tours del tipo: " + tipo);
        }
    }
}
