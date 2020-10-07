package com.example.catalogoastronomico;
/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */

public class Astro {

    //ATRIBUTOS DE ASTRO
    private String nombre;
    private double brillo;
    private double distancia;



    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public double getBrillo() {
        return brillo;
    }

    public double getDistancia() {
        return distancia;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBrillo(double brillo) {
        this.brillo = brillo;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    //por defecto
    public Astro (){
        this.nombre = "Sirius";
        this.brillo = -1.42;
        this.distancia = 8.7;
    }

    //parametrizado
    public Astro (String nombre, double brillo , double distancia){
            this.nombre = nombre;
            this.brillo = brillo;
            this.distancia = distancia;
    }

    //Método más distante

    public boolean masDistante(Astro otro){
        if (this.distancia > otro.distancia){
            return true;
        }else{
            return false;
        }
    }


    //Método más brillante

    public int masBrillante(Astro otro){
        if (this.brillo > otro.brillo){
            return 1;
        }else if (this.brillo < otro.brillo){
            return -1;
        }else if (this.brillo == otro.brillo){
            return 0;
        }
        return 0;
    }


    //Método visible con

    public String visibleCon(){
        if (this.brillo < 5){
            return "a simple vista";
        }else if (this.brillo < 7){
            return "con prismáticos";
        }else if (this.brillo < 25){
            return "con telescopio";
        }else{
            return "con grandes telescopios";
        }
    }


    //Método toString

    @Override
    public String toString() {
        return "objeto-Astro {" +
                "nombre: " + nombre +
                ", brillo: " + brillo +
                ", distancia: " + distancia +
                '}';
    }


    //Método equals
    public boolean equals(Astro otro){
        if (this.distancia == otro.getDistancia() && this.brillo == otro.getBrillo() && this.nombre.equals(otro.getNombre())){
            return true;
        }else{
            return false;
        }
    }
}
