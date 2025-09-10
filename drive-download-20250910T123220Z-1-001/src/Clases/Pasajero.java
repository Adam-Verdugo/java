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
public class Pasajero {
    private int rut;
    private String nombre;
    private int edad;
    private char genero;

    public Pasajero() {
    }

    public Pasajero(int rut, String nombre, int edad, char genero) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + '}';
    }
        
}


