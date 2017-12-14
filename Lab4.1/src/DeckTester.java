/*
*	Author: Amir Hasan
*	Last Updated: 12-14-2017
*	Description: Lab 4.1 DeckTester
*/
public class DeckTester
{
	public static void main(String[] args)
	{
		String[] ranks= {"A"};
		String[] suits= {"Spades","Hearts","Clubs","Diamonds"};
		int[] pointValues= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck myDeck=new Deck(ranks,suits,pointValues);
		myDeck.shuffle();
		printDeck(myDeck);
		System.out.print(myDeck.size());
	}
	public static void printDeck(Deck deck)
	{
		int deckSize=deck.size();
		for(int x=0;x<deckSize;x++)
		{
			System.out.print("["+deck.deal().toString()+"] ");
		}
		System.out.println();
	}
}