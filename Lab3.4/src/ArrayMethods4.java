/*
*	Author: Amir Hasan
*	Last Updated: 11-27-17
*	Description: Lab 3.4
*/
public class ArrayMethods4
{
	public static void main(String[] args)
	{
		int[] test1= {0,1,2,3,4,5};
		int[] test2= {6,4,12,8,10};
		int[] test3= {4,2,5,7,4,2,5,9,1};
		int count=0;
		long startTime;
		long endTime;
		long totalTime;
		long sumTime=0;
		long avgTime;
		while(count<10)
		{
			int[] testTime= {5,6,3,2,8,7,4,6,3,1,4,3,0,9};
			startTime=System.nanoTime();
			quickSort(testTime,0,testTime.length-1);
			endTime=System.nanoTime();
			totalTime=endTime-startTime;
			sumTime+=totalTime;
			count++;
		}
		avgTime=sumTime/10;
		System.out.println("Average time taken by quick sort: "+avgTime);
	}
	public static void partition(int[] list1, int front, int back)
	{
		int pivotNum=list1[front];
		int tracker=front;
		for(int i=front+1;i<=back;i++)
		{
			if(list1[i]<=pivotNum)
			{
				for(int j=0;j<i-tracker;j++)
				{
					swap(list1,i-j,i-j-1);
				}
				tracker++;
			}
		}
	}
	public static void quickSort(int[] list1, int front, int back)
	{
		if(front!=back)
		{
			quickSort(list1,front+1,back);
		}
		partition(list1,front,back);
	}
	public static void customSort()
	{
		
	}
	public static void swap(int arr[],int i, int j)
	{
		int x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}
	private static void printArr(int[] list)
	{
		for(int h:list)
		{
			System.out.print("["+h+"] ");
		}
		System.out.println();
	}
}