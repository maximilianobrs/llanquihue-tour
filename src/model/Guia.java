package model;

/**
 * Representa un guía turístico de la agencia Llanquihue Tour.
 * Contiene información básica como nombre y tipo de guía.
 * @author Maximiliano
 */

public class Guia {
    private String nombre,tipo;

    public Guia() {
    }

    public Guia(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Guia: { " + "Nombre: " + nombre + " | " + "Tipo: " + tipo + " }";
    }
}
