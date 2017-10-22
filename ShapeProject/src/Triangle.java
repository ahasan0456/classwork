/*
*	Author: Amir Hasan
*	Last Updated: 10-22-17
*	Description: Triangle file for Shape Project.
*/
public class Triangle implements Shape
{
	private double sideA;
	private double sideB;
	private double angleC;
	public Triangle(double sideA, double sideB, double angleC)
	{
		this.sideA=sideA;
		this.sideB=sideB;
		this.angleC=angleC;
	}
	public double area()
	{
		return 0.5*sideA*sideB*Math.sin(Math.toRadians(angleC));
	}
	public double sideC()
	{
		return Math.sqrt((sideA*sideA)+(sideB*sideB)-(2*sideA*sideB*Math.cos(Math.toRadians(angleC))));
	}
	public double perimeter()
	{
		return sideA+sideB+sideC();
	}
	public String toString()
	{
		 return "Triangle, Side A Length: " + sideA + ", Side B Length: "+sideB+", Angle C Measure (degrees): "+angleC+ ", Area: " + this.area() + ", Perimeter: " + this.perimeter();
	}
}
