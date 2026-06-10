package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Tour> lista = GestorDatos.cargarTours("src/resources/tours.txt");

        System.out.println("\n==== TODOS LOS TOURS REGISTRADOS ====\n");
        System.out.println(lista);

        System.out.println("\n==== TOURS CON PRECIO MENOR A 30000 ====\n");
        for(Tour tour : lista){
            if (tour.getPrecio() < 30000){
                System.out.println("menor que 30000 ====> " + tour);
            }
        }
    }
}
