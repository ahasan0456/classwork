/*
*	Author: Amir Hasan
*	Last Updated: 10-17-17
*	Description: Square file for Shape Project.
*/
public class Square implements Shape
{
	private double length;
	public Square(double length)
	{
		this.length=length;
	}
	public double perimeter()
	{
		return 4*length;
	}
	public double area()
	{
		return length*length;
	}
}