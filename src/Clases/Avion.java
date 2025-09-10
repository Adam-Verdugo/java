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
public class Avion {
    private int codigo, capacidad;
    private String modelo;
    private char tamanio;

    public Avion() {
    }

    public Avion(int codigo, int capacidad, String modelo, char tamanio) {
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.tamanio = tamanio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public char getTamanio() {
        return tamanio;
    }

    public void setTamanio(char tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Avion{" + "codigo=" + codigo + ", capacidad=" + capacidad + ", modelo=" + modelo + ", tamanio=" + tamanio + '}';
    }
    
    
}
