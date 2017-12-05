public class SortManiaTemp
{
	public static void main(String[] args)
	{
		long startTime;
		long endTime;
		long totalTime;
		long avgTime;
		long sumTime=0;
		int count=0;
		while(count<10)
		{
			int[] sortish=mostlySorted();
			startTime=System.nanoTime();
			challengeThree(sortish);
			endTime=System.nanoTime();
			totalTime=endTime-startTime;
			System.out.println(totalTime);
			sumTime+=totalTime;
			count++;
		}
		avgTime=sumTime/10;
		System.out.println(avgTime);
	}
	public static int[] mostlySorted()
	{
		int[] sorted=new int[10000];
		for(int x=0;x<sorted.length;x++)
		{
			if(x<7500)
			{
				sorted[x]=x;
			}
			else
			{
				sorted[x]=getRandomInteger(7500,10000);
			}
		}
		return sorted;
	}
	private static int getRandomInteger(int low, int high)
	{
		if(low>high)
		{
			int swap=low;
			low=high;
			high=swap;
		}
		return (int)(Math.random()*(high-(low-1))+low);
	}
	//prints out the passed-in array of ints
	public static void printArr(int[] list)
	{
		for(int s:list)
		{
			System.out.print("["+s+"] ");
		}
	}
	//prints out the passed-in array of Strings
	public static void printArr(String[] list)
	{
		for(String s:list)
		{
			System.out.print("["+s+"] ");
		}
	}
	//insertion sort
	public static int challengeTwo(String[] list1,String find)
	{
		int tracker;
		int pos=-1;
		for(int x=1;x<list1.length;x++)
		{
			tracker=x;
			while(tracker>0&&list1[tracker].compareTo(list1[tracker-1])<0)
			{
				swap(list1,tracker,tracker-1);
				tracker--;
			}
		}
		for(int y=0;y<list1.length;y++)
		{
			if(list1[y].equals(find))
			{
				pos=y;
				return pos;
			}
		}
		return pos;
	}
	//swaps 2 strings in an array
	public static void swap(String arr[],int i, int j)
	{
		String x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}
	//given a sorted array, retrieves the median
	public static int getMedian(int[] list)
	{
		if(list.length%2==1)
		{
			return list[list.length/2];
		}
		else
		{
			return (list[list.length/2]+list[(list.length/2)-1])/2;
		}
	}
	//insertion sort
	/*public static int challengeFive(Object[] list)
	{
		int tracker;
		int pos=-1;
		for(int x=1;x<list.length;x++)
		{
			tracker=x;
			while(tracker>0&&list[tracker].compareTo(list[tracker-1])<0)
			{
				swap(list,tracker,tracker-1);
				tracker--;
			}
		}
		return pos;
	}*/
	//insertion sort
	public static int challengeThree(int[] list)
	{
		int tracker;
		for(int x=1;x<list.length;x++)
		{
			tracker=x;
			while(tracker>0&&list[tracker]<list[tracker-1])
			{
				swap(list,tracker,tracker-1);
				tracker--;
			}
		}
		return getMedian(list);
	}
	//swaps two objects in an array
	public static void swap(Object arr[],int i, int j)
	{
		Object x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}
	//swaps two ints in an array
	public static void swap(int arr[],int i, int j)
	{
		int x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}
	//insertion sort on each nested array and records the median, then takes the median of those medians after sorting them
	public static int challengeFour(int[][] list)
	{
		int[] meds=new int[list.length];
		for(int x=0;x<list.length;x++)
		{
			meds[x]=challengeThree(list[x]);
		}
		return challengeThree(meds);
	}
}