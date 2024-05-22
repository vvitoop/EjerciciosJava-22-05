/*5. Realizar una calculadora con operaciones aritméticas simples (+,-,*,/)
*/
package ejercicio5
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        String operacion;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el primer número: ");
            num1 = scanner.nextDouble();

            System.out.print("Ingrese la operación (+, -, *, /): ");
            operacion = scanner.next();

            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextDouble();

            switch (operacion) {
                case "+":
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                    break;
                case "*":
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                    } else {
                        System.out.println("Error: División entre cero no está permitida.");
                    }
                    break;
                default:
                    System.out.println("Error: Operación inválida.");
                    break;
            }

            System.out.print("¿Desea realizar otra operación? (s/n): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        scanner.close();
    }
}