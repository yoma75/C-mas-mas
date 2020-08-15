// este es otro ejemplo del salario de un trabajador 

package salario_dos;

import java.util.Scanner;

public class Salario_dos {

    public static void main(String[] args) {
        
        int horast, salario, basico; 
        float valorimpuest=(float) 0.10, totalimp, neto;        
        
        Scanner sc=new Scanner(System.in);
           
        
       System.out.print("Digite el numero de horas trabajadas del mes : ");
        horast=sc.nextInt();
        
        System.out.print("Digite el valor de la hora : ");
        basico=sc.nextInt();
        
        salario = horast * basico;
        totalimp = (float) (0.10 * salario);        
        neto = salario - totalimp; 
      
      System.out.println("Valor horas trabajadas : " +salario);
      System.out.println("");
      
      System.out.println("Impuestos deducidos de su sueldo es de : " +totalimp);
      System.out.println("El valor neto a pagar es : " +neto);
        
        
        
    }
    
}
