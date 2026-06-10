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

                String[] dato =linea.split(";");

                if (dato.length == 4){
                    String idUnico = dato[0];
                    String nombreTour = dato[1];
                    String tipoTour = dato[2];
                    int precio = Integer.parseInt(dato[3]);

                    listaTours.add(new Tour(idUnico,nombreTour,tipoTour,precio));
                }

            }

            lector.close();

        } catch (Exception e) {
            System.out.println("Error al lear el archivo .txt de tours" + e.getMessage());
        }
        return listaTours;
    }
}
