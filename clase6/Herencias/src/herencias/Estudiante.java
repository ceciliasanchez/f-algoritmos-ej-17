/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import herencia4.Asignatura_Presencial;

/**
 *
 * @author reroes
 */
public class Estudiante extends Persona {

    private Asignatura_Presencial[] asignaturas;

    public void setAsignatura_Presencial(Asignatura_Presencial[] as) {
        asignaturas = as;
    }

    public Asignatura_Presencial[] getAsignatura_Presencial() {
        return asignaturas;
    }

    public Estudiante(String n, String a, int e, Asignatura_Presencial[] as) {
        super(n, a, e);
        asignaturas = as;
    }
    
     @Override
    public void setEdad(int e){
        if(e<18){
            edad = 18;
        }else{
            edad = e;
        }
    }

    public double obtener_valor_matricula() {

        int suma = 0;
        for (int i = 0; i < asignaturas.length; i++) {
            suma += asignaturas[i].getCosto();
        }
        return suma;

    }
    
    
        public String mostrar_cadena(){
        String valor = "";
        for (int i = 0; i < asignaturas.length; i++) {
            valor += asignaturas[i];  
        }
        return valor;
        
        
    }
        @Override
    public String toString(){
    
        return String.format("%s\n"
                + "Costo de Matricula: %s\n"
                + "%s\n", super.toString(),obtener_valor_matricula(), mostrar_cadena());
    }
    

       
    
}
