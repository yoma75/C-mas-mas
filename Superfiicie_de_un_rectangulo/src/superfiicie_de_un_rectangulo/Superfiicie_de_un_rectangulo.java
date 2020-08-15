// Hallar la superficie de un rectangulo 

package superfiicie_de_un_rectangulo;

import java.util.Scanner;

public class Superfiicie_de_un_rectangulo {

    public static void main(String[] args) {
     
       Scanner sn=new Scanner(System.in); 
              // sn es el nombre de la variable //
        
      System.out.print("Introduzca la base del rectangulo   : ");
      int num1=sn.nextInt(); 
      
      System.out.print("Introduzca la altura del rectangulo : ");
      int num2=sn.nextInt(); 
      
      int s=num1*num2;
      
      System.out.println("La superfie del rectangulo es       : "+s);
      
              
        
    }
    
}
