// Pedir 7 numeros y escribir la suma total de ellos //

package suma_de_5_numeros_entran_por_teclado;

import java.util.Scanner;

public class Suma_de_5_numeros_entran_por_teclado {

    public static void main(String[] args) {
      
        Scanner sn=new Scanner(System.in);
        
        
      int num, suma_total=0;
        
      for (int i=1; i<=5; i++){
          
        System.out.print("Didite los 5 numeros : ");
        num=sn.nextInt();
        
        suma_total = suma_total+num;
          }
        System.out.println("La suma total es de: "+suma_total);
         
        
    }
    
}
