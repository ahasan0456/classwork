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
		printArr(list);
	}
	public static int[] removeDuplicates(int[] list)
	{
		/*int size=list.length;
		 * 
		int i=0;
		while(list[i]!=list[i+1])
		{
			newList[i]=list[i];
			i++;
		}
		return newList;
		int[] newList=new int[size];
		for(int i=0;i<list.length;i++)
			for(int j=i+1;j<list.length-1;j++)
			{
				if(list[i]!=list[j])
				{
					newList[i]=list[i];
				}
			}
		*/
		int[] dupePosList=returnDuplicatePos(list);
		int[] newList=new int[list.length-dupePosList.length];
		for(x=0;x<newList.length;x++)
		{
			
		}
		return newList;
	}
	public static int[][] productArray(int[] arr1, int[]arr2)
	{
		int[][]product=new int[3][4];
		return product;
		
	}
	private static void printArr(int[]list)
	{
		for(int item: list)
			System.out.print(item);
	}
	private static boolean contains(int[]numList, int target)
	{
		for(int num:numList)
		{
			if(numList[num]==target)
				return true;
		}
	}
	public static int[] returnDuplicatePos(int[] list)
	{
		int count=0;
		boolean xDupe=false;
		int[] countedPos=new int[list.length];
		for(int x=0;x<list.length-1;x++)
		{
			for(int y=x+1;y<list.length;y++)
			{
				if(list[x]==list[y])
				{
					for(int z=0;z<countedPos.length;z++)
					{
						if(list[x]==countedPos[z])
						{
							xDupe=true;
						}
					}
					if(xDupe)
					{
						countedPos[count]=y;
						count++;
					}
					else
					{
						countedPos[count]=x;
						countedPos[count]=y;
						count+=2;
					}
					xDupe=false;
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