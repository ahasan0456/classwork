/*
*	Author: Amir Hasan
*	Last Updated: 12-14-2017
*	Description: Lab 4.1 Card
*/
public class Card
{
	private String rank;
	private String suit;
	private int pointValue;
	public Card(String rank,String suit,int pointValue)
	{
		this.rank=rank;
		this.suit=suit;
		this.pointValue=pointValue;
	}
	public String rank()
	{
		return this.rank;
	}
	public String suit()
	{
		return this.suit;
	}
	public int pointValue()
	{
		return this.pointValue;
	}
	public boolean equals(Card otherCard)
	{
		if(this.pointValue()==otherCard.pointValue())
		{
			return true;
		}
		return false;
	}
	public String toString()
	{
		return this.pointValue()+" of "+this.suit();
	}
}