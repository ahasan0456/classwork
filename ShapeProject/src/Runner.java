/*
*	Author: Amir Hasan
*	Last Updated: 10-17-17
*	Description: Runner file for Shape Project.
*/
public class Runner
{
	public static void main(String[] args)
	{
		Shape shape1=ShapeUtilities.getRandomShape();
		Shape shape2=ShapeUtilities.getRandomShape();
		Shape shape3=ShapeUtilities.getRandomShape();
		Shape[] testArr= {shape1,shape2,shape3};
		double psum=ShapeUtilities.sumPerimeter(testArr);
		double asum=ShapeUtilities.sumArea(testArr);
		System.out.println(psum);
		System.out.println(asum);
	}
}