/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Duoc
 */
public class Ticket {

    private int numero, precio;
    private Date fecha;
    private String asiento;
    private Pasajero pasajero;
    private Vuelo vuelo;

    public Ticket() {
    }

    public Ticket(int numero, int precio, Date fecha, String asiento, Pasajero pasajero, Vuelo vuelo) {
        this.numero = numero;
        setPrecio(precio);
        this.fecha = fecha;
        this.asiento = asiento;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.err.println("Precio no debe ser 0 o inferior");
        }
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", precio=" + precio + ", fecha=" + fecha + ", asiento=" + asiento + ", pasajero=" + pasajero + ", vuelo=" + vuelo + '}';
    }

    public void mostrarInformacion() {
        if (getVuelo() != null && getPasajero() != null) {
            System.out.println("--------------------------------------------");
            System.out.println("   " + getVuelo().getNombre());
            System.out.println("--------------------------------------------");
            System.out.println("Pasajero: " + getPasajero().getNombre());
            System.out.println("Asiento: " + getAsiento());
            if (getVuelo().getAvion() != null) {
                System.out.println("Tamaño avion: " + String.valueOf(getVuelo().getAvion().getTamanio()).toUpperCase());
            }
            System.out.println("--------------------------------------------");
            if (getVuelo().getTipo().equalsIgnoreCase("comercial")) {
                aplicarDescuento();
            } else {
                System.out.println("Precio: " + getPrecio());
            }
            System.out.println("--------------------------------------------");
        } else {
            System.err.println("No hay informacion suficiente para mostrar");
        }
    }

    public int aplicarDescuento() {
        int nuevoPrecio = getPrecio() - (getPrecio()* 12 / 100);
        System.out.println("Precio con descuento: " + nuevoPrecio);
        return nuevoPrecio;
    }

}
