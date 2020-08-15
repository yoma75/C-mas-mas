/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Dados tres  numeros determinar si la suma de una pareja de ellos es igual al
// tercer numero, si se cumple esta condicion escribir iguales o de lo contrario
// distintas //

package ejemplo_1.pkg6_pagina_19;

import java.util.Scanner;


public class Ejemplo_16_pagina_19 {

    
    public static void main(String[] args) {
        
     Scanner sn=new Scanner(System.in); 
              // sn es el nombre de la variable //
        
      System.out.print("Introduzca el primer numero: ");
      int num1=sn.nextInt(); 
      
      System.out.print("Introduzca el segundo numero: ");
      int num2=sn.nextInt(); 
      
      System.out.print("Introduzca el tercer numero: ");
      int num3=sn.nextInt(); 
      
      int c=num1+num2;
      int b=num1+num3;
      int a=num2+num3;  
      
    if(a+b==c) {
        System.out.println("iguales"+c);
        
    }else{ 
        System.out.println("distintas");
    }
    
    if(a+c==b) {
        System.out.println("iguales"+b);
        
    }else{ 
        System.out.println("distintas");
    }

    if(b+c==a) {
        System.out.println("iguales"+c);
        
    }else{ 
        System.out.println("distintas");
    }

        
    }
      
      
      
        
    }
    
