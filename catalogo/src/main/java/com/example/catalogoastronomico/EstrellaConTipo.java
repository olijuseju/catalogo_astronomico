package com.example.catalogoastronomico;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class EstrellaConTipo extends Estrella {

    private TipoEstrella tipo;

    public EstrellaConTipo(String nombre, double brillo , double distancia, int planetas,Galaxia galaxia ,TipoEstrella tipo){
        super(nombre, brillo, distancia, planetas, galaxia);
        this.tipo = tipo;

    }


    public TipoEstrella getTipo() {
        return tipo;
    }

    public void setTipo(TipoEstrella tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "objeto-Astro {" +
                "nombre: " + ((Estrella)this).getNombre() +
                ", tipo: " + "EstrellaConTipo" +
                ", brillo: " + ((Estrella)this).getBrillo() +
                ", distancia: " + ((Estrella)this).getDistancia() +
                ", planetas: " + ((Estrella)this).getPlanetas() +
                ", galaxia: " + ((Estrella)this).getGalaxia().getNombre() +
                ", info: " + this.tipo.getInfoTipo()+ " " + this.tipo.getInfoWiki() +
                '}';
    }
}
