/*
*	Author: Amir Hasan
*	Last Updated: 11-6-17
*	Description: Lab 3.1
*/
public class ArrayMethods
{
	public static void main(String[]args)
	{
		int[] list= {1,2,3,7,5,1,0,2};
	}
	public static int[] removeDuplicates(int[] list)
	{
		
		int[] newList=new int[list.length];
		int i=0;
		while(list[i]!=list[i+1])
		{
			newList[i]=list[i];
			i++;
		}
		return newList;
	}
	public static int[][] productArray(int[] arr1, int[]arr2)
	{
		int[][]product=new int[3][4];
		return product;
		
	}
	public static int[] findDuplicates(int[] list)
	{
		String numList="";
		for(int x=0;x<list.length-1;x++)
		{
			for(int y=x+1;y<list.length;y++)
			{
				if(list[x]=list[y])
				{
					numList=numList+x+" "+y+" ";
				}
			}
		}
	}
	public static int[] numStringToList()
	{
		for()
	}
}