 // Digite cuatro numero y diga cual de estos es el mayor//

package mayor_de_los_cuatro;
 
import java.util.Scanner;

public class Mayor_de_los_cuatro {

    public static void main(String args[]) {
       
         Scanner teclado=new Scanner(System.in);
    
    int num1, num2, num3, num4, suma=0;
    
    System.out.print("Digite el primer numero : ");
    num1=teclado.nextInt();
    
    System.out.print("Digite el sedundo numero : ");
    num2=teclado.nextInt();
    
    System.out.print("Digite el tercer numero : ");
    num3=teclado.nextInt();
    
    System.out.print("Digite el cuarto numero : ");
    num4=teclado.nextInt();
    
        
    if(num1>num2) {
      System.out.println("El numero mayor es : " +num1);
           
    }else
      System.out.println("El numero mayor es : " +num2);
    
    if(num2>num3) {
        System.out.println("El numero mayor es : " +num2);
        
        } else 
          System.out.println("El numero mayor es : " +num3);
    
    if(num3>num4){
        System.out.println("El numero mayor es : " +num3);  
    
    }else 
        System.out.println("El numero mayor es : " +num4);
}
}
