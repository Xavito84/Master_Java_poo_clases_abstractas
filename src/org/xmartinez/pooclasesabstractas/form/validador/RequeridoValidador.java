package org.xmartinez.pooclasesabstractas.form.validador;

public class RequeridoValidador extends Validador{


    protected String mensaje="El campo %s es requerido";

    @Override
    public void setmensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getmensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor!=null && valor.length()>0);
    }
}
