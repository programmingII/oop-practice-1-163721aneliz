/** 
  * Nombre: Lizbeth Santillán 163721
  * Fecha: 04/03/2019
  * Hora: 11:56 p.m.
*/
import java.util.Scanner;
    
public class Ejercicio18 {
    
   public static void main(String[] args) {
       
       Scanner leer=new Scanner(System.in);
        String n1=""; 
        String n2=""; 
       
       System.out.println("Ingrese su numero en binario");
        n1=leer.next();
        System.out.println("Ingrese su numero binario numero 2");
        n2=leer.next();

                
                System.out.println("Su resultado es: "+Multiplicación(n1,n2));
    }
    public static String Multiplicación(String n1, String n2){
        int a1=Integer.parseInt(n1,2);
        int a2=Integer.parseInt(n2,2);
                int c=a1*a2;
                String resultado=Integer.toString(c ,2);
    
        
        return resultado;
    }
}