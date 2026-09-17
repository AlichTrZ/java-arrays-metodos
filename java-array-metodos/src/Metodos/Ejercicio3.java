/*
Crear un método String mostrarVector(int [] elementos) que escriba por consola los elementos del
array que no estén repetidos, entre corchetes y separados entre si por comas. Crear una clase Prueba
con un main que llame y compruebe el funcionamiento del método anterior.
 */
package Metodos;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio3{

    public static void main(String[] args) {

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10) + 1;
        }

        String resultado = mostrarVector(numeros);

        System.out.println(resultado);
    }

    public static String mostrarVector(int[] elementos) {

        int[] temporal = new int[elementos.length];
        int contador = 0;

        for (int i = 0; i < elementos.length; i++) {

            boolean repetido = false;

            for (int j = 0; j < contador; j++) {
                if (elementos[i] == temporal[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                temporal[contador] = elementos[i];
                contador++;
            }
        }

        String texto = "[";

        for (int i = 0; i < contador; i++) {
            texto = texto + temporal[i];

            if (i < contador - 1) {
                texto = texto + ", ";
            }
        }

        texto = texto + "]";

        System.out.println("Los elementos sin repetir son: " + texto);

        return texto;
    }
}