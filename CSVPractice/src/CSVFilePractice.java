import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.nio.charset.StandardCharsets;
public class CSVFilePractice
{
	public static void main(String[] args)
	{
		String file="Book1.csv";
		List<Integer> nums=readCSV(file);
		for(Integer x:nums)
		{
			System.out.println(x);
		}
	}
	public static List<Integer> readCSV(String file)
	{
		List<Integer> nums = new ArrayList<>();
		Path pathToFile = Paths.get(file);
		try(BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII))
		{
			String line=br.readLine();
			while(line!=null)
			{
				String[] ints = line.split(",");
				for(String s:ints)
				{
					nums.add(Integer.parseInt(s));
				}
				line=br.readLine();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return nums;
	}
}