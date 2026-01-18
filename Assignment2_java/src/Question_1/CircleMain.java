package Question_1;
import java.util.Scanner;

public class CircleMain {
	public static void main(String[] args) {

        
        try(Scanner sc = new Scanner(System.in);
) {
            // 1️ Default Circle
            Circle c1 = new Circle();
            System.out.println("Default Circle");
            System.out.println("Radius: " + c1.getRadius());
            System.out.println("Area: " + c1.getArea());
            System.out.println("Circumference: " + c1.getCircumference());
            System.out.println("--------------------------------");

            // 2️ Circle with fixed radius
            Circle c2 = new Circle(32.0);
            System.out.println("Circle with radius 32");
            System.out.println("Radius: " + c2.getRadius());
            System.out.println("Area: " + c2.getArea());
            System.out.println("Circumference: " + c2.getCircumference());
            System.out.println("--------------------------------");

            // 3️ User input circle
            System.out.print("Enter radius for circle: ");
            double r = sc.nextDouble();

            Circle c3 = new Circle(r);
            System.out.println("User Circle");
            System.out.println("Radius: " + c3.getRadius());
            System.out.println("Area: " + c3.getArea());
            System.out.println("Circumference: " + c3.getCircumference());

        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}