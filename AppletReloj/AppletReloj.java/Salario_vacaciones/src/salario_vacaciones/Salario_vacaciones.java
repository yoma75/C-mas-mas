// vacaciones de un trabajador segun el tiempo anual trabajado 

package salario_vacaciones;

import java.util.Scanner;

public class Salario_vacaciones {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);

  String nombre = "";
  int clave = 0, antiguedad = 0;

  System.out.println("      ***********************************************************");
  System.out.println("      ** Bienvenido al sistema vacacional de Coca-Cola Company **");
  System.out.println("      ***********************************************************");
  System.out.println("");
  System.out.println("");

  System.out.print("Cual es tu nombre ? : ");
  nombre = entrada.nextLine();
  System.out.println("");

  System.out.print("Cuantos años a trabajado en la empresa : ");
  antiguedad = entrada.nextInt();
  System.out.println("");
 
  System.out.print("Cual es la clase del trabajador ? : ");
  clave = entrada.nextInt();
  System.out.println("");

  if(clave == 1) {
    
    if(antiguedad == 1){
      System.out.println("El trabajador " +nombre+ " tiene derecho a 6 dias de vacaciones");
    } else if(antiguedad >=2 && antiguedad <=6){
      System.out.println("El trabajador " +nombre+ " tiene derecho a 14 dias de vacaciones");  
    } else if(antiguedad >=7){
      System.out.println("El trabajador " +nombre+ " tiene derecho a 20 dias de vacaciones");
    }

  } else if(clave == 2){

    if(antiguedad == 1){
      System.out.println("El trabajador " +nombre+ " tiene derecho a 7 dias de vacaciones");
    } else if(antiguedad >=2 && antiguedad <=6){
      System.out.println("El trabajador " +nombre+ " tiene derecho a 15 dias de vacaciones");  
    } else if(antiguedad >=7){
      System.out.println("El trabajador " +nombre+ " tiene derecho a 22 dias de vacaciones");
    }
 
  } else if(clave == 3){

    if(antiguedad == 1){
      System.out.println("El trabajador " +nombre+ " tiene derecho a 10 dias de vacaciones");
    } else if(antiguedad >=2 && antiguedad <=6){
      System.out.println("El trabajador " +nombre+ " tiene derecho a 20 dias de vacaciones");  
    } else if(antiguedad >=7){
      System.out.println("El trabajador " +nombre+ " tiene derecho a 30 dias de vacaciones");
    }

  } else {
    System.out.println("Error, la clave del departamento es incorrecta"); 
  }
  
           
        
    }
    
}
