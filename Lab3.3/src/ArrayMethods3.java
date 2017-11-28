/*
*	Author: Amir Hasan
*	Last Updated: 11-21-17
*	Description: Lab 3.3
*/
public class ArrayMethods3
{
	public static void main(String[] args)
	{
		int count=0;
		long startTime;
		long endTime;
		long totalTime;
		long sumTime=0;
		long avgTime;
		while(count<20)
		{
			int[] testTime= {5,6,3,2,8,7,4,6,3,1,4,3,0,9};
			startTime=System.nanoTime();
			bubbleSort(testTime);
			endTime=System.nanoTime();
			totalTime=endTime-startTime;
			sumTime+=totalTime;
			count++;
		}
		avgTime=sumTime/20;
		System.out.println("Average time taken by bubble sort: "+avgTime);
		sumTime=0;
		count=0;
		while(count<20)
		{
			int[] testTime= {5,6,3,2,8,7,4,6,3,1,4,3,0,9};
			startTime=System.nanoTime();
			selectionSort(testTime);
			endTime=System.nanoTime();
			totalTime=endTime-startTime;
			sumTime+=totalTime;
			count++;
		}
		avgTime=sumTime/20;
		System.out.println("Average time taken by selection sort: "+avgTime);
		sumTime=0;
		count=0;
		while(count<20)
		{
			int[] testTime= {5,6,3,2,8,7,4,6,3,1,4,3,0,9};
			startTime=System.nanoTime();
			insertionSort(testTime);
			endTime=System.nanoTime();
			totalTime=endTime-startTime;
			sumTime+=totalTime;
			count++;
		}
		avgTime=sumTime/20;
		System.out.println("Average time taken by insertion sort: "+avgTime);
	}
	public static void insertionSort(int[] list1)
	{
		int tracker;
		for(int x=1;x<list1.length;x++)
		{
			tracker=x;
			while(tracker>0&&list1[tracker]<list1[tracker-1])
			{
				swap(list1,tracker,tracker-1);
				tracker--;
			}
		}
	}
	public static void selectionSort(double[] list1)
	{
		int lowestNumPos;
		double lowestNum;
		for(int x=0;x<list1.length-1;x++)
		{
			lowestNumPos=x;
			lowestNum=list1[x];
			for(int y=x+1;y<list1.length;y++)
			{
				if(list1[y]<lowestNum)
				{
					lowestNumPos=y;
					lowestNum=list1[y];
				}
			}
			if(lowestNumPos>x)
			{
				swap(list1,x,lowestNumPos);
			}
		}
	}
	public static void selectionSort(int[] list1)
	{
		int lowestNumPos;
		int lowestNum;
		for(int x=0;x<list1.length-1;x++)
		{
			lowestNumPos=x;
			lowestNum=list1[x];
			for(int y=x+1;y<list1.length;y++)
			{
				if(list1[y]<lowestNum)
				{
					lowestNumPos=y;
					lowestNum=list1[y];
				}
			}
			if(lowestNumPos>x)
			{
				swap(list1,x,lowestNumPos);
			}
		}
	}
	public static void bubbleSort(String[] list1)
	{
		boolean sorted=false;
		boolean swapped=false;
		while(!sorted)
		{
			for(int x=0;x<list1.length-1;x++)
			{
				if(list1[x].compareTo(list1[x+1])>0)
				{
					swap(list1,x,x+1);
					swapped=true;
				}
			}
			if(!swapped)
			{
				sorted=true;
			}
			else
			{
				swapped=false;
			}
		}
	}
	public static void bubbleSort(int[] list1)
	{
		boolean sorted=false;
		boolean swapped=false;
		while(!sorted)
		{
			for(int x=0;x<list1.length-1;x++)
			{
				if(list1[x]>list1[x+1])
				{
					swap(list1,x,x+1);
					swapped=true;
				}
			}
			if(!swapped)
			{
				sorted=true;
			}
			else
			{
				swapped=false;
			}
		}
	}
	public static void swap(int arr[],int i, int j)
	{
		int x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}
	public static void swap(String arr[],int i, int j)
	{
		String x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}
	public static void swap(double arr[],int i, int j)
	{
		double x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}
	private static void printArr(String[] list)
	{
		for(String h:list)
		{
			System.out.print("["+h+"] ");
		}
		System.out.println();
	}
	private static void printArr(int[] list)
	{
		for(int h:list)
		{
			System.out.print("["+h+"] ");
		}
		System.out.println();
	}
	private static void printArr(double[] list)
	{
		for(double h:list)
		{
			System.out.print("["+h+"] ");
		}
		System.out.println();
	}
}