package iuh.fit.oop;

import java.util.Scanner;

/**
 * The TestRectangle class is used to test the {@link Rectangle} class.
 * <p>
 * It allows the user to input length and width, then creates a Rectangle object,
 * and displays its area, perimeter, and details.
 * </p>
 *
 * @author  Tran Moc Tan Phat
 * @version 1.0
 * @since   2025-08-24
 */
public class TestRectangle {
    /**
     * The entry point of the program.
     * <p>
     * It reads length and width from user input, validates them,
     * creates a {@link Rectangle}, and prints out its area, perimeter,
     * and string representation.
     * </p>
     *
     * @param args command line arguments (not used here)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length, width;
        do {
            System.out.println("Enter length and width");
            System.out.print("Length: ");
            length = sc.nextDouble();
            System.out.print("Width: ");
            width = sc.nextDouble();
        } while (length < 0 || width < 0);

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println(rectangle);
        sc.close();
    }
}
