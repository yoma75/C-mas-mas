
// Conversion de grados Celsius a grados Fahrenheit //
package de_grados_celsius_a_grados_fahrenheit;

import java.util.Scanner;

public class De_grados_Celsius_a_grados_Fahrenheit {
 
    public static void main(String[] args) {
    
        Scanner sn=new Scanner(System.in);
        
        System.out.print("Digite la temperatura en Grados Celsius :  ");
        int gr=sn.nextInt(); 
        
        double f=9/5.0*gr+32.0;
        
                
        System.out.println("Equivalen a : " +f+ " " + " Grados Fahrenheit ");
        
                
    }
    
}
