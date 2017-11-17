public class HorseBarn
{
	private Horse[] spaces;
	public HorseBarn(Horse[] spaces)
	{
		this.spaces=spaces;
	}
	public int findHorseSpace(String name)
	{
		for(int x=0;x<spaces.length;x++)
		{
			if(spaces[x]!=null)
			{
				if(name.equals(spaces[x].getName()))
				{
					return x;
				}
			}
		}
		return -1;
	}
	public void consolidate()
	{
		int horseCount=0;
		for(int x=0;x<spaces.length;x++)
		{
			if(spaces[x]!=null)
			{
				horseCount++;
			}
		}
		for(int y=0;y<horseCount;y++)
		{
			for(int z=y+1;z<spaces.length;z++)
			{
				if(spaces[z]!=null&&spaces[y]==null)
				{
					spaces[y]=spaces[z];
					spaces[z]=null;
				}
			}
		}
	}
	public String toString()
	{
		String listString="";
		for(int x=0;x<spaces.length;x++)
		{
			if(spaces[x]==null)
			{
				listString+="[null] ";
			}
			else
			{
				listString+="["+spaces[x].getName()+"] ";
			}
		}
		return listString;
	}
}