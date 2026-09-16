/*
Escribe un programa que lea 5 números por teclado y que los almacene en un array. Rota los
elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la
2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente,
muestra el contenido del array.
 */
package ejerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int[] arrayOrden = new int[5];
        
        for(int i=0;i<numeros.length;i++){
            
            System.out.print("Dato["+(i+1)+"]: ");
            numeros[i]=sc.nextInt();
        }
        
        arrayOrden[0]=numeros[4]; // esto lo pongo y lo asigno aparte para evitar que los valores se pisen entre si en el for
        
        for(int i=0;i<numeros.length-1;i++){
            
            arrayOrden[i+1]=numeros[i];
        }
        
        for(int i=0;i<numeros.length;i++){
            
            System.out.println("Array Reordenado["+(i+1)+"] "+arrayOrden[i]);

        }
          

    }
    
}
