public class ShapeRunner
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle(5,3);
		Circle c=new Circle(3);
		if(r.area()>c.area())
		{
			System.out.println("The rectangle has the larger area.");
		}
		else
		{
			System.out.println("The circle has the larger area.");
		}
		if(r.perimeter()>c.perimeter())
		{
			System.out.println("The rectangle has the larger perimeter.");
		}
		else
		{
			System.out.println("The circle has the larger perimeter.");
		}
	}
}