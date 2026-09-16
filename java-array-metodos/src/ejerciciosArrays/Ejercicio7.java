/*
Crear un programa que tenga dos arrays, uno con los 6 números de una apuesta de la primitiva, y
otro con los 6 números ganadores. Los arrays se rellenan aleatoriamente (no hace falta controlar que
no haya repetidos). El programa debe luego informar del número de aciertos, y mostrar también los
dos arrays.
 */
package ejerciciosArrays;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int aciertos = 0;
        int[] apuesta = new int[6];
        int[] ganadores = new int[6];
        
        for(int i=0;i<apuesta.length;i++){
            apuesta[i] = (int)(Math.random() * 49) + 1; //para subir un poco la probabilidad lo limito 
        }
        
        for(int i=0;i<ganadores.length;i++){
            ganadores[i] = (int)(Math.random() * 49) + 1; //para subir un poco la probabilidad lo limito 
        }

        for (int i = 0; i < apuesta.length; i++) {
            for (int j = 0; j < ganadores.length; j++) {
                if (apuesta[i] == ganadores[j]) {
                    aciertos++;
                }
            }
        }
        System.out.println("");
        System.out.println("Numero de aciertos: "+aciertos);
        System.out.println("");
        
        System.out.println("Apuesta primitiva");
        for(int i=0;i<apuesta.length;i++){
            System.out.println("Dato["+(i+1)+"]: "+apuesta[i]); 
        }
        
        System.out.println("");
        System.out.println("Numeros ganadores");
        for(int i=0;i<ganadores.length;i++){
            System.out.println("Dato["+(i+1)+"]: "+ganadores[i]); 
        }
    }

}
