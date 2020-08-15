
// Pedir un numero y mostrar todos los numeros del 1 al N //

package mostrar_todos_los_mumeros_del_1_al_n;

import java.util.Scanner;

public class Mostrar_todos_los_mumeros_del_1_al_N {

    
    public static void main(String[] args) {
        
        int i=1, num;   
        
        // la varibale i es el contador que tomara los numeros de 1 hasta N //
        
        Scanner sn=new Scanner(System.in);
        
        System.out.print("Digite un numero : ");
        num=sn.nextInt();
        
        while(i <= num){
                    
            System.out.println(i);
         i++;
            
            
        }
        }
        
        
    }
    

