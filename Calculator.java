import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Código inicial que será ampliado por los desarrolladores
        System.out.println("Bienvenido a la Calculadora Básica.");
        scanner.close();
        // Dentro del método main, después de la bienvenida
        System.out.println("Ingrese el primer número para la suma:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número para la suma:");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.println("El resultado de la suma es: " + result);
        System.out.println("Ingrese el primer número para la resta:");
        double num3 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número para la resta:");
        double num4 = scanner.nextDouble();

        double resultSub = num3 - num4;
        System.out.println("El resultado de la resta es: " + resultSub);

    }
}
