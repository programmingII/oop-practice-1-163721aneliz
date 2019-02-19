/**
  * Nombre: Lizbeth Santillan 163721
  * Fecha: 18/02/2019
  * Hora: 9:25 p.m.
*/

import java.util.Scanner;

class Ejercicio11 {

public static void main(String[] args) {
  
  double area, radius, perimeter;

 Scanner in = new Scanner(System.in);
 System.out.println("Ingresar el radio de el circulo:" );
  radius = in.nextDouble();
  area = Math.PI*(radius*radius);
  perimeter = 2*(radius*Math.PI);
 System.out.println("El perimetro del círculo es:" + perimeter);
 System.out.println("El área del círculo es:" + area);

}
}
