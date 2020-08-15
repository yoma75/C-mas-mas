// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se 
// introduzca un número negativo.  //

package suma_de._numeros_.impares;

import java.util.Scanner;

public class Suma_de_numeros_Impares {

    public static void main(String[] args) {
        
        int num, cuadrado;

// num guardará el número que leamos
// y cuadrado guardará el cuadrado de num
 
Scanner sn=new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        num=sn.nextInt(); 

    while(num>=0){ 
    // repetimos el proceso mientras el número leído NO sea negativo
        
    cuadrado=num*num;


    System.out.println(num+ "² es igual a "+ cuadrado);
    System.out.println("");

    System.out.print("Introduzca otro número: ");
       num=sn.nextInt(); // volvemos a leer num
        
        
    }
    }
}
