public class SortManiaTemp
{
	public static void main(String[] args)
	{
		String[] strings= {"Burger","Zebra","Tiger","Hangar","Purple","Apple"};
		System.out.println(challengeTwo(strings,"NKJJHUJNL"));
		int[] ints= {6,5,3,4,0,9};
		int[] intsTwo= {6,5,3,4,0};
		System.out.println(challengeThree(ints));
		System.out.println(challengeThree(intsTwo));
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
	public static double getMedian(int[] list)
	{
		if(list.length%2==1)
		{
			return (double)list[list.length/2];
		}
		else
		{
			return ((double)list[list.length/2]+(double)list[(list.length/2)-1])/2.0;
		}
	}
	//same function, with an array of doubles
	public static double getMedian(double[] list)
	{
		if(list.length%2==1)
		{
			return list[list.length/2];
		}
		else
		{
			return (list[list.length/2]+list[(list.length/2)-1])/2.0;
		}
	}
	//insertion sort
	public static int challengeFive(Object[] list)
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
	}
	//insertion sort
	public static double challengeThree(int[] list)
	{
		int tracker;
		for(int x=1;x<list.length;x++)
		{
			tracker=x;
			while(tracker>0&&list[tracker]>list[tracker-1])
			{
				swap(list,tracker,tracker-1);
				tracker--;
			}
		}
		return getMedian(list);
	}
	//insertionSort to be used in challengeFour on medians array
	public static double challengeThree(double[] list)
	{
		int tracker;
		for(int x=1;x<list.length;x++)
		{
			tracker=x;
			while(tracker>0&&list[tracker]>list[tracker-1])
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
	//swaps two doubles in an array
	public static void swap(double arr[],int i, int j)
	{
		double x=arr[i];
		arr[i]=arr[j];
		arr[j]=x;
	}
	//insertion sort on each nested array and records the median, then takes the median of those medians after sorting them
	public static double challengeFour(int[][] list)
	{
		double[] meds=new double[list.length];
		for(int x=0;x<list.length;x++)
		{
			meds[x]=challengeThree(list[x]);
		}
		return challengeThree(meds);
	}
}