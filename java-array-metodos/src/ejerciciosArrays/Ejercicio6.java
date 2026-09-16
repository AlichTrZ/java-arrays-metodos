/*
Rellenar aleatoriamente un array de 10 números enteros. Indicar si todos los números son iguales.
 */
package ejerciciosArrays;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        
        for(int i=0;i<numeros.length;i++){
            numeros[i] = (int)(Math.random() * 10) + 1; 
        }
        
        boolean iguales = true;
        
        for(int i=0;i<numeros.length;i++){
            System.out.println("Dato["+(i+1)+"]: "+numeros[i]);
       
        }

        for(int i=1;i<numeros.length;i++){
            
            if(numeros[i]!=numeros[0]){
                iguales=false;
            }
        }
        
        if(iguales==true){
            System.out.println("Todos los numeros son iguales");
        }
        else{
            System.out.println("Los numeros son diferentes");
        }

    }

}
