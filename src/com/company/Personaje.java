package com.company;

public class Personaje {
    private String nombre;
    private int energia;
    private int vidas;
    private int ofensiva;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getOfensiva() {
        return ofensiva;
    }

    public void setOfensiva(int ofensiva) {
        this.ofensiva = ofensiva;
    }
    public void AddOfensiva(int n){
        ofensiva += n;
    }

}
