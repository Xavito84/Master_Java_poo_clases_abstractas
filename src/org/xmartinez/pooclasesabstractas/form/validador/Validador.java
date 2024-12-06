package org.xmartinez.pooclasesabstractas.form.validador;

abstract public  class Validador {

    protected String mensaje;

    abstract public void setmensaje(String mensaje);
    abstract public String getmensaje();
    abstract public boolean esValido(String valor);

}
