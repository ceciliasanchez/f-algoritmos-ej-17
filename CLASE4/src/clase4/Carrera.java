/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author Salas
 */
public class Carrera {
    
    private String nombre;
    private String modalidad;
    
    public Carrera(){
        modalidad = "Distancia";
    }
    public Carrera(String md){
        modalidad = md;
    }
    public Carrera (String md, String x){
        modalidad =md;
        nombre=x;
    }
     public void establecer_nombre(String nom){
         nombre = nom;
     }
     public String obtener_nombre(){
         return nombre;
     }
       public void establecer_modalidad(String mod){
         modalidad = mod;
     }
     public String obtener_modalidad(){
         return modalidad;
     }
     
    @Override
    public String toString(){
        String cadena = String.format("Nombre %s - Modalidad %s",obtener_nombre(),obtener_modalidad());
                return cadena;
    }
}
