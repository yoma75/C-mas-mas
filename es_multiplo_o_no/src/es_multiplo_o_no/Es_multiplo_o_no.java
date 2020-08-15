// Pedir dos números y decir si uno es múltiplo del otro //

package es_multiplo_o_no;

import java.util.Scanner;

public class Es_multiplo_o_no {

    public static void main(String[] args) {
        
         Scanner sn=new Scanner(System.in); 
              // sn es el nombre de la variable //
        
                                   
      System.out.print("Digite el primer numero  :  ");
      int num1=sn.nextInt();
      
      System.out.print("Digite el segundo numero :  ");
      int num2=sn.nextInt();
            
      if(num1%num2==0){
          System.out.println("Son multiplos");
          
      }else{
          System.out.println("No son multiplos"); 
      }
        
        
    }
    
}
