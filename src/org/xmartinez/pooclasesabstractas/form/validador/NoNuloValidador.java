package org.xmartinez.pooclasesabstractas.form.validador;

public class NoNuloValidador extends Validador{


    protected String mensaje="El campo %s no puede ser nulo";


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
        return (valor != null);
    }
}
