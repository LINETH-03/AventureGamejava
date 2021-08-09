package com.company;

import java.util.SplittableRandom;

public class Heroes extends Personaje {
    public Coordenadas heroe;
    public Heroes() {
        setNombre("IRON MAN");
        setEnergia(10);
        setVidas(3);
        setOfensiva(8);

    }


    Mueble [] Mochila;

    public String action(){
        String name=this.getNombre();
        int energia=this.getEnergia();
        int vida=this.getVidas();
        int defender=this.getOfensiva();
        String acton = name+" Tiene energia : " +energia+ " tiene "+vida+" vidas y ataque defensiva una carga de "+defender;
        return acton;

    }




}
