package com.example.catalogoastronomico;
/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class Galaxia extends Astro {



    //constructor

    public Galaxia (String nombre, double brillo , double distancia){
        super(nombre, brillo, distancia);
    }

    //Método toString

    @Override
    public String toString() {
        return "objeto-Astro {" +
                "nombre: " + this.getNombre() +
                ", tipo: " + this.getClass().getSimpleName() +
                ", brillo: " + this.getBrillo() +
                ", distancia: " + this.getDistancia() +
                '}';
    }
}
