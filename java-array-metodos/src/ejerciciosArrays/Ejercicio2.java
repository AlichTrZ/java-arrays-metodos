/*
Realiza un programa que pida por teclado 5 números enteros y los almacene en un array, para
posteriormente mostrarlos en el orden inverso al que fueron introducidos
 */
package ejerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] datos = new int [5];
        
        
        System.out.println("Introduzca 5 numeros:");
        
        for(int i=0;i<datos.length;i++){
            
            System.out.print("Dato["+(i+1)+"]: ");
            datos[i]=sc.nextInt();
        }

        System.out.println("");
        System.out.println("El orden invertido");
        System.out.println("");

        for(int i=datos.length-1;i>=0;i--){
            System.out.println("Dato["+(i+1)+"]: "+datos[i]);
        }
    }
    
}
