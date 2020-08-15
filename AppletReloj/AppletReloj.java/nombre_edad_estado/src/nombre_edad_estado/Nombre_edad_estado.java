// Pide nombre, edad, y en estado civil arroja un mensaje

package nombre_edad_estado;

import java.util.Scanner;

public class Nombre_edad_estado {

    public static void main(String[] args) {
       
      Scanner sc=new Scanner(System.in);  
      
      String nombre = "";
      int edad, estado, soltero = 2;
      
                    
        System.out.print("Escriba su primer nombre : ");
        nombre=sc.nextLine();
        
        System.out.print("Digite su edad : ");
        edad=sc.nextInt();
        
        System.out.print("Su estado civil es :  1 = Casado o 2 = Soltero : ");
        estado=sc.nextInt();
        
        if(estado == 2)
            System.out.println("Felicitaciones");
        else
            System.out.println("Lo sentimos");        
                    
        
    }
    
}
