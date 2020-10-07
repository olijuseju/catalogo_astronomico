package com.example.catalogoastronomico;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */

public enum TipoEstrella {
    ENANA_AMARILLA("Enana Amarilla", "https://es.wikipedia.org/wiki/Estrella_de_tipo-G_de_la_secuencia_principal"),
    ENANA_BLANCA("Enana Blanca", "https://es.wikipedia.org/wiki/Enana_blanca"),
    GIGANTE_ROJA("Gigante Roja", "https://es.wikipedia.org/wiki/Gigante_roja"),
    SUBGIGANTE_BLANCA("Subgigante Blanco", "https://es.wikipedia.org/wiki/Subgigante");

    private String infoTipo;
    private String infoWiki;
    TipoEstrella(String wiki, String tipo){
        this.infoTipo = tipo;
        this.infoWiki = wiki;
    }

    public String getInfoTipo() {
        return infoTipo;
    }

    public void setInfoTipo(String infoTipo) {
        this.infoTipo = infoTipo;
    }

    public String getInfoWiki() {
        return infoWiki;
    }

    public void setInfoWiki(String infoWiki) {
        this.infoWiki = infoWiki;
    }

}
