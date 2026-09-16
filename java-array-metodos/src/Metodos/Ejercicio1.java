/*
Realizar un método que reciba un array de números enteros y devuelva un array que tenga sólo uno
de cada 10 números del array original. Es decir, si el array original tiene 43 casillas el array devuelto
tendrá 5 con los valores de la casilla 0, la 10, la 20, la 30 y la 40;
 */
package Metodos;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int[] arrayBase = new int[43];

        for (int i=0;i< arrayBase.length;i++) {
            arrayBase[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("Array original:");
        for (int i=0;i<arrayBase.length;i++) {
            System.out.println("Dato[" + i + "]: " + arrayBase[i]);
        }

        int[] arrayReducido = enteros(arrayBase);

        System.out.println("");
        System.out.println("Array reducido (cada 10 posiciones):");
        for (int i=0;i<arrayReducido.length;i++) {
            System.out.println("Dato[" + i + "]: " + arrayReducido[i]);
        }
    }

    public static int[] enteros(int[] arrayBase) {

        int tamañoNuevo = (arrayBase.length / 10) + 1;
        int[] arrayNuevo = new int[tamañoNuevo];

        int j = 0;

        for (int i=0;i<arrayBase.length;i=i+10) {
            arrayNuevo[j] = arrayBase[i];
            j++;
        }

        return arrayNuevo;
    }
}
