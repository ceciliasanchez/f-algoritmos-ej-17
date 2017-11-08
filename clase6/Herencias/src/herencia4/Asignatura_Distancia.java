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
public class Asignatura_Distancia extends Asignatura {

    private int numero_horas;

    public Asignatura_Distancia(String n, String t,  int c ,int h) {
        super(n,t,c);
        setNumero_H(h);

    }

    public void setNumero_H(int h) {
        numero_horas = h;
    }

    public int getNumero_H() {
        return numero_horas;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "Numero de horas: %s",super.toString(),getNumero_H());
    }
}
