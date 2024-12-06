package org.xmartinez.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador{

    protected String mensaje="El campo %s tiene un formato de correo es inválido";

    private final static String EMAIL_REGEX = "^(.+)@(.+)$"; //ves al mapa de caracteres para copiar el gorro. este caracter va a valiadar este String desde el comienzo de la linea y el signo $ va a l final.




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
        return valor.matches(EMAIL_REGEX);
    }
}
