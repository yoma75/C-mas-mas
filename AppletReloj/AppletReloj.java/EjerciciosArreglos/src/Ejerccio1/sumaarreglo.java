
//sumar los numeros de un arreglo//

 
package Ejerccio1;

import java.util.Scanner;

public class sumaarreglo {
    
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int tam=sc.nextInt();
                
        System.out.println("Ingrese el tamaño del arreglo : ");
        
        int arr[]=new int[tam]; // variable tam = es el tamaño del arreglo
        int suma=0; 
        
        System.out.println("Ingrese los numeros enteros : ");
        
              for(int i=0; i<arr.length; i++)
        // Length es utilizado para determinar el tamaño de un arreglo ya sea
        // vector o matriz.//
        {
            arr[i]=sc.nextInt();
            suma=suma+arr[i];
     // suma = cero + lo que hay en la posicion del arreglo de la variable i //
     
     
        }    
            
    }
    
}
