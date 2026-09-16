/*
Escribir un programa en el que se pidan al usuario por teclado los valores de dos arrays de números
enteros llamados arr1 y arr2, y luego se construya un nuevo array resultado de “concatenar” los arrays
arr1 y arr2, es decir, poner los elementos de arr2 a continuación de los de arr1. Finalmente, se escriban
en pantalla todos los elementos del nuevo array.
 */
package ejerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        
        System.out.print("Ingrese la cantidad de datos que almancena el Array1: ");
        n1=sc.nextInt();
        int[] array1 = new int [n1];
        
        System.out.println("");
        
        System.out.println("Ingrese los datos del Array 1:");
        for(int i=0;i<array1.length;i++){
            System.out.print("Dato["+(i+1)+"] ");
            array1[i]=sc.nextInt();
        }
        
        System.out.println("");
        
        System.out.print("Ingrese la cantidad de datos que almancena el Array2: ");
        n2=sc.nextInt();
        int[] array2 = new int [n2];
        
        System.out.println("");
        
        System.out.println("Ingrese los datos del Array 2:");
        for(int i=0;i<array2.length;i++){

            System.out.print("Dato["+(i+1)+"] ");
            array2[i]=sc.nextInt();
        }
        
        System.out.println("");
        
        int[] concatenar = new int[array1.length+array2.length];
        int j=0;
        
       for(int i=0;i<array1.length;i++){
           concatenar[j]=array1[i];
            j++;
       }
       
        for(int i=0;i<array2.length;i++){
           concatenar[j]=array2[i];
           j++;
       }
       
        for(int i=0;i<concatenar.length;i++){
            System.out.println("Array concatenado["+(i+1)+"]: "+concatenar[i]);

       }
   
    }
    
    
}
