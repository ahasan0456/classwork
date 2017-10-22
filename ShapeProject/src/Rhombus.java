/*
*	Author: Amir Hasan
*	Last Updated: 10-22-17
*	Description: Rhombus file for Shape Project.
*/
public class Rhombus implements Shape
{
	private double sideLength;
	private double angleA;
	public Rhombus(double sideLength)
	{
		this.sideLength=sideLength;
	}
	public double area()
	{
		return 4*((sideLength*sideLength)*Math.sin(Math.toRadians(angleA/2))*Math.sin(Math.toRadians(angleB()/2))/2);
	}
	public double angleB()
	{
		return (360-(angleA*2))/2;
	}
	public double perimeter()
	{
		return 4*sideLength;
	}
	public String toString()
	{
		return "Rhombus, Side Length: "+sideLength+", Angle Measure (degrees): "+angleA;
	}
}