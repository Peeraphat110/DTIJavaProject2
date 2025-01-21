package workshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AreaProject02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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

            choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1:
                    System.out.println("\n+++++++++++++++ Square Area +++++++++++++++");
                    System.out.print("Input widths: ");
                    double width = Double.parseDouble(reader.readLine());
                    System.out.print("Input longs: ");
                    double length = Double.parseDouble(reader.readLine());
                    double squareArea = width * length;
                    System.out.println("Area of square is: " + squareArea);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++\n");
                    break;
                case 2:
                    System.out.println("\n+++++++++++++++ Triangle Area +++++++++++++++");
                    System.out.print("Input base: ");
                    double base = Double.parseDouble(reader.readLine());
                    System.out.print("Input height: ");
                    double height = Double.parseDouble(reader.readLine());
                    double triangleArea = (base * height) / 2;
                    System.out.println("Area of Triangle: " + triangleArea);
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++\n");
                    break;
                case 3:
                    System.out.println("\n+++++++++++++++ Circle Area ++++++++++++++++");
                    System.out.print("Input radius: ");
                    double radius = Double.parseDouble(reader.readLine());
                    double circleArea = Math.PI * radius * radius;
                    System.out.println("Area of Circle: " + circleArea);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++\n");
                    break;
                case 0:
                    System.out.println("\nExiting program. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please select again.\n");
            }
        } while (choice != 0);
    }
}
