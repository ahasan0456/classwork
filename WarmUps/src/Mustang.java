public class Mustang implements Horse
{
	String name;
	int weight;
	public Mustang(String name, int weight)
	{
		this.name=name;
		this.weight=weight;
	}
	public String getName()
	{
		return name;
	}
	public int getWeight()
	{
		return weight;
	}
}