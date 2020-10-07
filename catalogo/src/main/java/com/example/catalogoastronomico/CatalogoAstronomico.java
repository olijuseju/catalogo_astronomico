package com.example.catalogoastronomico;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class CatalogoAstronomico {

    private ArrayList<Astro> catalogo;
    private HashSet<String> galaxias;
    private int numEstrellasSimpleVista;


    //getters


    public ArrayList getCatalogo() {
        return catalogo;
    }

    public HashSet getGalaxias() {
        return galaxias;
    }

    public int getNumEstrellasSimpleVista() {
        return numEstrellasSimpleVista;
    }


    //Constructor

    public CatalogoAstronomico (){
        catalogo = new ArrayList<Astro>();
        galaxias = new HashSet<String>();
        numEstrellasSimpleVista = 0;
    }

    // Es estrella a simple vista

    public boolean esEstrellaSimpleVista(int i){
        if (this.catalogo.get(i).getClass().getSimpleName().equals("Estrella")){
            if (this.catalogo.get(i).visibleCon().equals("a simple vista")){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public boolean anade(Astro a){
        int num = 0;
        for (Astro astro:catalogo) {
            if (astro.getNombre().equals(a.getNombre())){
                num++;
            }
        }
        if (num == 0){
            catalogo.add(a);


            if(a.getClass().getSimpleName().equals("Galaxia")){
                galaxias.add(a.getNombre());
            }
            if(a.getClass().getSimpleName().equals("Estrella") || a.getClass().getSimpleName().equals("EstrellaConTipo")){
                galaxias.add(((Estrella)a).getGalaxia().getNombre());
                catalogo.add(((Estrella)a).getGalaxia());
                if (a.visibleCon().equals("a simple vista")) {
                    numEstrellasSimpleVista ++;
                }
            }
            if(a.getClass().getSimpleName().equals("Planeta")){
                galaxias.add(((Planeta)a).getEstrella().getGalaxia().getNombre());
                catalogo.add(((Planeta)a).getEstrella());
                catalogo.add(((Planeta)a).getEstrella().getGalaxia());
            }
            return true;
        }else{
            return false;
        }

    }
    public void borrar(String nombre){
        ArrayList<Astro> borrados = new ArrayList<>();
        for (Astro astro:catalogo) {
            if (astro.getNombre().equals(nombre)){
                borrados.add(astro);
                if(astro.getClass().getSimpleName().equals("Estrella") || astro.getClass().getSimpleName().equals("EstrellaConTipo")) {
                    if (astro.visibleCon().equals("a simple vista")) {
                        numEstrellasSimpleVista--;
                    }
                }
                if(astro.getClass().getSimpleName().equals("Galaxia")){
                    galaxias.remove(astro.getNombre());
                }
            }
        }
        catalogo.removeAll(borrados);
    }

    public Astro buscaAstro(String nombre){
        for (Astro astro:catalogo) {
            if (astro.getNombre().equals(nombre)){
                return astro;
            }
        }
        return null;
    }

    public Astro primeroMasBrillanteQue(Astro a){
        for (Astro astro:catalogo) {
            if (Math.abs(astro.getBrillo()) > Math.abs(a.getBrillo())){
                return astro;
            }
        }
        return null;
    }

    public ArrayList<Astro> filtraEstrellasSimpleVista(){
        ArrayList<Astro> lista = new ArrayList<Astro>();
        for (Astro astro:catalogo) {
            if(astro.getClass().getSimpleName().equals("Estrella") || astro.getClass().getSimpleName().equals("EstrellaConTipo")){
                galaxias.add(((Estrella)astro).getGalaxia().getNombre());
                if (astro.visibleCon().equals("a simple vista")) {
                    lista.add(astro);
                }
            }
        }
        return lista;
    }


    public Astro brillaMas(){
        Astro masbrillante = new Astro();
        for (int i = 0; i <catalogo.size(); i++){
            if (Math.abs(masbrillante.getBrillo()) < Math.abs(catalogo.get(i).getBrillo())){
                masbrillante = catalogo.get(i);
            }
        }
        return masbrillante;
    }

    @Override
    public String toString() {
        String res= "";
        for (Astro astro:catalogo) {
            if(astro.getClass().getSimpleName().equals("Estrella")){

                res += "objeto-Astro {" +
                        "nombre: " + ((Estrella)astro).getNombre() +
                        ", tipo: " + astro.getClass().getSimpleName() +
                        ", brillo: " + astro.getBrillo() +
                        ", distancia: " + astro.getDistancia() +
                        ", galaxia: " + ((Estrella)astro).getGalaxia().getNombre() +
                        '}' + "\n";
            }
            if(astro.getClass().getSimpleName().equals("Planeta")){
                res += "objeto-Astro {" +
                        "nombre: " + astro.getNombre() +
                        ", tipo: " + astro.getClass().getSimpleName() +
                        ", brillo: " + astro.getBrillo() +
                        ", distancia: " + astro.getDistancia() +
                        ", habitado: " + ((Planeta)astro).isHabitado() +
                        ", estrella: " + ((Planeta)astro).getEstrella().getNombre() +
                        ", galaxia: " + ((Planeta)astro).getEstrella().getGalaxia().getNombre() +
                        '}' + "\n";
            }
            if(astro.getClass().getSimpleName().equals("Galaxia")){
                res += "objeto-Astro {" +
                        "nombre: " + astro.getNombre() +
                        ", tipo: " + ((Galaxia)astro).getClass().getSimpleName() +
                        ", brillo: " + astro.getBrillo() +
                        ", distancia: " + astro.getDistancia() +
                        '}' + "\n";
            }
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatalogoAstronomico that = (CatalogoAstronomico) o;
        return numEstrellasSimpleVista == that.numEstrellasSimpleVista &&
                catalogo.equals(that.catalogo) &&
                galaxias.equals(that.galaxias);
    }

}