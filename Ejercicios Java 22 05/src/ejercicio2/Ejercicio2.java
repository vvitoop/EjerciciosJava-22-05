/*2. Escribir por consola los números del 50 al 100 de la siguiente manera si es un numero
primo escribir primo, sino escribir sus divisores*/

package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        for (int i = 50; i <= 100; i++) {
            boolean esPrimo = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(i + ": primo");
            } else {
                System.out.print(i + ": ");

                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}