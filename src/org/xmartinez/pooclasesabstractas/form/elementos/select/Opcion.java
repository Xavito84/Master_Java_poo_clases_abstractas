package org.xmartinez.pooclasesabstractas.form.elementos.select;

public class Opcion {
    private String valor;
    private  String nombre;
    private boolean selected;

    // Construct


    public Opcion() {
    }

    public Opcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public Opcion(String valor, String nombre, boolean selected) {
        this(valor, nombre);
        this.selected = selected;
    }
    //getter/setter

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    public Opcion setSelected(boolean selected) {

        this.selected = selected;
        return this;
    }
}
