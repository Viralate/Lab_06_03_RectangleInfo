import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        //initate scanner
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;

        // Get valid width
        while (true) {
            System.out.print("Enter the width of the rectangle: ");
            width = scanner.nextDouble();
            if (width > 0) {
                break;
            }
            System.out.println("Width must be a positive number.");
        }

        // Get valid height
        while (true) {
            System.out.print("Enter the height of the rectangle: ");
            height = scanner.nextDouble();
            if (height > 0) {
                break;
            }
            System.out.println("Height must be a positive number.");
        }

        // Calculating area, perimeter, and diagonal
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        // Displaying results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);
    }
}
