package model;

/**
 * Representa un tour turístico de la agencia Llanquihue Tour.
 * Contiene información del tour y su guía asociado.
 * @author Maximiliano
 */

public class Tour {
    private String idUnico,nombreTour,tipoTour;
    private int precio;
    private Guia guia;

    public Tour(){}

    public Tour(String idUnico, String nombreTour, String tipoTour, int precio, Guia guia) {
        this.idUnico = idUnico;
        this.nombreTour = nombreTour;
        this.tipoTour = tipoTour;
        this.precio = precio;
        this.guia = guia;
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

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    @Override
    public String toString() {
        return  "ID: " + getIdUnico() +
                " | Nombre ruta: " + getNombreTour() +
                " | Tipo tour: " + getTipoTour() +
                " | Precio: $" + getPrecio() +
                " | " + getGuia();
    }
}
