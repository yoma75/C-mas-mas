// Calcular el salario semanal del empleado de una empresa sabiendo que este
// se calcula en base a las horas semanales trabajadas y de acuerdo a un precio
// especificado por cada hora. Si se pasa de 40 horas semanales, las horas 
// extraordinarias se pagaran a razon de 1.5 veces la hora ordinaria// 

package salario_trabajador;


import java.util.Scanner;

public class Salario_trabajador {

    public static void main(String[] args) {
        
     Scanner teclado=new Scanner(System.in);
     
     int ht=0, vh=0; 
     double salario=0, horaext= 1.5;
     
     System.out.print("Digite el numero de horas trabajadas : ");
     ht=teclado.nextInt(); 
     
     System.out.print("Digite el valor de la hora : ");
     vh=teclado.nextInt();
     
     if(ht <= 40){
        salario = ht*vh;
        System.out.println("Su salario es : " + salario);
       
      } else {
         salario = 40 * vh + horaext * vh * (ht-40);
         System.out.println("Su salario con horas extras es de : " + salario);
     }
    
}
}