package org.xmartinez.pooclasesabstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String mensaje="El campo %s debe ser numérico";

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
       try {
           Integer.parseInt(valor);
           return true;
       }catch (NumberFormatException e) {
           return false;
       }
    }
}
