import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");

        System.out.print("Enter the operation (1-5): ");
        int operation = scanner.nextInt();

        double result;
        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            case 5:
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot calculate modulo with zero.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose a number between 1 and 5.");
        }
    }
}
