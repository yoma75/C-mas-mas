
// Sirve para convertir pulgadas a centimetros //

package de_pulgadas_a_centimetros;

import java.util.Scanner;

public class De_pulgadas_a_centimetros {

    public static void main(String[] args) {
       
        Scanner sn=new Scanner(System.in);
        
        
                 System.out.println("Conversion de pulgadas a centimetros");
        
        System.out.print("Digite el numero en pulgadas : ");
        int pul=sn.nextInt();
        
        double cent=2.54*pul;
        
        System.out.println("El resultado es : " +cent+ " " + "centimetros");
    }
    
}
