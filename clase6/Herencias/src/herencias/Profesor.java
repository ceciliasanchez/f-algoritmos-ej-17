/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author Salas
 */
public class Profesor extends Persona {
//heredo la superclase persona

    private double sueldo;

    public Profesor() {
        super("Rene", "Elizalde", 34);

    }

    public Profesor(double s) {
        super("Rene", "Elizalde", 34);
        setSueldo(s);

    }
    
    public void setEdad(int e){
        if (e<30) {
            edad = 30;
        } else {
            edad = e;
        }
    }

    public Profesor(String n, String ap, int ed, double s) {
        super(n, ap, ed);
        setSueldo(s);

    }

    public void setSueldo(double s) {
        sueldo = s;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    @Override
    public String toString() {
        return String.format("%s - %f", super.toString(), getSueldo());
    }
}
