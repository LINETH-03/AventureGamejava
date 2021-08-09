package com.company;

public class Main {


    public static void main(String[] args) {
        //Instancia para la Clase Heroes
        Heroes Heroe1 = new Heroes();
        System.out.println(Heroe1.action());
        Heroes ataque = new Heroes();
        ataque.Mochila = new Mueble[3];
        //agregando los muebles a la mochila
        Mueble objeto1= new Mueble ("Arma");
        Mueble objeto2= new Mueble ("Alimentos");
        Mueble objeto3= new Mueble ("Proyectiles");
        ataque.Mochila[0]= objeto1;
        ataque.Mochila[1]= objeto2;
        ataque.Mochila[2]= objeto3;


        System.out.println(ataque.getNombre()+" EN LA MOCHILA TIENE LOS OBJETOS:");
        for(int i=0;i<ataque.Mochila.length;i++)
        {
            System.out.println(ataque.Mochila[i].getObjeto());
        }
        //Probando la funcionalidad del potenciador en el objeto 1 Arma
        objeto1.Potenciador(ataque);
        //instancia para la Clase Enemigos
        Enemigos enemigo1 = new Enemigos();
        System.out.println(enemigo1.actionEnem());
        //probando que todas las clases se pueden instanciar
        Mueble mueble1 = new Mueble();
        Inmuebles inmuble= new Inmuebles();
        Coordenadas cordenadas = new Coordenadas();







    }
}
