/**
  * Nombre: Lizbeth Santillan 163721
  * Fecha: 18/02/2019
  * Hora: 11:17 p.m.
*/

import java.util.Scanner;
class Ejercicio15 {

public static void main(String[] args) {
Scanner in = new Scanner (System.in);

System.out.println("ingresar primer numero:");
 int a = in.nextInt();
System.out.println("ingresar segundo numero:");
 int b = in.nextInt();

System.out.println("Antes: a, b = "+a+", "+ + b);

 a = a + b;
 b = a - b;
 a = a - b;

System.out.println("Despues: a, b = "+a+", "+ + b);

}
}