// Es mayor que el otro o son iguales 

package es_mayor_que_el_otro_o_son_iguales;

import java.util.Scanner;

public class Es_mayor_que_el_otro_o_son_iguales {

    public static void main(String[] args) {
        
        Scanner sn=new Scanner(System.in); 
              // sn es el nombre de la variable //
        
      System.out.print("Introduzca el primer numero: ");
      int num1=sn.nextInt(); 
      
      System.out.print("Introduzca el segundo numero: ");
      int num2=sn.nextInt(); 
      
      if(num1<=num2){
          
        if(num1==num2){ 
           System.out.println("Son iguales"); 
        }else{  
            System.out.println("El segundo numero: "+num2+" es el mayor");
        }
        
                  
           }else{ 
            System.out.println("El primer numero: "+num1+" es el mayor");    
          }
        }

        
}
                
         
          
               
    
    

