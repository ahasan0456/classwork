/*
*	Author: Amir Hasan
*	Last Updated: 10-18-17
*	Description: Square file for Shape Project.
*/
public class Square extends Rectangle
{
	private double length;
	public Square(double length)
	{
		super(length,length);
		this.length=length;
	}
	public String toString()
	{
		 return "Square, Side Length: " + length + ", Area: " + this.area() + ", Perimeter: " + this.perimeter();
	}
}