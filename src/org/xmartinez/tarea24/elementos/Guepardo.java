package org.xmartinez.tarea24.elementos;

public class Guepardo extends Felino {
    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, float velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }
    @Override
    public String comer() {
        return "El guepardo se dispone a comer en su habitat "+ habitat+ " y con un peso de "+ peso+" !!";
    }

    @Override
    public String dormir() {
        return "El guepardo con un largo de "+ largo+ " y con una altura de" + altura+ " se ha dormido!!";
    }

    @Override
    public String correr() {
        return "El guepardo esta corriendo ha una velocidad de "+ velocidad+" km/h, gracias a sus garras que miden "+ tamanioGarras+"!!";
    }

    @Override
    public String comunicarse() {
        return "El guepardo emite un gruñido para comunicarse!!";
    }
}
