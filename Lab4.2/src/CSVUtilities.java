import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/*
*	Author: Amir Hasan
*	Last Updated: 12-19-2017
*	Description: Lab 4.2 - Utilities for reading a csv file.
*/
public class CSVUtilities
{
	ArrayList<String> CSVData;
	//Constructor accepts a File and reads all the data into CSVData
	public CSVUtilities(File csv)
	{
		this.CSVData=new ArrayList<>();
		Path pathToFile = Paths.get(csv.getPath());
		try(BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII))
		{
			String line=br.readLine();
			while(line!=null)
			{
				this.CSVData.add(line);
				line=br.readLine();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	//Return an ArrayList with the headers for each column
	public List<String> getColumnHeaders()
	{
		List<String> headers=new ArrayList<>();
		String[] header=this.CSVData.get(0).split(",");
		for(int i=0;i<header.length;i++)
		{
			headers.add(header[i]);
		}
		return headers;
	}
	//Return an ArrayList with the data for a column specified
	public List<String> getData(int column)
	{
		List<String> columnData=new ArrayList<>();
		for(int x=1;x<this.CSVData.size();x++)
		{
			String[] rowData=this.CSVData.get(x).split(",");
			columnData.add(rowData[column]);
		}
		return columnData;
	}
	//Return an ArrayList with the data converted to Integer
	public List<Integer> getDataInt(int column)
	{
		List<Integer> columnData=new ArrayList<>();
		for(int x=1;x<this.CSVData.size();x++)
		{
			String[] rowData=this.CSVData.get(x).split(",");
			columnData.add(Integer.parseInt(rowData[column]));
		}
		return columnData;
	}

	//Return an ArrayList with the data converted to Double
	public List<Double> getDataDbl(int column)
	{
		List<Double> columnData=new ArrayList<>();
		for(int x=1;x<this.CSVData.size();x++)
		{
			String[] rowData=this.CSVData.get(x).split(",");
			columnData.add(Double.parseDouble(rowData[column]));
		}
		return columnData;
	}
}