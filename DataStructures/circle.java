/**
 * Author: Isaac Watts
 * Date: 09/20/23
 * Description: making a class circle
 */


public class circle {
    private int radius;

    //Constructor
    public circle(int r){
        this.radius = r;
    }

    public void setRadius(int r){
    	this.radius = r;
    }
    public int getRadius(){
    	return this.radius;
    }

    static void circleMessage(){
       	System.out.println("This is a circle");
    }

    public void circleFact(){
	    System.out.println("This circle has an area");
    }

    public void circleArea(double pi){
	    System.out.println("Pi is: " + pi);
    }
}
