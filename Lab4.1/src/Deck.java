import java.util.ArrayList;
/*
*	Author: Amir Hasan
*	Last Updated: 12-14-2017
*	Description: Lab 4.1 Deck
*/
public class Deck
{
	private ArrayList<Card> undealt;
	private ArrayList<Card> dealt;
	public Deck(String[] ranks,String[] suits,int[] pointValues)
	{
		this.undealt=new ArrayList<Card>();
		this.dealt=new ArrayList<Card>(0);
		for(int x=0;x<ranks.length;x++)
		{
			for(int y=0;y<suits.length;y++)
			{
				for(int z=0;z<pointValues.length;z++)
				{
					this.undealt.add(new Card(ranks[x],suits[y],pointValues[z]));
				}
			}
		}
	}
	public boolean isEmpty()
	{
		if(this.undealt.size()>0)
		{
			return false;
		}
		return true;
	}
	public int size()
	{
		return this.undealt.size();
	}
	public Card deal()
	{
		if(this.isEmpty())
		{
			return null;
		}
		else
		{
			Card dealing=this.undealt.get(0);
			this.undealt.remove(0);
			this.dealt.add(dealing);
			return dealing;
		}
	}
	public void shuffle()
	{
		for(int place=this.undealt.size()-1;place>0;place--)
		{
			int swapIndx=getRandomInteger(0,place);
			swap(this.undealt,swapIndx,place);
		}
	}
	public static void swap(ArrayList<Card> list,int indx1, int indx2)
	{
		Card placeholder=list.get(indx1);
		list.set(indx1, list.get(indx2));
		list.set(indx2, placeholder);
	}
	public static int getRandomInteger(int low, int high)
	{
		if(low>high)
		{
			int swap=low;
			low=high;
			high=swap;
		}
		return (int)(Math.random()*(high-(low-1))+low);
	}
}