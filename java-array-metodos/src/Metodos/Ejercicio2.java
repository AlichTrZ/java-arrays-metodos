/*
Realizar un método que reciba una array de números enteros y devuelva un array de números
enteros, que sería el array recibido pero sin ningún número repetido. Probar el funcionamiento del
método con un array de 20 números enteros entre 1 y 10 elegidos de forma aleatoria.
 */
package Metodos;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println("Array original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dato[" + i + "]: " + numeros[i]);
        }

        int[] sinRepetidos = quitarRepetidos(numeros);

        System.out.println("");
        System.out.println("Array sin repetidos:");
        for (int i = 0; i < sinRepetidos.length; i++) {
            System.out.println("Dato[" + i + "]: " + sinRepetidos[i]);
        }
    }

    public static int[] quitarRepetidos(int[] array) {

        int[] temporal = new int[array.length];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {

            boolean repetido = false;

            for (int j = 0; j < contador; j++) {
                if (array[i] == temporal[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                temporal[contador] = array[i];
                contador++;
            }
        }

        int[] resultado = new int[contador];

        for (int i = 0; i < contador; i++) {
            resultado[i] = temporal[i];
        }

        return resultado;
    }
}