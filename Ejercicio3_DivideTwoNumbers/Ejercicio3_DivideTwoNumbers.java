/**
  * Nombre: Lizbeth Santillan 163721
  * Fecha: 12/02/2019
  * Hora: 12:08 p.m.
*/ 

import java.util.Scanner;
/**
  * Los "packages": sirven para agrupar clases (lo cual evita que puedan existir clases con nombres   * duplicados) 
  * (los nombres de las clases dentro de un paquete deben ser únicos)
  * La palabra reservada "import": para importar clases de un paquete se usa el comando "import".
  * (esta palabra se utiliza para invocar un "package") 
  * Dentro del paquete "Java" existe un subpaquete "util" significa que podemos utilizar cualquier clase
  * dentro de ese paquete.
  * Clase "Scanner": provee métodos para leer valores de entrada de varios tipos (valores de entrada del
  * teclado o datos almacenados en un archivo) y está localizada en el paquete java.util
*/

class Ejercicio3 {

public static void main(String[] args) {

 Scanner in = new Scanner (System.in); 
 System.out.println("ingresar primer número:"); 
 int num1 = in.nextInt(); 
 System.out.println("ingresar segundo número:");
 int num2 = in.nextInt(); 
 System.out.println("el resultado es:" + (num1 / num2));
}
}
