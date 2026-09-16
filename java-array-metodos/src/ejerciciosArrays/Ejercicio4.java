/*
.Realiza un programa que pida por teclado 10 números enteros y los almacene en un array. Al acabar
de pedir los números, nos pedirá un nuevo número para que lo busquemos entre los existentes en el
array, y nos dirá si ha sido encontrado o no.
 */
package ejerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        
        for(int i=0;i<num.length;i++){
            System.out.print("Numero["+(i+1)+"]: ");
            num[i]=sc.nextInt();
        }
        
        System.out.print("Ingrese un numero para buscar repeticiones: ");
        int numero=sc.nextInt();
        
        boolean encontrado = false; 
        
        for(int i=0;i<num.length;i++){
            
            if(numero==num[i]){
                encontrado=true;
                System.out.println("El numero "+numero+" esta repetido en la pocision["+(i+1)+"]");
            }
            
        }
        
        if(encontrado==false){
            System.out.println("No se econtraron repeticiones en el Array.");
        }
        
    }
    
}
