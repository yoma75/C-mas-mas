// Entrar un numero por teclado y decir si es par o impar, el programa se 
// detiene cuando digitan 0 (el numero cero)

package es_par_o_no;

import java.util.Scanner;

public class Es_par_o_no {

    public static void main(String[] args) {
     
        Scanner sn=new Scanner(System.in); 
              // sn es el nombre de la variable //
      
      int num;        
              
      System.out.print("Introduzca un numero: ");
      num=sn.nextInt(); 
      
      while(num != 0) // mientras que num sea diferente a cero //
      {
          if(num%2==0){
          System.out.println("El numero "+num+" es par");
          System.out.println("");
      
      }else{
          System.out.println("El numero "+num+" es impar");
          System.out.println("");
          
          }
          
       // Repetimos el proceso y volvemos a leer num 
       System.out.print("Introduzca otro numero : ");
       num=sn.nextInt();
       
      }
      }
        
             
    }
    

