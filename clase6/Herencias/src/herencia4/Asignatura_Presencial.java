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
public class Asignatura_Presencial extends Asignatura {
     private int numero_creditos;
    
    public Asignatura_Presencial(String n, String t,  int c , int nu) {
        super(n, t, c);
        setNumero_C(nu);

    }
    
   
    
    public void setNumero_C(int nu){
        numero_creditos = nu;
    }
    public int getNumero_C(){
        return numero_creditos;
    }
    
    @Override
    public String toString(){
        return String.format("%s"
                + "Numero de Créditos: %s\n",super.toString(),getNumero_C()
                ); 
    }
}
