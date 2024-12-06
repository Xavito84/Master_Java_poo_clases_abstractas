package org.xmartinez.pooclasesabstractas.form.elementos;

import org.xmartinez.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends  ElementoForm{

    private List <Opcion> opciones;

    //Constructor
    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        this(nombre);
        this.opciones = opciones;
    }

    //getter and setter


    //metodo
    public SelectForm addOpciones(Opcion opcion) {
        this.opciones.add(opcion);
        return this;
    }


    @Override
    public String dibujarHmtl() {
        StringBuilder sb= new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for (Opcion opcion: this.opciones){
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()) {
                sb.append(" selected");
                this.valor= opcion.getValor();
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
