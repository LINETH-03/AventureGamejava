package com.company;

public class Enemigos extends Personaje {

   public Coordenadas enemigos;
    public Enemigos() {
        setNombre("Ultron");
        setEnergia(10);
        setVidas(3);
        setDefensiva(5);
    }
    public String actionEnem(){
        String name=this.getNombre();
        int energia=this.getEnergia();
        int vida=this.getVidas();
        int defender=this.getDefensiva();
        String acton = name+" Tiene energia : " +energia+ " tiene "+vida+" vidas y ataque defensiva una carga de "+defender;
        return acton;

    }
}
