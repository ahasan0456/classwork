/*
*	Authors: Amir Hasan & Justin Fagan
*	Last Updated: 11-14-17
*	Description: Lab 3.1
*/
public class ArrayMethods
{
	public static void main(String[]args)
	{
		int[] list= {1,2,3,7,5,1,0,1,2,1,0,9,5};
		int[] list1= {1,2,3};
		int[] list2= {4,3,2};
		printArr(list);
		System.out.println();
		printArr(removeDuplicates(list));
		System.out.println();
		int[][] list12product=productArray(list1,list2);
		for(int x=0;x<list12product.length;x++)
		{
			printArr(list12product[x]);
			System.out.println();
		}
		int[][] pascalTri=pascalTriangle(5);
		for(int x=0;x<pascalTri.length;x++)
		{
			printArr(pascalTri[x]);
			System.out.println();
		}
		printPascalTriangle(pascalTri);
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
		int[][]product=new int[arr2.length][arr1.length];
		for(int x=0;x<product.length;x++)
		{
			for(int y=0;y<product[x].length;y++)
			{
				product[x][y]=arr1[y]*arr2[x];
			}
		}
		return product;
	}
	public static int[][] pascalTriangle(int n)
	{
		int[][] pascalTriangle=new int[n][];
		for(int x=0;x<n;x++)
		{
			pascalTriangle[x]=new int[x+1];
			for(int y=0;y<pascalTriangle[x].length;y++)
			{
				if(y==x||y==0)
				{
					pascalTriangle[x][y]=1;
				}
				else
				{
					pascalTriangle[x][y]=pascalTriangle[x-1][y-1]+pascalTriangle[x-1][y];
				}
			}
		}
		return pascalTriangle;
	}
	private static void printArr(int[]list)
	{
		for(int item: list)
		{
			System.out.print("["+item+"]");
		}
	}
	public static void printPascalTriangle(int[][] pTriangle)
	{
		/*for(int x=0;x<pTriangle.length;x++)
		{
			printArr(pTriangle[x]);
			System.out.println();
		}*/
		for(int x=0;x<pTriangle.length;x++)
		{
			for(int z=(pTriangle.length-(x+1));z>=0;z--)
			{
				System.out.print(" ");
			}
			for(int y=0;y<pTriangle[x].length;y++)
			{
				System.out.print(pTriangle[x][y]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
