/**
 * Author: Isaac Watts
 * Data: 09/20/23
 * Description: Making a shape tester for a circle and square
 */
import java.util.Scanner;
public class myShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        // Circle circle = new Circle();
        // circle.setRadius(radius);

        
        //round like in the example output
        System.out.printf("The circle area is %.2f%n", circle.getArea());
        System.out.printf("The circle's diameter is %.0f%n", circle.getDiameter());
        System.out.printf("The circle's circumference is %.5f%n", circle.getCircumference());


        System.out.print("Please enter the length of the square: ");
        double len = sc.nextDouble();

        Square square = new Square();
        square.setLength(len);


        //round to nearest whole number here
        System.out.printf("The square's area is %.0f%n", square.getArea());
        System.out.printf("The square's perimeter is %.0f%n", square.getPerimeter());
        sc.close();
    }
}
