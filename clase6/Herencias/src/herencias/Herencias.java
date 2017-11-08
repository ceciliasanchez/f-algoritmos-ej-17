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
//
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Asignatura_Presencial[] as = new Asignatura_Presencial[2];
        
        as[0] = new Asignatura_Presencial("Programacion", "Comun", 100, 180);
        
        as[1] = new Asignatura_Presencial("Literatura", "Troncal", 300, 200);

        Estudiante e = new Estudiante("Luis", "Encarnacion", 20, as);

        System.out.println(e);

    }

}
