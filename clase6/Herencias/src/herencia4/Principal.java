/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

/**
 *
 * @author Salas
 */
public class Principal {

    public static void main(String[] args) {
        
        Asignatura_Presencial as1 = new Asignatura_Presencial("Programacion", "Común", 100, 180);
        System.out.println(as1);
        
        System.out.println("\n");
        

        Asignatura_Distancia ad = new Asignatura_Distancia("Literatura", "Troncal", 300, 6);
        System.out.println(ad);

    }

}
