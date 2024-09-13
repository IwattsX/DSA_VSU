/**
 * Author: Isaac Watts
 * Data: 09/20/23
 * Description: Making a shape tester for the circle class from circle.java
 */
public class shapeTester {
    public static void main(String[] args) {
        circle myCircle = new circle(10);

        //System.out.println("Circle radius is: " + myCircle.radius);
        // myCircle.radius = 20;
        //System.out.println("Circle radius is: " + myCircle.radius);

        circle myCircle1 = new circle(10);
        circle myCircle2 = new circle(20);

        //System.out.println("Circle radius is: " + myCircle1.radius);
        //System.out.println("Circle radius is: " + myCircle2.radius);

	    //access it in a static way
        circle.circleMessage();

	    myCircle1.circleFact();

	    myCircle1.circleArea(3.14);

	    myCircle1.setRadius(100);

	    System.out.println("Circle radius is: " + myCircle1.getRadius());
	

    }
}
