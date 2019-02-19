/**
  * Nombre: Lizbeth Santillan 163721
  * Fecha: 18/02/2019
  * Hora: 7:05 p.m.
*/

import java.util.Scanner;

class Ejercicio6 {

public static void main (String[] args) {

 Scanner in = new Scanner (System.in);
 System.out.println("Ingresar primer número:");
 int num1 = in.nextInt();
 System.out.println("Ingresar segundo número:");
 int num2 = in.nextInt();
 System.out.println("El resultado de la suma es:" + (num1 + num2));
 System.out.println("El resultado de la resta es:" + (num1 - num2));
 System.out.println("El resultado de la multiplicación es:" + (num1 * num2));
 System.out.println("El resultado de la división es:" + (num1 / num2));
 System.out.println("El resultado de el porcentaje es:" + (num1 % num2));
}
}
  