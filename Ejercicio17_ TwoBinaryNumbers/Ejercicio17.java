/** 
  * Nombre: Lizbeth Santillán 163721
  * Fecha: 04/03/2019
  * Hora: 11:17 p.m.
*/
import java.util.Scanner;
    public class Ejercicio17 {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String n1=""; 
       String n2=""; 
       System.out.println("Ingrese su numero en binario");//se pide el numero en binario
        n1=leer.next();//se guarda nuestro numero 1
        System.out.println("Ingrese su numero binario numero 2");//aqui se pide el segundo numero
        n2=leer.next();//guardara nuestro segundo numero

                
                System.out.println("Su resultado es: "+Suma(n1,n2));
    }
    public static String Suma(String n1, String n2){
        int a1=Integer.parseInt(n1,2);//recibe nnumeros binarios
        int a2=Integer.parseInt(n2,2);//recibe el segundo numero en binario
                int c=a1+a2;//esta linea hace la operacion
                String resultado=Integer.toString(c ,2);//esta linea covierte en string y muestra los numeros binarios
    
        
        return resultado;
    }
}
    
    

    
