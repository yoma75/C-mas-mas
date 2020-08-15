//Pedir un número e indicar si es positivo o negativo//

package numero_positivo_o_negativo;

import java.util.Scanner;

public class Numero_positivo_o_negativo {

    public static void main(String[] args) {
        
        Scanner sn=new Scanner(System.in); 
              // sn es el nombre de la variable //
        
                                   
      System.out.print("Digite el numero :  ");
      int num=sn.nextInt();
      
       if(num < 0){ //suponomenos que el 0 es positivo//
           System.out.println("Es negativo ");
           
       }else{
           System.out.println("Es positivo ");
           
       }
        
        
    }
    
}
