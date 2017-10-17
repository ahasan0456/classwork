import java.util.Random;
/*
*	Author: Amir Hasan
*	Last Updated: 10-17-17
*	Description: Utilities file for Shape Project.
*/
public class ShapeUtilities
{
	public static double sumPerimeter(Shape[] shapeArr)
	{
		double sum=0.0;
		for(int x=0;x<shapeArr.length;x++)
		{
			sum+=shapeArr[x].perimeter();
		}
		return sum;
	}
	public static double sumArea(Shape[] shapeArr)
	{
		double sum=0.0;
		for(int x=0;x<shapeArr.length;x++)
		{
			sum+=shapeArr[x].area();
		}
		return sum;
	}
	public static Shape getRandomShape()
	{
		Random r=new Random();
		int x=r.nextInt(3);
		switch(x)
		{
			case 0:
			{
				return new Circle(r.nextInt(100)+1);
			}
			case 1:
			{
				return new Rectangle(r.nextInt(100)+1,r.nextInt(100)+1);
			}
			default:
			{
				return new Square(r.nextInt(100)+1);
			}
		}
	}
}