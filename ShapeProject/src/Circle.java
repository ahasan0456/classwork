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