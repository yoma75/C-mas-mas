// Tabla de multiplicar de cualquier numero hasta 10

package tabla_multiplicar;

import java.util.Scanner;

public class Tabla_multiplicar {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int resultado=0;
        
        System.out.print("Digite el numero de la tabla a multiplicar : ");
        int num=sc.nextInt();
        
        for(int i=1; i<11; i++){
           
        resultado = num * i;    
        
            System.out.println(num+ " x " +i+ " = " +resultado);
                 
    }
    
    }
}
  