// Halla la raiz cuadra de un numero que entra por teclado 

package raiz_cuadrada_numero;

import java.util.Scanner;

public class Raiz_cuadrada_numero {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        double num;
        
        System.out.print("Digite un numero para hallar su raiz cuadrada : ");
        num=sc.nextDouble();
        
        System.out.println( "El resultado es: " + Math.sqrt(num));
        
        // La libreria Math hace referencia a matematicas y sqrt se utiliza para
        // hallar la raiz cuadrada 
        
        // tambien podemos crear una variable tipo double por ejemplo:
        // raiz = Math.sqrt(num);
        // System.out.println("La raiz cuadra de "+num+ " es : "+raiz);
    } 
    
}
