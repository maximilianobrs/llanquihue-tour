package model;

/**
 * Clase que reprecentara un Tour de la agencia.
 * Que tiene como atributos un id, nombre, tipo, precio.
 * Como tambien contienes sus dos contructores como suss metodos tostring, getter y setter.
 * @author Maximiliano
 */

public class Tour {
    private String idUnico,nombreTour,tipoTour;
    private int precio;

    public Tour(){}

    public Tour(String idUnico, String nombreTour, String tipoTour, int precio) {
        this.idUnico = idUnico;
        this.nombreTour = nombreTour;
        this.tipoTour = tipoTour;
        this.precio = precio;
    }

    public String getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(String idUnico) {
        this.idUnico = idUnico;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public String getTipoTour() {
        return tipoTour;
    }

    public void setTipoTour(String tipoTour) {
        this.tipoTour = tipoTour;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "ID: " + getIdUnico() +
                " | Nombre: " + getNombreTour() +
                " | tipo tour: " + getTipoTour() +
                " | Precio: $" + getPrecio();
    }
}
