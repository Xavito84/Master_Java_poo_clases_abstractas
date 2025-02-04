package org.xmartinez.tarea24.elementos;

abstract public class Canino extends Mamifero{
    protected String color;
    protected float tamanioColmillos;

    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanioColmillos() {
        return tamanioColmillos;
    }

    public void setTamanioColmillos(float tamanioColmillos) {
        this.tamanioColmillos = tamanioColmillos;
    }
}
