package data;

import model.Tour;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorDatos {
    public static ArrayList<Tour> cargarTours(String rutaDatos){
        ArrayList <Tour> listaTours = new ArrayList<>();
        try{
            File archivo = new File(rutaDatos);
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()){
                String linea = lector.nextLine();

                String[] partes =linea.split(";");

                if (partes.length == 4){
                    String idUnico = partes[0];
                    String nombreTour = partes[1];
                    String tipoTour = partes[2];
                    int precio = Integer.parseInt(partes[3]);

                    listaTours.add(new Tour(idUnico,nombreTour,tipoTour,precio));
                }

            }

            lector.close();

        } catch (Exception e) {
            System.out.println("Error al lear el archivo de datos de tours" + e.getMessage());
        }
        return listaTours;
    }
}
