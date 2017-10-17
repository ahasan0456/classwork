/*
*	Author: Amir Hasan
*	Last Updated: 10-17-17
*	Description: Circle file for Shape Project.
*/
public class Circle implements Shape
{
	public double radius;
	public static double pi=3.14;
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
}