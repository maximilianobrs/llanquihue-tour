package util;

/**
 * Clase de utilidades para validaciones generales.
 * @author Maximiliano
 */

public class Validador {

    /**
     * Valida que el precio sea mayor a cero.
     * @param precio valor a evaluar.
     * @return true si es mayor a cero, false si no.
     */
    public static boolean esPositivo(int precio){
        return precio > 0;
    }

    /**
     * Valida que el String no esté vacío ni sea nulo.
     * @param str valor a evaluar.
     * @return true si cumple con tener texto, false si está vacío o es nulo.
     */
    public static boolean textoValido(String str){
        if (str == null || str.trim().isEmpty()){
            return false;
        }
        return true;
    }
}
