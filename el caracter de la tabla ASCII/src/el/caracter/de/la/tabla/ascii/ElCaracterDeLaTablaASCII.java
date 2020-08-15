// Entrar un numero por teclado y decir que caracter corresponde a la 
// tabla ASCCI

package el.caracter.de.la.tabla.ascii;

import java.util.Scanner;

public class ElCaracterDeLaTablaASCII {

    public static void main(String[] args) {
        
      Scanner sn=new Scanner(System.in); 
              // sn es el nombre de la variable //
        
      System.out.print("Introduzca un numero: ");
      int num=sn.nextInt(); 
      
      char caracter=(char)num;
      
      System.out.println("El numero "+" corresponde al caracter  '"+caracter+"'"); 
    }
    
}
