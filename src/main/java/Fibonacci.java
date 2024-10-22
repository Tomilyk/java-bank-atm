import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de términos de la sucesión de Fibonacci: ");
        int n = scanner.nextInt();

        int t1 = 0, t2 = 1;
        System.out.print("Primeros " + n + " términos: ");

        for (int i = 0; i < n; ++i) {
            System.out.print(t1 + " ");

            // Calcula el siguiente término
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}