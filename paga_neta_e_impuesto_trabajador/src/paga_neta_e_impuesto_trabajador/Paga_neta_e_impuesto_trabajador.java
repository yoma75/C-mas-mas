
package paga_neta_e_impuesto_trabajador;

import java.util.Scanner;

public class Paga_neta_e_impuesto_trabajador {

    public static void main(String[] args) {
     
        Scanner sn=new Scanner(System.in); 
              // sn es el nombre de la variable //
        
        double imp=15; 
        int vh=3750; 
        
        //vh = valor hora trabajada, imp = impuesto // 
               
      System.out.print("Introduzca el numero de horas trabajadas: ");
      int nht=sn.nextInt(); 
        // nht = numero de horas trabajadas // 
      
      
      int pagabruta=nht*vh; // vh = valor hora //
       System.out.println("Su paga bruta es :  "+pagabruta);
      
      double tip=pagabruta*imp/100; 
             // tip = total impuestos a pagar,
             // imp = impuesto por pagar// 
       System.out.println("Menos el total de impuestos a pagar es de : "+tip);
        
      double pn=pagabruta-tip;
            // pn= paga neta //
       System.out.println("Su paga neta quincenal es de : "+pn);
       
            
              
    }
    
}
