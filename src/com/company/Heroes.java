package com.company;



public class Heroes extends Personaje {
    //asociacion de coordenadas con el HEROE
    public Coordenadas heroe;
    public Heroes() {
        setNombre("IRON MAN");
        setEnergia(10);
        setVidas(3);
        setOfensiva(8);

    }

    //declarar Mueble como un arreglo que se usara para la agregar los onjetos a la mochila
    Mueble [] Mochila;


    public String action(){
        String name=this.getNombre();
        int energia=this.getEnergia();
        int vida=this.getVidas();
        int defender=this.getOfensiva();
        String acton = name+" Tiene energia a nivel " +energia+ " tiene "+vida+" vidas y ataque defensiva una carga de "+defender;
        return acton;

    }




}
