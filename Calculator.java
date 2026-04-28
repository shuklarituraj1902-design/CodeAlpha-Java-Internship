import java.util.Scanner;

public class ProfessionalCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        System.out.println("=================================");
        System.out.println("      WELCOME TO CALCULATOR      ");
        System.out.println("=================================");

        do {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Square");
            System.out.println("7. Cube");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error! Cannot divide by zero.");
                    }
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    result = num1 % num2;
                    System.out.println("Result = " + result);
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();

                    result = num1 * num1;
                    System.out.println("Square = " + result);
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();

                    result = num1 * num1 * num1;
                    System.out.println("Cube = " + result);
                    break;

                case 8:
                    System.out.println("Thank You for using Calculator.");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }

        } while (choice != 8);

        sc.close();
    }
}
