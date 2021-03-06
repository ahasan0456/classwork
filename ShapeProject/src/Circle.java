/*
*	Author: Amir Hasan
*	Last Updated: 10-18-17
*	Description: Circle file for Shape Project.
*/
public class Circle implements Shape
{
	private double radius;
	private static double pi=3.14;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double perimeter()
	{
		return 2*pi*radius;
	}
	public double area()
	{
		return pi*radius*radius;
	}
	public String toString()
	{
		 return "Circle, Radius: " + radius + ", Area: " + this.area() + ", Perimeter: " + this.perimeter();
	}
}