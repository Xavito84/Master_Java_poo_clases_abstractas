package org.xmartinez.tarea24.elementos;

public class Tigre extends Felino{


    private String especieTigre;




    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, float velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre de la especie "+ this.especieTigre+" se dispone a comer en su habitat "+ habitat+ " y con un peso de "+ peso+" kg!!";
    }

    @Override
    public String dormir() {
        return "El tigre de la especie "+ this.especieTigre+ " con un largo de "+ largo+ " y con una altura de" + altura+ " se ha dormido!!";
    }

    @Override
    public String correr() {
        return "El tigre de la especie "+this.especieTigre+" esta corriendo ha una velocidad de "+ velocidad+" km/h, gracias a sus garras que miden "+ tamanioGarras+"!!";
    }

    @Override
    public String comunicarse() {
        return "El tigre de la especie "+ this.especieTigre+ " emite un ronroneo para comunicarse!!";
    }


}
