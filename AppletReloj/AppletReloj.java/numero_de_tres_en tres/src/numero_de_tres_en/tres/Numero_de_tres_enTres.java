
// Imprimir y sumar los numeros de tres en tres hasta 99 //

package numero_de_tres_en.tres;

public class Numero_de_tres_enTres {

    public static void main(String[] args) {
        
        int i, suma=0;
        
        for(i=3; i<=100; i+=3){
        System.out.print(+i+ " ");
    
        suma = i+i;
        System.out.println("La suma total es : " + suma);
        }
    }
}
