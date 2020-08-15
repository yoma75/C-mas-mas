// Leer cuatro numeros y decir cual es el numero mayor //

package elmayor_delos_cuatro;

import java.util.Scanner; 

public class Elmayor_delos_cuatro {

    public static void main(String[] args) {
       
        Scanner tecla=new Scanner(System.in);
        
        int a, b, c, d, suma = 0;
        
        System.out.print("Digite el primer numero  : ");
        a=tecla.nextInt();
        
        System.out.print("Digite el segundo numero : ");
        b=tecla.nextInt();
        
        System.out.print("Digite el tercer numero  : ");
        c=tecla.nextInt();
        
        System.out.print("Digite el cuarto numero  : ");
        d=tecla.nextInt();
        System.out.println("");
                
        if(a>b && a>c && a>d){        
          System.out.println("El numero mayor es el : "+a);           
        
    }else
        if(b>a && b>c && b>d){        
          System.out.println("El numero mayor es el : "+b);
          
    }else    
          if(c>a && c>b && c>d){        
          System.out.println("El numero mayor es el : "+c);
          
    }else
       if(d>a && d>b && d>c){        
          System.out.println("El numero mayor es el : "+d);           
            
    }
        suma=a+b+c+d;
        System.out.println("La suma de los cuatro numeros es : "+suma);
}
    }