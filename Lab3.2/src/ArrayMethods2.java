/*
*	Author: Amir Hasan & Justin Fagan
*	Last Updated: 11-21-17
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
		String[] test4= {"Nested","Quickly","Array","Match","Zebra","Unicorn"};
		String[] mergeSorted=mergeSort(test4);
		printArr(mergeSorted); //Should return {Array,Match,Nested,Quickly,Unicorn,Zebra}
		int[] test3= {6,2,8,4,6,0,1,7};
		System.out.println(partition(test3)); //Should return 5
		printArr(test3); //Should return {2,4,6,0,1,6,8,7}
		int[] test5= {0,1,6,5,4,2,7};
		System.out.println(partition(test5)); //Should return 0
		printArr(test5); //Should return the original order
	}
	private static void printArr(String[] list) {
		for(String h:list)
		{
			System.out.print("["+h+"] ");
		}
		System.out.println();
	}
	private static void printArr(int[] list) {
		for(int h:list)
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
			String[] list1=new String[list.length/2];
			String[] list2=new String[list.length-list1.length];
			int z=0;
			for(int x=0;x<list1.length;x++)
			{
				list1[x]=list[x];
				z=x+1;
			}
			for(int y=0;y<list2.length;y++)
			{
				list2[y]=list[z];
				z++;
			}
			String[] sort1=mergeSort(list1);
			String[] sort2=mergeSort(list2);
			String[] newList=merge(sort1,sort2);
			return newList;
		}
		return list;
	}
	public static int partition(int[] list)
	{
		int tracker=0;
		int pivotNum=list[0];
		for(int i=1;i<list.length;i++)
		{
			if(list[i]<=pivotNum)
			{
				for(int j=0;j<i-tracker;j++)
				{
					swap(list,i-j,i-j-1);
				}
				tracker++;
			}
		}
		return tracker;
	}
	public static void swap(int arr[],int i, int j)
	{
		int x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}
}