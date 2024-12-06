package org.xmartinez.pooclasesabstractas.form.elementos;

public class TextareaForm extends ElementoForm{

    private int filas;
    private int columnas;

    //constructor
    public TextareaForm(String nombre) {
        super(nombre);
    }

    public TextareaForm(String nombre, int filas, int columnas) {
        this(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    //getter  and setter
    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Override
    public String dibujarHmtl() {
        return "<textarea name='"+this.nombre+
                "' cols='"+this.columnas+
                "' rows='"+this.filas+"'>"+this.valor+
                "</textarea>";
    }
}
