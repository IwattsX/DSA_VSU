/**
 * Author: Isaac Watts
 * Data: 09/20/23
 * Description: Square class
 */
public class Square{
	private double length;
	public Square(double squareLength){
		this.length = squareLength;
	}
	public Square(){
		this.length = 0;
	}
	void setLength(double l){
		this.length = l;
	}
	public double getLength(){
		return this.length;
	}
	public double getArea(){
		return Math.pow(this.length, 2);
	}
	public double getPerimeter(){
		return (4*this.length);
	}
}
