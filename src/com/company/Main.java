package com.company;

public class Main {

    public static void main(String[] args) {
        Heroes Heroe1 = new Heroes();
        System.out.println(Heroe1.action());
        Heroes ataque = new Heroes();
        ataque.Mochila = new Mueble[3];
        Mueble objeto1= new Mueble ("Arma");
        Mueble objeto2= new Mueble ("Alimentos");
        Mueble objeto3= new Mueble ("Proyectiles");
        ataque.Mochila[0]= objeto1;
        ataque.Mochila[1]= objeto2;
        ataque.Mochila[2]= objeto3;
        for(int i=0;i<ataque.Mochila.length;i++)
        {
            System.out.println(ataque.Mochila[i]);
        }

    }
}
