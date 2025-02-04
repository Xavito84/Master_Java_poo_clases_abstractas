package org.xmartinez.pooclasesabstractas.form.elementos;

public class InputForm extends  ElementoForm{

    private String tipo="text";

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        this(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String dibujarHmtl() {
        return "<input type=\""+ this.tipo
                +"\" name=\""+ this.nombre
                +"\" value=\""+ this.valor +"\" >";
    }
}
