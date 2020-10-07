package com.example.catalogoastronomico;

import java.util.Objects;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class Planeta extends Astro {

    private boolean habitado;
    private Estrella estrella;



    //constructor

    public Planeta(String nombre, double brillo , double distancia, boolean habitado, Estrella estrella){
        super(nombre, brillo, distancia);
        this.habitado = habitado;
        this.estrella = estrella;
    }




    //Getters y setters


    public boolean isHabitado() {
        return habitado;
    }

    public void setHabitado(boolean habilitado) {
        this.habitado = habilitado;
    }

    public Estrella getEstrella() {
        return estrella;
    }




    public void setEstrella(Estrella estrella) {
        this.estrella = estrella;
    }


    //To string


    @Override
    public String toString() {
        return "objeto-Astro {" +
                "nombre: " + this.getNombre() +
                ", tipo: " + this.getClass().getSimpleName() +
                ", brillo: " + this.getBrillo() +
                ", distancia: " + this.getDistancia() +
                ", habitado: " + habitado +
                ", estrella: " + estrella.getNombre() +
                '}';
    }


    //equals

    public boolean equals(Planeta otro){
        if (this.getDistancia() == otro.getDistancia() && this.getBrillo() == otro.getBrillo() && this.getNombre().equals(otro.getNombre()) && this.habitado==otro.isHabitado() && this.estrella.equals(otro.getEstrella())){
            return true;
        }else{
            return false;
        }
    }
}
