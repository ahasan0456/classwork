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
		List<HighScore> scores=readCSV(file);
		for(HighScore x:scores)
		{
			System.out.println(x);
		}
	}
	public static List<HighScore> readCSV(String file)
	{
		List<HighScore> scores = new ArrayList<>();
		Path pathToFile = Paths.get(file);
		try(BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII))
		{
			String line=br.readLine();
			while(line!=null)
			{
				String[] score = line.split(",");
				String name=score[0];
				int num=Integer.parseInt(score[1]);
				HighScore hs=new HighScore(name,num);
				scores.add(hs);
				line=br.readLine();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return scores;
	}
}