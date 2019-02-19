/**
  * Nombre: Lizbeth Santillan 163721
  * Fecha: 18/02/2019
  * Hora: 10:00 p.m.
*/

import java.util.Scanner;

class Ejercicio12 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

 System.out.println("Ingrese primer número:");
  int num1 = in.nextInt();
 System.out.println("Ingrese segundo número:");
  int num2 = in.nextInt();
 System.out.println("Ingrese tercero número:");
  int num3 = in.nextInt();
 System.out.println("Ingrese cuarto número:");
  int num4 = in.nextInt();
 System.out.println("Ingrese quinto número:");
  int num5 = in.nextInt();

 System.out.println("El promedio es:" + (num1 + num2 + num3 + num4 + num5 / 5));
}
}
