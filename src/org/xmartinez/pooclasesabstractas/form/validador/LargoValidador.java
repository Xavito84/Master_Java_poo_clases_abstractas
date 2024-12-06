package org.xmartinez.pooclasesabstractas.form.validador;

import org.xmartinez.pooclasesabstractas.form.validador.mensaje.IMensajeFormateable;

public class LargoValidador extends Validador implements IMensajeFormateable {


    protected String mensaje="el campo %s debe tener mínimo %d caracteres y un máximo %d caracteres";  // cuando colocas %d luego lo reemplazas al valor que quieras
    private int min;
    private int max= Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void setmensaje(String mensaje) {
        this.mensaje= mensaje;
    }

    @Override
    public String getmensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        //this.mensaje= String.format(mensaje, this.min, this.max);

        if (valor == null) {
            return true;
        }
        int largo= valor.length();

        return (largo >= min && largo <= max) ;
    }

    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje,campo, this.min,this.max);
    }


}
