// Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora 
// en el segundo siguiente.

package hora_en_el_segundo_siguiente;

import java.util.Scanner;

public class Hora_en_el_segundo_siguiente {

   
    public static void main(String[] args) {
        
      int hora, minutos, segundos;  
        
      Scanner sc=new Scanner(System.in);
      
        System.out.print("Digite la hora: ");
        hora=sc.nextInt();
        
        System.out.print("Digite los minutos: ");
        minutos=sc.nextInt();
        
        System.out.print("Digite los segundos: ");
        segundos=sc.nextInt();
        
        // incrementamos los segundos
           segundos ++;

 // si los segundos superan 59, los reiniciamos a 0 e incrementamos los minutos
        if (segundos >= 60)
        {
           segundos = 0;
           minutos ++;

 // si los minutos superan 59, los reiniciamos a 0 e incrementamos la hora
        if (minutos >= 60)
        {
           minutos = 0;
           hora ++;

 // si la hora supera 23, la reiniciamos a 0
        if (hora >= 24)
        hora = 0;
   }
 }
    System.out.println ("La hora es: "+ hora + ":"+ minutos + ":" + segundos);
        
      
    }
    
}
