/**
 * Author: Isaac Watts
 * Date: 09/20/23
 * Description: making a class circle
 */


public class Circle {
    private double radius;
    public double pi = Math.PI;
    //Constructor
    public Circle(double r){
        this.radius = r;
    }
    public Circle(){
    	this.radius = 0.0;
    }

    public void setRadius(double r){
    	this.radius = r;
    }
    public double getRadius(){
    	return this.radius;
    }

    static void circleMessage(){
       	System.out.println("This is a circle");
    }

    public void circleFact(){
	    System.out.println("This circle has an area");
    }

    public double getArea(){
	    return (this.pi * this.radius * this.radius);
    }
    public double getDiameter(){
    	return (2 * this.radius);
    }
   public double getCircumference(){
   	return (2 * this.pi * this.radius);
   } 
}
