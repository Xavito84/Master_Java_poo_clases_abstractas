package org.xmartinez.tarea24.elementos;

public class Leon extends Felino{

    private int numManada;
    private float potenciaRugidoDecibelios;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, float velocidad, int numManada, float potenciaRugidoDecibelios) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibelios = potenciaRugidoDecibelios;
    }

    @Override
    public String comer() {
        return "El león y su manada de "+this.numManada+" se disponen a comer en su habitat "+habitat;
    }

    @Override
    public String dormir() {
        return "El león cuyo peso es "+peso+", altura "+altura+", largo "+largo+ " se dispone a dormir junto a su manada de "+this.numManada;
    }

    @Override
    public String correr() {
        return "El león con una velocidad de "+ velocidad+" km/h y unas garras del tamaño de "+ tamanioGarras+ "esta corriendo junto a su manada de "+ this.numManada;
    }

    @Override
    public String comunicarse() {
        return "El león emite un rugido con una potencia de "+ this.potenciaRugidoDecibelios+ " decibelios, se esta comunidando con su manada!";
    }
}
