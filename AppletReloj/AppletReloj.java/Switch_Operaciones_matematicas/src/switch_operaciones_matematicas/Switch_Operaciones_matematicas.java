// Operaciones matematicas usando el switch 

package switch_operaciones_matematicas;

import java.util.Scanner;


public class Switch_Operaciones_matematicas {

    public static void main(String[] args) {
       
        Scanner teclado=new Scanner(System.in);
        
        
        int num1, num2, resultado = 0;
        int opcion;
        
        System.out.print("Digite el primer numero  : ");
        num1=teclado.nextInt();
        
        System.out.print("Digite el segundo numero : ");
        num2=teclado.nextInt();
        System.out.println("");
        
        System.out.print("Digite una opcion del 1 al 4 : ");
        opcion=teclado.nextInt();
        System.out.println("");
        

  switch(opcion){
  
   case 1: resultado = num1 + num2;
           System.out.println("El resultado de la suma es  : " +resultado);
           break;  

   case 2: resultado = num1 - num2;
           System.out.println("El resultado de la resta es : " +resultado);
           break;

   case 3: resultado = num1 * num2;
           System.out.println("El resultado de la multiplicacion es : " +resultado);
           break;  

   case 4: resultado = num1 / num2;
           System.out.println("El resultado de la division es : " +resultado);
           break;  

   default: System.out.println("Error esta opcion no existe");
            break;
  }
                       
    }
    
}
