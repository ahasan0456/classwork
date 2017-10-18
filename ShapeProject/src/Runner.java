/*
*	Author: Amir Hasan
*	Last Updated: 10-17-17
*	Description: Runner file for Shape Project (Lab 2.1).
*	Choose one of the following: Triangle, Pentagon, Hexagon, Heptagon, etc.
*	Choose one of the following: Rhombus, Trapezoid, Parallelogram, Kite
*/
public class Runner
{
	public static void main (String[] args)
    {
        Shape circle1 = new Circle(3);
        Shape rectangle1 = new Rectangle(10, 4);
        Shape square1 = new Square(10);
        System.out.println("First test out the hard coded shape array.\n\n");
        Shape [] shapeArr = {circle1, rectangle1, square1};
        for (Shape shape : shapeArr)
        {
        	System.out.println(shape);
        }
        System.out.println("\nDid the three shapes above add up to the total printed here?\n");
        System.out.println("Total Area: " + ShapeUtilities.sumArea(shapeArr)); //168.26
        System.out.println("Total Perimeter: " + ShapeUtilities.sumPerimeter(shapeArr)); //86.84
        System.out.println("\nDid the three shapes above add up to the total printed here?\n");
        System.out.println("\n\n Now testing the random array.\n");
        shapeArr = new Shape[10];
        //Why are we using a for loop instead of a for-each loop here?
        for (int i = 0; i < shapeArr.length; i++)
        {
            shapeArr[i] = ShapeUtilities.getRandomShape();
        }
        for (Shape shape : shapeArr)
        {
            System.out.println(shape);
        }

        System.out.println("\nTotal Area: " + ShapeUtilities.sumArea(shapeArr));
        System.out.println("Total Perimeter: " + ShapeUtilities.sumPerimeter(shapeArr));
    }
}