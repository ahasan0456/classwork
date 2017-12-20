import java.io.File;
import java.util.List;
public class Runner
{
	public static void main(String[] args)
	{
		File database=new File("Sidewalk_Caf__Licenses_and_Applications.csv");
		CSVUtilities data=new CSVUtilities(database);
		List<String> headers=data.getColumnHeaders();
		List<String> companies=data.getData(0);
		System.out.println(headers.get(0));
		for(String s:companies)
		{
			System.out.println(s);
		}
	}
}