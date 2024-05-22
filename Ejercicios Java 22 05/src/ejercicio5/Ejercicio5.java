/*5. Realizar una calculadora con operaciones aritm�ticas simples (+,-,*,/)
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
            System.out.print("Ingrese el primer n�mero: ");
            num1 = scanner.nextDouble();

            System.out.print("Ingrese la operaci�n (+, -, *, /): ");
            operacion = scanner.next();

            System.out.print("Ingrese el segundo n�mero: ");
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
                        System.out.println("Error: Divisi�n entre cero no est� permitida.");
                    }
                    break;
                default:
                    System.out.println("Error: Operaci�n inv�lida.");
                    break;
            }

            System.out.print("�Desea realizar otra operaci�n? (s/n): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        scanner.close();
    }
}