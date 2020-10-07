package com.example.catalogoastronomico;/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class Estrella extends Astro{

    private int planetas;
    private Galaxia galaxia;


    //constructor
    public Estrella(String nombre, double brillo , double distancia, int planetas,Galaxia galaxia){
        super(nombre, brillo, distancia);
        this.planetas = planetas;
        this.galaxia = galaxia;
    }



    //getters y setters


    public int getPlanetas() {
        return planetas;
    }

    public void setPlanetas(int planetas) {
        this.planetas = planetas;
    }

    public Galaxia getGalaxia() {
        return galaxia;
    }

    public void setGalaxia(Galaxia galaxia) {
        this.galaxia = galaxia;
    }


    //To string


    @Override
    public String toString() {
        return "objeto-Astro {" +
                "nombre: " + this.getNombre() +
                ", tipo: " + this.getClass().getSimpleName() +
                ", brillo: " + this.getBrillo() +
                ", distancia: " + this.getDistancia() +
                ", planetas: " + planetas +
                ", galaxia: " + galaxia.getNombre() +
                '}';
    }


    //equals

    public boolean equals(Estrella otro){
        if (this.getDistancia() == otro.getDistancia() && this.getBrillo() == otro.getBrillo() && this.getNombre().equals(otro.getNombre()) && this.planetas ==otro.getPlanetas() ){
            return true;
        }else{
            return false;
        }
    }
}
