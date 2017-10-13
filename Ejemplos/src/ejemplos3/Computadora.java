/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos3;

/**
 *
 * @author Salas
 */
public class Computadora {
     private double velocidad_procesador;
     
     public  void establecer_velocidad_procesador(double velo){
         
         if (velo > 5) {
               velocidad_procesador=5.0;
     }else{
             velocidad_procesador=velo;
         }
     }
     public double  obtener_velocidad_procesador(){
         return velocidad_procesador;
     }
     
     @Override //alerta
     public String toString(){
         String cadena= String.format("Computadora con\n" + "velocidad %f",obtener_velocidad_procesador());
         
         //String cadena2= String.format("Computadora con\n" + "velocidad %f"+velocidad_procesador());
         return cadena;
     }
}
