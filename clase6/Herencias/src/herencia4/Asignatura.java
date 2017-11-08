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
public class Asignatura {

    private String nombre;
    private String tipo;//(troncal, comun)
    private int costo;

    public Asignatura(String n, String t, int c) {
        setNombre(n);
        setTipo(t);
        setCosto(c);
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCosto(int c) {
        costo = c;
    }

    public int getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return String.format("\nAsignatura: %s \n"
                + " %s \n"
                + " %s \n",
                getNombre(), getTipo(), getCosto());
    }

}
