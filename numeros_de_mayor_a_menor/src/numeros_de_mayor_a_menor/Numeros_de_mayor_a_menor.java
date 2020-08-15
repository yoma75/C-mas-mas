//  Pedir dos números y mostrarlos ordenados de mayor a menor  //

package numeros_de_mayor_a_menor;

import java.util.Scanner;

public class Numeros_de_mayor_a_menor {

    public static void main(String[] args) {
       
        Scanner sn=new Scanner(System.in);
               // sn es el nombre de la variable //
        
        System.out.print("Digite el primer numero  :  ");
        int num1=sn.nextInt();
        
        System.out.print("Digite el segundo numero :  ");
        int num2=sn.nextInt();
        
        if(num1 > num2){
            System.out.println(num1 + " y " + num2);
            
        }else{
            System.out.println(num2 + " y " + num1);
        }
        
        
        
        
                
        
    }
    
}
