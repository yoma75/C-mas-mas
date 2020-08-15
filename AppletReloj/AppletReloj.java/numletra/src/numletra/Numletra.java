// Entra un numero de 0 al 99 por teclado y lo escribe en letra
// por ejemplo 56 cincuenta y seis

package numletra;

import java.util.Scanner;


public class Numletra {

    public static void main(String[] args) {
       
   Scanner teclado=new Scanner(System.in);    
   
   int num, unidades, decenas;
   
   
   System.out.print("Digite un numero de 1 a 99 : ");
   num=teclado.nextInt();

   unidades = num % 10;
   decenas = num / 10;

   switch(decenas){

    case 0:
       System.out.print("");
       break; 

   	case 1:
   	   System.out.print("Diez");
   	   break;

    case 2:
   	   System.out.print("Veinte");
   	   break; 

   	case 3:
   	   System.out.print("Treinta");
   	   break;

   	case 4:
   	   System.out.print("Cuarenta");
   	   break;

   	case 5:
   	   System.out.print("Cincuenta");
   	   break;

   	case 6:
   	   System.out.print("Sesenta");
   	   break;

   	case 7:
   	   System.out.print("Setenta");
   	   break;

   	case 8:
   	   System.out.print("Ochenta");
   	   break;

   	case 9:
   	   System.out.print("Noventa");
   	   break;
   	}

   System.out.print(" y ");

   switch(unidades){

    case 0:
       System.out.println("Cero");
       break; 

    case 1:
   	   System.out.println("Uno");
   	   break;

    case 2:
   	   System.out.println("Dos");
   	   break; 

   	case 3:
   	   System.out.println("Tres");
   	   break;

   	case 4:
   	   System.out.println("Cuatro");
   	   break;

   	case 5:
   	   System.out.println("Cinco");
   	   break;

   	case 6:
   	   System.out.println("Seis");
   	   break;

   	case 7:
   	   System.out.println("Siete");
   	   break;

   	case 8:
   	   System.out.println("Ocho");
   	   break;

   	case 9:
   	   System.out.println("Nueve");
   	   break;
       }

   }

  }

        
        
        
    