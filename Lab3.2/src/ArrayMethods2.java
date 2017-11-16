/*
*	Author: Amir Hasan & Justin Fagan
*	Last Updated: 11-16-17
*	Description: Lab 3.2
*/
public class ArrayMethods2
{
	public static void main(String[]args)
	{
		printArr(merge(args, args));
	}
	private static void printArr(String[] list) {
		for(String h:list)
			System.out.print(list[i]);
	}
	public static String[] merge(String[]list1,String[]list2)
	{
		int size= list1.length+list2.length;
		String[]result=new String[size];
		String add;
		for(int j=0;j<list1.length;j++)
		{
			result[j]=list1[j];
		}
		for(int k=list1.length+1;k<size;k++)
		{
			result[k]=list2[k-4];
		}
		//result[i]=add;
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