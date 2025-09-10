/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Duoc
 */
public class Vuelo {

    private int id;
    private String nombre, tipo;
    private Avion avion;

    public Vuelo() {
    }

    public Vuelo(int id, String nombre, String tipo, Avion avion) {
        this.id = id;
        this.nombre = nombre;
        setTipo(tipo);
        this.avion = avion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        if (tipo.trim().equalsIgnoreCase("Comercial") || tipo.trim().equalsIgnoreCase("Turista")) {
            this.tipo = tipo;
        } else {
            System.err.println("Tipo de vuelo no válido (Comercial o turista)");
        }
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", avion=" + avion + '}';
    }
}
