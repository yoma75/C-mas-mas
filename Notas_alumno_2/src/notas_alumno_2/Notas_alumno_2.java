// Calificacion de las notas de un alumno 

package notas_alumno_2;



import java.util.Scanner;

public class Notas_alumno_2 {

    public static void main(String[] args) {
                
        Scanner sn=new Scanner(System.in);
                  
        
        System.out.print("Introduzca una nota de 0 a 10 : ");
        int nota=sn.nextInt(); 
        

switch(nota){
case 0:
case 1:
case 2:
case 3:
case 4:
      System.out.println("INSUFICIENTE");
      break;
case 5:
      System.out.println("SUFICIENTE");
      break;
case 6:
      System.out.println("BIEN");
      break;
case 7:
case 8:
      System.out.println("NOTABLE");
      break;
case 9:
case 10:
      System.out.println("SOBRESALIENTE");
      break;
      
default:
System.out.println("FUERA DEL RANGO ....ERROR");
break;
    }
    }
}
