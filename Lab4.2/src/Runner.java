import java.io.File;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.stage.Stage;
import javafx.scene.chart.CategoryAxis;
/*
*	Author: Amir Hasan
*	Last Updated: 12-22-2017
*	Description: Lab 4.2 - Runner to read a csv file.
*/
public class Runner extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void start(Stage stage)
	{
		File dataset=new File("New_York_City_Population_by_Borough__1950_-_2040.csv");
		CSVUtilities data=new CSVUtilities(dataset);
		List<String> headers=data.getColumnHeaders();
		int firstCol=2;
		stage.setTitle("Population of NYC");
		final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Year");
        yAxis.setLabel("Population Count");
        final LineChart<String,Number> lineChart=new LineChart<String,Number>(xAxis,yAxis);
        lineChart.setTitle("Census Data for NYC Population");
        Series<String, Number> nyc = new XYChart.Series();
        nyc.setName("NYC");
        Series<String, Number> bronx = new XYChart.Series();
        bronx.setName("Bronx");
        Series<String, Number> brooklyn = new XYChart.Series();
        brooklyn.setName("Brooklyn");
        Series<String, Number> manhattan = new XYChart.Series();
        manhattan.setName("Manhattan");
        Series<String, Number> queens = new XYChart.Series();
        queens.setName("Queens");
        Series<String, Number> statenIsland = new XYChart.Series();
        statenIsland.setName("Staten Island");
        for(int x=0;x<12;x+=2)
        {
        	nyc.getData().add(new XYChart.Data(headers.get(firstCol+x), data.getDataInt(firstCol+x).get(0)));
        	bronx.getData().add(new XYChart.Data(headers.get(firstCol+x), data.getDataInt(firstCol+x).get(1)));
        	brooklyn.getData().add(new XYChart.Data(headers.get(firstCol+x), data.getDataInt(firstCol+x).get(2)));
        	manhattan.getData().add(new XYChart.Data(headers.get(firstCol+x), data.getDataInt(firstCol+x).get(3)));
        	queens.getData().add(new XYChart.Data(headers.get(firstCol+x), data.getDataInt(firstCol+x).get(4)));
        	statenIsland.getData().add(new XYChart.Data(headers.get(firstCol+x), data.getDataInt(firstCol+x).get(5)));
        }
        Scene scene=new Scene(lineChart,800,600);
        lineChart.getData().add(nyc);
        lineChart.getData().add(bronx);
        lineChart.getData().add(brooklyn);
        lineChart.getData().add(manhattan);
        lineChart.getData().add(queens);
        lineChart.getData().add(statenIsland);
        stage.setScene(scene);
        stage.show();
	}
}