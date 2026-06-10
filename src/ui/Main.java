package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

/**
 * Clase principal de la aplicación Llanquihue Tour.
 * Permite cargar información de tours desde un archivo
 * de texto y realizar consultas básicas sobre los datos.
 * @author Maximiliano
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Tour> lista = GestorDatos.cargarTours("src/resources/tours.txt");

        System.out.println("\n==== TODOS LOS TOURS REGISTRADOS ====\n");
        System.out.println(lista);

        System.out.println("\n==== TOURS CON PRECIO MENOR A 40000 ====\n");
        for(Tour tour : lista){
            if (tour.getPrecio() < 40000){
                System.out.println("menor que 40000 ====> " + tour);
            }
        }

        System.out.println("\n==== TOURS CULTURALES ====\n");
        for(Tour tour : lista){
            if (tour.getTipoTour().contains("Cultural")){
                System.out.println("Tours culturales ====> " + tour);
            }
        }
    }
}
