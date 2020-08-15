/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_mayor_que_el_otro_o_son_iguales;

 import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class numero_mayor {
    
    public static void main(String args[]){
    
    Scanner teclado=new Scanner(System.in);
    
    int num1, num2, num3, num4, suma=0;
    
    System.out.print("Digite el primer numero : ");
    num1=teclado.nextInt();
    
    System.out.print("Digite el sedundo numero : ");
    num2=teclado.nextInt();
    
    System.out.print("Difite el tercer numero : ");
    num3=teclado.nextInt();
    
    System.out.print("Digite el curto numero : ");
    num4=teclado.nextInt();
    
    suma = num1+num2+num3+num4;
    System.out.print("La suma de los cuatro numeros es : "+ suma);
    
    if(num1<=num2 && num3<=num4) {
      System.out.print("El numero mayor es : " +num1);
           
    }else
      System.out.print(num4);
    
    
    
    }
    
}
