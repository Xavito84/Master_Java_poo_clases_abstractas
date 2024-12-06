package org.xmartinez.tarea24.elementos;

public class Lobo extends Canino{

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo de la especie "+this.especieLobo+" se disppne a comer junto a su camanda de "+ this.numCamada+" gracias a su tamaño de colmillos que es de "+ tamanioColmillos;
    }

    @Override
    public String dormir() {
        return"El lobo de la especie "+this.especieLobo+"cuyo peso es "+peso+", altura "+altura+", largo "+largo+ " se dispone a dormir junto a su camada de "+this.numCamada;
    }

    @Override
    public String correr() {
        return "El lobo de color "+ color+" esta corriendo en su habitat"+habitat;
    }

    @Override
    public String comunicarse() {
        return "El lobo cuyo nombre cientifico es "+ nombreCientifico+" la forma de comunicarse es ayundo!";
    }
}
