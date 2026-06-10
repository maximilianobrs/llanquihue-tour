package data;

import model.Tour;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase encargada de gestionar la lectura de datos
 * desde archivos de texto para crear objetos Tour.
 * @author Maximiliano Briones Aguilera
 */

public class GestorDatos {
    public static ArrayList<Tour> cargarTours(String rutaDatos){

        ArrayList <Tour> listaTours = new ArrayList<>();

        try{
            File archivo = new File(rutaDatos);
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()){
                String linea = sc.nextLine();

                String[] dato =linea.split(";");

                if (dato.length == 4){
                    String idUnico = dato[0];
                    String nombreTour = dato[1];
                    String tipoTour = dato[2];
                    int precio = Integer.parseInt(dato[3]);

                    Tour tour = new Tour();
                    tour.setIdUnico(idUnico);
                    tour.setNombreTour(nombreTour);
                    tour.setTipoTour(tipoTour);
                    tour.setPrecio(precio);

                    listaTours.add(tour);
                }

            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Error al leer el archivo .txt de tours: " + e.getMessage());
        }
        return listaTours;
    }
}
