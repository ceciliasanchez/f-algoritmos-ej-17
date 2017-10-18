package personal_docente;
import institucion_.Asignatura;
import personal_docente.Titulo;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salas
 */
public class Docente {

    private String apellidos;
    private String nombres;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;
    private Titulo tercer_nivel;
    private Titulo cuarto_nivel;
    
    
    public void establecer_nombres(String nom) {
        nombres = nom;

    }

    public String obtener_nombres() {
        return nombres;
    }

    public void establecer_apellidos(String ape) {
        apellidos = ape;

    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void establecer_asignatura_1(Asignatura asig) {
        asignatura_1 = asig;

    }

    public Asignatura obtener_asignatura_1() {
        return asignatura_1;
    }
    
    public void establecer_asignatura_2(Asignatura asig2) {
        asignatura_2 = asig2;

    }

    public Asignatura obtener_asignatura_2() {
        return asignatura_2;
    }
    
    public void establecer_tercer_nivel(Titulo nom_ti) {
        tercer_nivel= nom_ti;

    }

    public Titulo obtener_tercer_nivel() {
        return tercer_nivel;
    }
     public void establecer_cuarto_nivel(Titulo nom_uni) {
        cuarto_nivel = nom_uni;

    }   
        public Titulo obtener_cuarto_nivel() {
        return cuarto_nivel;
    }
    
    @Override
    public String toString() {
        String cadena = String.format(
                "Datos Docente\n"
                + "Nombres %s\n"
                + "Apellidos %s\n"
                + "Tiene las siguientes asignaturas\n"
                + "Asignatura 1 %s\n"
                + "Asignatura 2%s\n"
                + "El docente tiene los siguientes titulos academicos \n"
                + "Titulo Tercer Nivel %s\n"
                + "Titulo Cuarto Nivel %s" ,obtener_nombres(),obtener_apellidos() ,obtener_asignatura_1(),obtener_asignatura_2(),obtener_tercer_nivel(),obtener_cuarto_nivel());
        return cadena;
    }
}
