/*4. Mostrar los numeros del 0 al 100 y al lado de ellos, la suma de sus digitos*/

package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1; 
        }

        for (int num : numeros) {
            int suma = 0;
            int numeroActual = num;
            while (numeroActual > 0) {
                int digito = numeroActual % 10;
                suma += digito;
                numeroActual /= 10;
            }
            System.out.println(num + " -> Suma de dígitos: " + suma);
        }
    }
}
