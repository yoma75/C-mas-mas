
//Dados tres  numeros determinar si la suma de una pareja de ellos es igual al
// tercer numero, si se cumple esta condicion escribir iguales o de lo contrario
// distintas //

package pagina_19_ejemplo_1.pkg6;

import java.util.Scanner;

public class Pagina_19_ejemplo_16 {

    public static void main(String[] args) {
    
     Scanner teclado=new Scanner(System.in);   
        
        int a, b, c;
       
    System.out.print("Digite el primer numero : ");
    a=teclado.nextInt();
    
    System.out.print("Digite el segundo numero : ");
    b=teclado.nextInt();
    
    System.out.print("Digite el tercer numero : ");
    c=teclado.nextInt();
              
    if(a+b == c) 
        System.out.println("Suma del primer y segundo numero :  "+c);
      
   else 
                
    if(a+c == b) 
        System.out.println("Suma del primer y tercer numero : "+b);
        
    else 
            
    if(b+c == a) 
        System.out.println("Suma del segundo y tercer numero :  " +a);
        
    else 
        System.out.println("Numeros distintos");
    }

        
    }
      
      
      
        
        
    
    

