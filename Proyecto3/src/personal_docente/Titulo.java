/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_docente;



/**
 *
 * @author Salas
 */
public class Titulo {
 private String nombre;
 private String nombre_universidad;
    
  public void establecer_nombre(String nom_ti){
         nombre = nom_ti;
     }
     
     public String obtener_nombre(){
         return nombre;
     }
     
     public void establecer_nombre_universidad(String nomb_uni){
         nombre_universidad = nomb_uni;
     }
     
     public String obtener_nombre_universidad(){
         return nombre_universidad;
     }
    
 @Override
      public String toString() {
        String cadena = String.format("%s - %s",obtener_nombre(),obtener_nombre_universidad());
        return cadena;
    }
}
