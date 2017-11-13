/*
*	Author: Amir Hasan
*	Last Updated: 11-6-17
*	Description: Lab 3.1
*/
public class ArrayMethods
{
	public static void main(String[]args)
	{
		int[] list= {1,2,3,7,5,1,0,1,2,1,0,5};
		int[] list1= {1,3,5};
		int[] list2= {};
		printArr(list);
		printArr(removeDuplicates(list));
	}
	public static int[] removeDuplicates(int[] list)
	{
		
		int size=0;
		int[] newList=new int[list.length];
		for(int i=0;i<list.length;i++)
		{
			boolean unique=true;
			for(int j=i+1;j<list.length-1;j++)
			{
				if(list[i]==list[j])
				{
					unique=false;
					break;
				}
			}
			if(unique)
			{
				newList[size]=list[i];
				size++;
			}
		}
		int[] newNewList=new int[size];
		for(int x=0;x<size;x++)
		{
			newNewList[x]=newList[x];
		}
		return newNewList;
	}
	public static int[][] productArray(int[] arr1, int[]arr2)
	{
		int[][]product=new int[arr1.length][arr2.length];
		for(int x=0;x<product.length;x++)
		{
			for(int y=0;y<product[x].length;y++)
			{
				product[x][y]=arr1[x]*arr2[y];
			}
		}
		return product;
		
	}
	private static void printArr(int[]list)
	{
		for(int item: list)
		{
			System.out.print("["+item+"]");
		}
			System.out.println();
	}
	private static boolean contains(int[]numList, int target)
	{
		for(int num:numList)
		{
			if(numList[num]==target)
				return true;
		}
		return false;
	}
	public static int[] returnDuplicatePos(int[] list)
	{
		int count=0;
		int[] countedPos=new int[list.length];
		for(int x=0;x<list.length-1;x++)
		{
			for(int y=x+1;y<list.length;y++)
			{
				if(list[x]==list[y])
				{
					countedPos[count]=y;
					count++;
				}
			}
		}
		int[] newCountPos=new int[count];
		for(int c=0;c<count;c++)
		{
			newCountPos[c]=countedPos[c];
		}
		return newCountPos;
	}
}