package day2;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result;

            switch (op) {

                case '+':
                    result = a + b;
                    System.out.println("Result = " + result);
                    break;

                case '-':
                    result = a - b;
                    System.out.println("Result = " + result);
                    break;

                case '*':
                    result = a * b;
                    System.out.println("Result = " + result);
                    break;

                case '/':
                    if (b != 0) {
                        result = a / b;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;

                case '%':
                    if (b != 0) {
                        result = a % b;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Cannot find remainder with zero");
                    }
                    break;

                default:
                    System.out.println("Invalid operator");
            }
        }
    }
}