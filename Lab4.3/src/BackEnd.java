import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
/*
*	Author: Amir Hasan
*	Last Updated: 1-7-18
*	Description: Lab 4.3
*/
public class BackEnd
{
	public static ArrayList<String> CSVtoList(String filestr)
	{
		File csv=new File(filestr);
		ArrayList<String> CSVData=new ArrayList<String>();
		Path pathToFile = Paths.get(csv.getPath());
		try(BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII))
		{
			String line=br.readLine();
			while(line!=null)
			{
				CSVData.add(line);
				line=br.readLine();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return CSVData;
	}
	public static void addScore(String filestr, int score)
	{
		File csv=new File(filestr);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true)))
		{
			bw.append("\n"+score);
			bw.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public static ArrayList<Integer> getScores(String filestr)
	{
		ArrayList<String> data=CSVtoList("scores.csv");
		ArrayList<Integer> scoreList=new ArrayList<Integer>(data.size()-1);
		for(int i=0;i<scoreList.size();i++)
		{
			scoreList.set(i, Integer.parseInt(data.get(i+1)));
			System.out.println(scoreList.get(i));
		}
		Collections.sort(scoreList);
		return scoreList;
	}
}