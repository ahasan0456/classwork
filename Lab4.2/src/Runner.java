import java.io.File;
import java.util.List;
/*
*	Author: Amir Hasan
*	Last Updated: 12-20-2017
*	Description: Lab 4.2 - Runner to read a csv file.
*/
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