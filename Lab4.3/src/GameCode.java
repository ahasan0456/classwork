import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
*	Author: Amir Hasan
*	Last Updated: 1-1-18
*	Description: Lab 4.3
*/
public class GameCode extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	public void start(Stage stage)
	{
		Button red=new Button("Red");
		red.setMinSize(60,60);
		red.setMaxSize(60,60);
		Button blue=new Button("Blue");
		blue.setMinSize(60,60);
		blue.setMaxSize(60,60);
		Button green=new Button("Green");
		green.setMinSize(60,60);
		green.setMaxSize(60,60);
		Button yellow=new Button("Yellow");
		yellow.setMinSize(60,60);
		yellow.setMaxSize(60,60);
		HBox buttons=new HBox(20,red,blue,green,yellow);
		Label scoreDisp=new Label("Score: 0");
		VBox space=new VBox(100,buttons,scoreDisp);
		Scene scene=new Scene(space,300,300);
		stage.setScene(scene);
		stage.show();
	}
}