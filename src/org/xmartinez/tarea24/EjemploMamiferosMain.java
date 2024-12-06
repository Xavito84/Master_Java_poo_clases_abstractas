package org.xmartinez.tarea24;

import org.xmartinez.tarea24.elementos.*;

public class EjemploMamiferosMain {
    public static void main(String[] args) {

        Mamifero [] mamiferos = new Mamifero[7];

        Mamifero leon= new Leon("Sabana africana", 0.80f, 1.86f,70.0f,"Panthera leo",0.30f,74.0f,20,114f);
        Mamifero gueopardo= new Guepardo("Sabana africana",0.45f,1.56f,54f,"Acinonyx jubatus",0.30f,110f);
        Mamifero tigre = new Tigre("Tailandia",0.70f, 1.75f,75f,"Panthera tigris",0.35f,50f,"Bengala");
        Mamifero lobo= new Lobo("Españana",0.4f,1.30f,33f,"Canis lupus","blanco", 0.1f, 10, "Ártico");
        Mamifero perro= new Perro("Españana",0.25f,1.30f,28f,"Canis lupus familiaris","marrón", 0.1f, 0);

        mamiferos[0]= leon;
        mamiferos[1]= gueopardo;
        mamiferos[2]=tigre;
        mamiferos[3]=lobo;
        mamiferos[4]=perro;

        for( Mamifero animal: mamiferos){
            if(animal != null){
                System.out.println(animal.comer());
                System.out.println(animal.dormir());
                System.out.println(animal.correr());
                System.out.println(animal.comunicarse());
                System.out.println("--------------------------------");
            }

        }

    }
}
