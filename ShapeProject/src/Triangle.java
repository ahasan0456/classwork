/*
*	Author: Amir Hasan
*	Last Updated: 10-19-17
*	Description: Triangle file for Shape Project.
*/
public class Triangle implements Shape
{
	private double sideA;
	private double sideB;
	private double sideC;
	private double angleA;
	private double angleB;
	private double angleC;
	public Triangle(double sideA, double sideB, double angleC)
	{
		this.sideA=sideA;
		this.sideB=sideB;
		this.angleC=angleC;
	}
	public double area()
	{
		return 0;
	}
	public double perimeter()
	{
		return sideA+sideB+sideC;
	}
	public String toString()
	{
		 return "Square, Side A Length: " + sideA + ", Side B Length: "+sideB+", Angle C Measure: "+angleC+ ", Area: " + this.area() + ", Perimeter: " + this.perimeter();
	}
}
