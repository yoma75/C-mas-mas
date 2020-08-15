// Suma de un numero introducido por teclado //

package suma_de_numero_de_1_en_1;

import java.util.Scanner;

public class Suma_de_numero_de_1_en_1 {

       public static void main(String[] args) {
        
        int num, fin=0;
        
        Scanner sn=new Scanner(System.in);
        
        System.out.print("Digite un numero mayor a cero : ");
        num=sn.nextInt();
        
        if(num > 0){
            for(int i=1; i<=num; i++){
                // la variable i es un contador //
                 fin = fin + i;
                 
            }
            System.out.println("El valor total es : " + fin);
            }else{
                 System.out.println("El valor introducido no es mayor a cero");
                 
                
        }
        
    }
    
}
