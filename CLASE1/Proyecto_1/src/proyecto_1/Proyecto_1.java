
package proyecto_1;
import java.util.Scanner;


public class Proyecto_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        int num;
        int m=0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero:");
        num = leer.nextInt();
        System.out.println("**********************************");
        while (i <= 12){
            m=num*i;
            System.out.println("" +num+  " *   " + i +"  =   " +m);
            i++;
        }
        
       
    }
    
}
