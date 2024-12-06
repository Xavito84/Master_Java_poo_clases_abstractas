package org.xmartinez.pooclasesabstractas.form;

import org.xmartinez.pooclasesabstractas.form.elementos.*;
import org.xmartinez.pooclasesabstractas.form.elementos.select.Opcion;
import org.xmartinez.pooclasesabstractas.form.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        //hacer un elemeto anonimo pero no se puebe reutilizar
       /*ElementoForm elemento= new ElementoForm(){

            @Override
            public String dibujarHmtl() {
                return "";
            }
        };*/

        InputForm username= new InputForm("username");
        username.addValidador(new RequeridoValidador());
        InputForm password= new InputForm("password","password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6,12));
        InputForm email= new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());
        InputForm edad= new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia= new TextareaForm("exp", 5 , 9);

        SelectForm lenguaje= new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java= new Opcion("1", "Java");
        lenguaje.addOpciones(java)
        .addOpciones(new Opcion("2", "Python").setSelected(true))
        .addOpciones(new Opcion("3", "JavaScript"))
        .addOpciones(new Opcion("4", "TypeScript"))
        .addOpciones(new Opcion("5", "PHP"));

        //clase anonima
        ElementoForm saludar = new ElementoForm("saludo"){
            @Override
            public String dibujarHmtl() {
                return "<input disabled name='"+this.nombre+"' value=\""+this.valor+"\">";
            }
        };

        saludar.setValor("Hola que tl este campo esta deshabilitado!");
        username.setValor("lucas.mar");
        password.setValor("123456");
        email.setValor("lucas.mar@gmail.com");
        edad.setValor("18");
        experiencia.setValor("... más de 2 años de experiencia en este campo");
        //java.setSelected(true);


        /*List<ElementoForm> elementos= new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);*/

        List<ElementoForm> elementos= Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);


//        for (ElementoForm e:  elementos){
//            System.out.println(e.dibujarHmtl());
//            System.out.println("<br>");
//        }


        elementos.forEach(e->{
            System.out.println(e.dibujarHmtl());
            System.out.println("<br>");
        });

        elementos.forEach(e-> {
            if (!e.esValido()){
                e.getErrores().forEach(System.err::println); // es lo mismo:  err-> System.err.println(err) es un atajo metodo de referencia xq se asume por defecto
                }
        });



    }
}
