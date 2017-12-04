public class SortManiaTemp
{
	public static void main(String[] args)
	{
		String[] strings= {"Burger","Zebra","Tiger","Hangar","Purple","Apple"};
		System.out.println(insertionSort(strings,"NKJJHUJNL"));
	}
	public static int insertionSort(String[] list1,String find)
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
			return (list[list.length/2]+list[(list.length/2)-1])/2;
		}
		else
		{
			return list[list.length/2];
		}
	}
}