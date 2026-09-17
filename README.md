<h1> Taller 3 - Arreglos y Metodos. <img width="50" height="50" alt="java" src="https://github.com/user-attachments/assets/91f5b5bd-f17f-466a-b594-732dc8cba8b9" > </h1>

Se desarrollan 7 ejercicios de Arrays y 3 de Metodos.

**Presenta:** Andres Felipe Trochez Lugo  
**Programa Academico:** Tecnologia en Desarrollo de Software   
**Fecha de Entrega:** PENDIENTE


# Ejercicios Arreglos

# **Ejercicio 1**  

Si tenemos de inicio un array int[] miarray = {8,2,5,4,9,1,0,8,9,3} construir un programa que copie miarray en otro array llamado copiaDeDatos, pero sumando 2 a cada elemento, y que escriba el array copiaDeDatos por pantalla, esto es, que salga : "el elemento 1 de copiadedatos es 10”  

"el elemento 2 de copiadedatos es 4"  
"el elemento 3 de copiadedatos es 7"  
"el elemento 4 de copiadedatos es 6"  

```java
package ejerciciosArrays;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int miArray[] = {8,2,5,4,9,1,0,8,9,3};
        int[] copiaDeDatos = new int[10];
        
        for(int i=0;i<copiaDeDatos.length;i++){
            
            copiaDeDatos[i] = miArray[i] + 2;
            
            System.out.println("El elemento "+(i+1)+" de copiadedatos es: "+copiaDeDatos[i]);
        }
        
    }
}

```

# Evidencia de la ejecucion del programa  
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/08cf5509-c38d-4e77-98cf-33741b37d377" />    



# **Ejercicio 2**  

Realiza un programa que pida por teclado 5 números enteros y los almacene en un array, para posteriormente mostrarlos en el orden inverso al que fueron introducidos.  


```java
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

```

# Evidencia de la ejecucion del programa  
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/272f47d0-06db-45c7-98c9-0fb18fa53282" />  

# **Ejercicio 3**  

Escribir un programa en el que se pidan al usuario por teclado los valores de dos arrays de números enteros llamados arr1 y arr2, y luego se construya un nuevo array resultado de “concatenar” los arrays arr1 y arr2, es decir, poner los elementos de arr2 a continuación de los de arr1. Finalmente, se escriban en pantalla todos los elementos del nuevo array.  


```java
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
```

# Evidencia de la ejecucion del programa  
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/f39f1ea1-027a-4347-99ec-dd630dbb118a" />   




# **Ejercicio 4**  

Realiza un programa que pida por teclado 10 números enteros y los almacene en un array. Al acabar de pedir los números, nos pedirá un nuevo número para que lo busquemos entre los existentes en el array, y nos dirá si ha sido encontrado o no.  


```java
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
```

# Evidencia de la ejecucion del programa  
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/7ec4a6b6-82b2-4cd4-a145-b19b9a0a7322" />    



# **Ejercicio 5**  

Escribe un programa que lea 5 números por teclado y que los almacene en un array. Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array.  


```java
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
```

# Evidencia de la ejecucion del programa  
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/4c0aea68-91e5-480c-85de-7aaac9d064c6" />    



# **Ejercicio 6**  

4.a.21.Rellenar aleatoriamente un array de 10 números enteros. Indicar si todos los números son iguales.  


```java
package ejerciciosArrays;

/**
 *
 * @author Andres Felipe Trochez Lugo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        
        for(int i=0;i<numeros.length;i++){
            numeros[i] = (int)(Math.random() * 10) + 1; //esto lo limito para aumentar un poquito la probabilidad de que los numero caigan iguales
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
```

# Evidencia de la ejecución del programa  
<img width="1919" height="1078" alt="image" src="https://github.com/user-attachments/assets/a67732f3-75fd-4187-8fd3-a0d2f8e077e4" />    




# **Ejercicio 7**  

Crear un programa que tenga dos arrays, uno con los 6 números de una apuesta de la primitiva, y otro con los 6 números ganadores. Los arrays se rellenan aleatoriamente (no hace falta controlar que no haya repetidos). El programa debe luego informar del número de aciertos, y mostrar también los dos arrays.


```java
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
```

# Evidencia de la ejecución del programa  
<img width="1918" height="1079" alt="image" src="https://github.com/user-attachments/assets/48ff0ab2-db8a-49ca-ad71-310d6a8d618d" />  


# Ejercicios Metodos

# **Ejercicio 1**  

Realizar un método que reciba un array de números enteros y devuelva un array que tenga sólo uno de cada 10 números del array original. Es decir, si el array original tiene 43 casillas el array devuelto tendrá 5 con los valores de la casilla 0, la 10, la 20, la 30 y la 40;

```java
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

```

# Evidencia de la ejecucion del programa  
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/24315bcb-b630-40d2-a285-b6b421c7b417" />     




# **Ejercicio 2**  

Realizar un método que reciba una array de números enteros y devuelva un array de números enteros, que sería el array recibido pero sin ningún número repetido. Probar el funcionamiento del método con un array de 20 números enteros entre 1 y 10 elegidos de forma aleatoria.

```java
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
```

# Evidencia de la ejecucion del programa  
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/37bce553-2e47-4ac8-bab7-9f116b3b0615" />





# **Ejercicio 3**  

Crear un método String mostrarVector(int [] elementos) que escriba por consola los elementos del array que no estén repetidos, entre corchetes y separados entre si por comas. Crear una clase Prueba con un main que llame y compruebe el funcionamiento del método anterior.

```java
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
```

# Evidencia de la ejecucion del programa  
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/5aa7ded3-668d-4726-8fc9-aaf0f8e74d64" />   



# Conclusion
En este taller trabajé con arrays y métodos en Java. Lo que más se me complicó fue calcular el tamaño de un array nuevo cuando no sabía de antemano cuántos datos iba a tener (como al quitar repetidos o tomar cada 10 posiciones), y entender que para rotar un array necesitaba uno auxiliar, para no pisar valores que todavía me hacían falta.  

También me costó comparar elementos de un array contra todos los de otro (como en el ejercicio de la primitiva), porque al principio quería comparar posición por posición, y ahí entendí que eso no funciona si los números están en otro orden.  

Por último, esta fue mi primera vez armando métodos propios: entender la diferencia entre lo que reciben (parámetros) y lo que devuelven (return) me ayudó a reutilizar lógica en varios ejercicios sin tener que reescribirla de cero cada vez.  
 
