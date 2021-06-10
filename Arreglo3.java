import java.util.*;

public class Arreglo3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int factorial = 1;

        System.out.print("Ingrese un numero: ");
        numero = teclado.nextInt();

        for (int i = numero; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println(numero+"! = "+factorial);

    }
}