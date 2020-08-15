// Pedir dos fechas y mostrar el número de días que hay de diferencia.
// Suponiendo todos los meses de 30 días.

package fechas_diferencia;

import java.util.Scanner;

public class Fechas_diferencia {

   
    public static void main(String[] args) {
       
     Scanner sc=new Scanner(System.in);
     
     int dia1, mes1, año1;
     int dia2, mes2, año2;
     int total_dias;
     
        System.out.println(" *** PRIMERA FECHA *** ");
        System.out.print("Digite el dia en numeros : ");
        dia1=sc.nextInt();
        
        System.out.print("Digite el mes es numeros : ");
        mes1=sc.nextInt();
        
        System.out.print("Digite el año : ");
        año1=sc.nextInt();
        System.out.println("");
        
        System.out.println(" *** SEGUNDA FECHA *** ");
        System.out.print("Digite el dia en numeros : ");
        dia2=sc.nextInt();
        
        System.out.print("Digite el mes es numeros : ");
        mes2=sc.nextInt();
        
        System.out.print("Digite el año : ");
        año2=sc.nextInt();
        System.out.println("");
        
        
        // convertimos las dos fechas a días y calculamos la diferencia

        total_dias = dia2-dia1 + 30*(mes2-mes1) + 365*(año2-año1);

        System.out.println("La diferencia es de " + total_dias + " dias");
     
        
    }
   
}
