/*1. Escribir por consola los n�meros de del 1 al 100 de la siguiente forma
si el n�mero es par, escribir par sino escribir el mismo n�mero*/

package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("par");
            } else {
                System.out.println(i);
            }
        }
    }
}