package com.company;


public class Mueble {
    public Coordenadas movibles;



    private String objeto;

    public Mueble() {

    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public Mueble(String objeto) {
        this.objeto = objeto;
    }
   public void Potenciador(Personaje n){
        n.AddOfensiva(25);
    }

}
