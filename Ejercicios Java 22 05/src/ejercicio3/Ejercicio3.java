package ejercicio3;

/*3. Pedir n�meros por pantalla hasta que alguno sea mayor a 100 y adem�s sea un
numero primo*/

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean encontrado = false;

        System.out.println("Ingrese n�meros (el programa finalizar� cuando ingrese un n�mero primo mayor a 100):");

        while (!encontrado) {
            numero = scanner.nextInt();

            if (numero > 100 && esPrimo(numero)) {
                encontrado = true;
                System.out.println("El n�mero " + numero + " es primo y mayor a 100. �Programa finalizado!");
            } else {
                System.out.println("Ingrese otro n�mero:");
            }
        }

        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        if (numero == 2 || numero == 3) {
            return true;
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        int divisor = 5;
        while (divisor * divisor <= numero) {
            if (numero % divisor == 0 || numero % (divisor + 2) == 0) {
                return false;
            }
            divisor += 6;
        }

        return true;
    }
}