/*
*	Author: Amir Hasan
*	Last Updated: 10-17-17
*	Description: Rectangle file for Shape Project.
*/
public class Rectangle implements Shape
{
	private double length;
	private double width;
	public Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double perimeter()
	{
		return (2*length)+(2*width);
	}
	public double area()
	{
		return length*width;
	}
	public String toString()
	{
		 return "Rectangle, Width: " + width + ", Length: " + length + ", Area: " + this.area() + ", Perimeter: " + this.perimeter();
	}
}