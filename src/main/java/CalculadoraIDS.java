import java.util.Scanner;

public class CalculadoraIDS{

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean exit = false;
        while (!exit) {

            System.out.println("Elije una operación: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("0. Salir");
            double operator = scanner.nextDouble();

            if (operator == 0){
                System.out.println("Hasta luego");
                exit =  true;
                break;
            }

            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            switch ((int) operator) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    throw new IllegalArgumentException("Operador invalido.");
            }
            System.out.println("El resultado es: " + result);
        }
    }

    public double add(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b){
        if (b != 0){
            return a / b;
        } else {
            throw new ArithmeticException("Division con cero.");
        }
    }

    public static void main(String[] args){
        CalculadoraIDS calculator = new CalculadoraIDS();
        calculator.start();
    }
}