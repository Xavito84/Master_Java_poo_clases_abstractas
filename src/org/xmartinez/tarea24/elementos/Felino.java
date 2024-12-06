package org.xmartinez.tarea24.elementos;

abstract public class Felino extends Mamifero {

    protected float tamanioGarras;
    protected float velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, float velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }

}
