/*
*	Author: Amir Hasan & Justin Fagan
*	Last Updated: 11-17-17
*	Description: Lab 3.2
*/
public class ArrayMethods2
{
	public static void main(String[] args)
	{
		String[] test1= {"Amethyst","Basketball","X-ray"};
		String[] test2= {"Alphabet","Cooking","Eating","Sleeping"};
		String[] merged=merge(test1,test2);
		printArr(merged);
	}
	private static void printArr(String[] list) {
		for(String h:list)
		{
			System.out.print("["+h+"] ");
		}
		System.out.println();
	}
	public static String[] merge(String[] list1,String[] list2)
	{
		int size= list1.length+list2.length;
		String[] result=new String[size];
		int i=0; //current position in result
		int j=0; //current position in list1
		int k=0; //current position in list2
		while(i<size)
		{
			if(j<list1.length&&k<list2.length)
			{
				if(list1[j].compareTo(list2[k])<0)
				{
					result[i]=list1[j];
					j++;
				}
				else
				{
					result[i]=list2[k];
					k++;
				}
			}
			else if(j==list1.length)
			{
				result[i]=list2[k];
				k++;
			}
			else
			{
				result[i]=list1[j];
				j++;
			}
			i++;
		}
		return result;
	}
	public static String[] mergeSort(String[] list)
	{
		if(list.length>1)
		{
			mergeSort()
		}
	}
	public static int partition(int[] list)
	{
		int pivotNum=list[0];
	}
}