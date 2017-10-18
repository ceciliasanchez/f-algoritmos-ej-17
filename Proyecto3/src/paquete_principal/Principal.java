/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import institucion_.Asignatura;
import personal_docente.Docente;
import personal_docente.Titulo;

/**
 *
 * @author Salass
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Asignatura a1 = new Asignatura();
        Asignatura a2 = new Asignatura();
        Asignatura a3 = new Asignatura();
        Asignatura a4 = new Asignatura();

        a1.establecer_nombre("Matematicas");
        a1.establecer_creditos(8);
        a2.establecer_nombre("Fisica");
        a2.establecer_creditos(6);
        a3.establecer_nombre("Sociales");
        a3.establecer_creditos(9);
        a4.establecer_nombre("Literatura");
        a4.establecer_creditos(10);
        
        Titulo t = new Titulo();
        Titulo t1 = new Titulo();
        Titulo t2 = new Titulo();
        Titulo t3 = new Titulo();
        
        t.establecer_nombre("Licenciado en Físico Matemáticas");
        t.establecer_nombre_universidad("Universidad Politécnica");
        t1.establecer_nombre("Magister en Docencia Matemática");
        t1.establecer_nombre_universidad("Universidad Valenciana");
        t2.establecer_nombre("Licenciado en Ciencias Sociales");
        t2.establecer_nombre_universidad("Universidad Salesiana");
        t3.establecer_nombre("Magister en Docencia Social");
        t3.establecer_nombre_universidad("Universidad Cataluña");

        Docente d1 = new Docente();
        d1.establecer_nombres("Luis V");
        d1.establecer_apellidos("Perez J");
        d1.establecer_asignatura_1(a1);
        d1.establecer_asignatura_2(a2);
        d1.establecer_tercer_nivel(t);
        d1.establecer_cuarto_nivel(t1);
        
        
           Docente d2 = new Docente();
        d2.establecer_nombres("Ana M.");
        d2.establecer_apellidos("Velez P.");
        d2.establecer_asignatura_1(a2);
        d2.establecer_asignatura_2(a3);
        d2.establecer_tercer_nivel(t2);
        d2.establecer_cuarto_nivel(t3);
        
        System.out.println(d1);
        System.out.println(d2);
    }

}
