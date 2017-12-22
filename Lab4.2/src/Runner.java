import java.io.File;
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
*	Last Updated: 12-21-2017
*	Description: Lab 4.2 - Runner to read a csv file.
*/
public class Runner extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	public void start(Stage stage)
	{
		File dataset=new File("New_York_City_Population_by_Borough__1950_-_2040.csv");
		CSVUtilities data=new CSVUtilities(dataset);
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
        nyc.getData().add(new XYChart.Data("1950", Integer.parseInt(data.getData(firstCol).get(0))));
        nyc.getData().add(new XYChart.Data("1960", Integer.parseInt(data.getData(firstCol+2).get(0))));
        nyc.getData().add(new XYChart.Data("1970", Integer.parseInt(data.getData(firstCol+4).get(0))));
        nyc.getData().add(new XYChart.Data("1980", Integer.parseInt(data.getData(firstCol+6).get(0))));
        nyc.getData().add(new XYChart.Data("1990", Integer.parseInt(data.getData(firstCol+8).get(0))));
        nyc.getData().add(new XYChart.Data("2000", Integer.parseInt(data.getData(firstCol+10).get(0))));
        Series<String, Number> bronx = new XYChart.Series();
        bronx.setName("Bronx");
        bronx.getData().add(new XYChart.Data("1950", Integer.parseInt(data.getData(firstCol).get(1))));
        bronx.getData().add(new XYChart.Data("1960", Integer.parseInt(data.getData(firstCol+2).get(1))));
        bronx.getData().add(new XYChart.Data("1970", Integer.parseInt(data.getData(firstCol+4).get(1))));
        bronx.getData().add(new XYChart.Data("1980", Integer.parseInt(data.getData(firstCol+6).get(1))));
        bronx.getData().add(new XYChart.Data("1990", Integer.parseInt(data.getData(firstCol+8).get(1))));
        bronx.getData().add(new XYChart.Data("2000", Integer.parseInt(data.getData(firstCol+10).get(1))));
        Series<String, Number> brooklyn = new XYChart.Series();
        brooklyn.setName("Brooklyn");
        brooklyn.getData().add(new XYChart.Data("1950", Integer.parseInt(data.getData(firstCol).get(2))));
        brooklyn.getData().add(new XYChart.Data("1960", Integer.parseInt(data.getData(firstCol+2).get(2))));
        brooklyn.getData().add(new XYChart.Data("1970", Integer.parseInt(data.getData(firstCol+4).get(2))));
        brooklyn.getData().add(new XYChart.Data("1980", Integer.parseInt(data.getData(firstCol+6).get(2))));
        brooklyn.getData().add(new XYChart.Data("1990", Integer.parseInt(data.getData(firstCol+8).get(2))));
        brooklyn.getData().add(new XYChart.Data("2000", Integer.parseInt(data.getData(firstCol+10).get(2))));
        Series<String, Number> manhattan = new XYChart.Series();
        manhattan.setName("Manhattan");
        manhattan.getData().add(new XYChart.Data("1950", Integer.parseInt(data.getData(firstCol).get(3))));
        manhattan.getData().add(new XYChart.Data("1960", Integer.parseInt(data.getData(firstCol+2).get(3))));
        manhattan.getData().add(new XYChart.Data("1970", Integer.parseInt(data.getData(firstCol+4).get(3))));
        manhattan.getData().add(new XYChart.Data("1980", Integer.parseInt(data.getData(firstCol+6).get(3))));
        manhattan.getData().add(new XYChart.Data("1990", Integer.parseInt(data.getData(firstCol+8).get(3))));
        manhattan.getData().add(new XYChart.Data("2000", Integer.parseInt(data.getData(firstCol+10).get(3))));
        Series<String, Number> queens = new XYChart.Series();
        queens.setName("Queens");
        queens.getData().add(new XYChart.Data("1950", Integer.parseInt(data.getData(firstCol).get(4))));
        queens.getData().add(new XYChart.Data("1960", Integer.parseInt(data.getData(firstCol+2).get(4))));
        queens.getData().add(new XYChart.Data("1970", Integer.parseInt(data.getData(firstCol+4).get(4))));
        queens.getData().add(new XYChart.Data("1980", Integer.parseInt(data.getData(firstCol+6).get(4))));
        queens.getData().add(new XYChart.Data("1990", Integer.parseInt(data.getData(firstCol+8).get(4))));
        queens.getData().add(new XYChart.Data("2000", Integer.parseInt(data.getData(firstCol+10).get(4))));
        Series<String, Number> statenIsland = new XYChart.Series();
        statenIsland.setName("Staten Island");
        statenIsland.getData().add(new XYChart.Data("1950", Integer.parseInt(data.getData(firstCol).get(5))));
        statenIsland.getData().add(new XYChart.Data("1960", Integer.parseInt(data.getData(firstCol+2).get(5))));
        statenIsland.getData().add(new XYChart.Data("1970", Integer.parseInt(data.getData(firstCol+4).get(5))));
        statenIsland.getData().add(new XYChart.Data("1980", Integer.parseInt(data.getData(firstCol+6).get(5))));
        statenIsland.getData().add(new XYChart.Data("1990", Integer.parseInt(data.getData(firstCol+8).get(5))));
        statenIsland.getData().add(new XYChart.Data("2000", Integer.parseInt(data.getData(firstCol+10).get(5))));
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