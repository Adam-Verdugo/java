/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Clases.*;
import java.util.Date;

/**
 *
 * @author Duoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pasajero p1 = new Pasajero(1111111, "Pepe Tapia", 30, 'h');
        Pasajero p2 = new Pasajero(2222222, "Carla Vera", 19, 'm');
        Pasajero p3 = new Pasajero(3333333, "Alfredo Kutch", 19, 'h');

        Avion a1 = new Avion(101010, 600, "Boeing", 'm');
        Avion a2 = new Avion(202020, 700, "CHAWD23", 'g');
        Avion a3 = new Avion(303030, 2, "F22", 'p');
        
        Vuelo v1 = new Vuelo(100, "Chile-Argentina", "Turista",a1);
        Vuelo v2 = new Vuelo(100, "Chile-China", "Comercial",a2);
        
        Ticket t1 = new Ticket(6001, 80000, new Date(), "B5", p1, v1);
        Ticket t2 = new Ticket(6002, 500000, new Date(), "B6", p2, v2);
        
        t2.mostrarInformacion();

    }

}
