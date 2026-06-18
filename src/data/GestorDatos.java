package data;

import model.Tour;
import model.Guia;
import util.Validador;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase encargada de gestionar la lectura de datos
 * desde archivos de texto para crear objetos Tour.
 *
 * @author Maximiliano
 */

public class GestorDatos {

    /**
     * Carga tours desde archivo de texto.
     *
     * @param rutaDatos ruta del archivo .txt
     * @return lista de tours
     */

    public static ArrayList<Tour> cargarTours(String rutaDatos) {

        ArrayList<Tour> listaTours = new ArrayList<>();

        try {

            Scanner sc = new Scanner(new File(rutaDatos));

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();

                String[] dato = linea.split(";");

                if (dato.length != 6) {
                    System.out.println("\nLínea inválida: " + linea);
                    continue;
                }

                try{
                    String idUnico = dato[0];
                    String nombreTour = dato[1];
                    String tipoTour = dato[2];
                    int precio = Integer.parseInt(dato[3]);

                    //validando que cada campo no este vacio
                    if (!Validador.textoValido(idUnico) ||
                            !Validador.textoValido(nombreTour) ||
                            !Validador.textoValido(tipoTour) ||
                            !Validador.textoValido(dato[4]) ||
                            !Validador.textoValido(dato[5]))
                    {
                        System.out.println("Dato ignorado: Faltan campos de texto obligatorios en la línea: " + linea);
                        continue;
                    }

                    //validando que el precio sea un numero positivo mayor a cero.
                    if (!Validador.esPositivo(precio)) {
                        System.out.println("\nDato ignorado: precio debe ser mayor a cero -> " + precio);
                        continue;
                    }


                    Guia guia = new Guia (dato[4],dato[5]);

                    listaTours.add(new Tour(idUnico, nombreTour, tipoTour, precio,guia));

                }catch (NumberFormatException e){
                    System.out.println("\nError al convertir precio en línea: " + linea);
                }
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("\nError al leer el archivo .txt de tours: " + e.getMessage());
        }
        return listaTours;
    }
}
