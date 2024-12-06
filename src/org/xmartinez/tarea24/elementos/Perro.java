package org.xmartinez.tarea24.elementos;

public class Perro extends Canino{

    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanioColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro cuyo nombre cientifico es "+ nombreCientifico+" se dispone a comer gracias a la fuerza de mordida de "+ this.fuerzaMordida+ " y su tamaño de colmillos es "+ tamanioColmillos;
    }

    @Override
    public String dormir() {
        return "El perro cuyo peso es "+peso+", altura "+altura+", largo "+largo+ " se dispone a dormir!!";
    }

    @Override
    public String correr() {
        return  "El perro de color "+ color+" esta corriendo en su habitat"+habitat;
    }

    @Override
    public String comunicarse() {
        return "El perro cuyo nombre cientifico es "+ nombreCientifico+" la forma de comunicarse es ayundo!";
    }
}
