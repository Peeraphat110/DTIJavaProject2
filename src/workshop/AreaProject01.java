package workshop;

import java.util.Scanner;

public class AreaProject01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("+++++++++++++++ Shape Area Program +++++++++++++++");
            System.out.println("+                                                 +");
            System.out.println("+              1. Square Area                    +");
            System.out.println("+              2. Triangle Area                  +");
            System.out.println("+              3. Circle Area                    +");
            System.out.println("+                                                 +");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Select a shape (1-3, or 0 to exit): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n+++++++++++++++ Square Area +++++++++++++++");
                    System.out.print("Input widths: ");
                    double width = scanner.nextDouble();
                    System.out.print("Input longs: ");
                    double length = scanner.nextDouble();
                    double squareArea = width * length;
                    System.out.println("Area of square is: " + squareArea);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++\n");
                    break;
                case 2:
                    System.out.println("\n+++++++++++++++ Triangle Area +++++++++++++++");
                    System.out.print("Input base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Input height: ");
                    double height = scanner.nextDouble();
                    double triangleArea = (base * height) / 2;
                    System.out.println("Area of Triangle: " + triangleArea);
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++\n");
                    break;
                case 3:
                    System.out.println("\n+++++++++++++++ Circle Area ++++++++++++++++");
                    System.out.print("Input radius: ");
                    double radius = scanner.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    System.out.println("Area of Circle: " + circleArea);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++\n");
                    break;
                case 0: // Exit
                    System.out.println("\nExiting program. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please select again.\n");
            }
        } while (choice != 0);

        scanner.close();
    }
}
