import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("Select operation:");1
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter choice (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Calculator exiting. Goodbye!");
                break;
            }

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                // Perform the selected operation
                switch (choice) {
                    case 1:
                        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                        break;
                }
            } else {
                System.out.println("Invalid Input. Please enter a valid choice.");
            }
        }

        scanner.close();
    }

    private static double add(double x, double y) {
        return x + y;
    }

    private static double subtract(double x, double y) {
        return x - y;
    }

    private static double multiply(double x, double y) {
        return x * y;
    }

    private static double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Cannot divide by zero");
            return Double.NaN; 
        }
    }
}