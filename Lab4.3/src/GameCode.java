import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Timer;
import java.util.TimerTask;
/*
*	Author: Amir Hasan
*	Last Updated: 1-7-18
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
		ArrayList<String> combination=new ArrayList<String>();
		ArrayList<String> userInput=new ArrayList<String>();
		addOne(combination);
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
		red.setOnAction(e ->
		{
			userInput.add("Red");
			if(!checkPress(combination, userInput))
			{
				red.setDisable(true);
				green.setDisable(true);
				blue.setDisable(true);
				yellow.setDisable(true);
				int finalScore=combination.size()-1;
				BackEnd.addScore("scores.csv", finalScore);
				String scoreList="Scores\n";
				ArrayList<Integer> scoreData=BackEnd.getScores("scores.csv");
				for(int x=0;x<10;x++)
				{
					if(x<scoreData.size())
					{
						scoreList+=scoreData.get(x).toString()+"\n";
					}
				}
				Label highScores=new Label(scoreList);
				VBox nspace=new VBox(highScores);
				Scene scene2=new Scene(nspace,300,300);
				stage.setScene(scene2);
				System.out.println(scoreList);
				stage.show();
			}
			else if(combination.size()==userInput.size())
			{
				red.setDisable(true);
				green.setDisable(true);
				blue.setDisable(true);
				yellow.setDisable(true);
				int score=Integer.parseInt(scoreDisp.getText().substring(7,scoreDisp.getText().length()));
				score++;
				scoreDisp.setText("Score: "+score);
				addOne(combination);
				for(int i=0;i<combination.size();i++)
				{
					System.out.println(combination.get(i));
					if(combination.get(i).equals("Red"))
					{
						red.setStyle("-fx-background-color: red;");
					}
					else if(combination.get(i).equals("Green"))
					{
						green.setStyle("-fx-background-color: green;");
					}
					else if(combination.get(i).equals("Blue"))
					{
						blue.setStyle("-fx-background-color: blue;");
					}
					else
					{
						yellow.setStyle("-fx-background-color: yellow;");
					}
					red.setStyle("-fx-background-color: lightgray;");
					blue.setStyle("-fx-background-color: lightgray;");
					green.setStyle("-fx-background-color: lightgray;");
					yellow.setStyle("-fx-background-color: lightgray;");
				}
				userInput.clear();
				red.setDisable(false);
				green.setDisable(false);
				blue.setDisable(false);
				yellow.setDisable(false);
			}
		});
		green.setOnAction(e ->
		{
			userInput.add("Green");
			if(!checkPress(combination, userInput))
			{
				red.setDisable(true);
				green.setDisable(true);
				blue.setDisable(true);
				yellow.setDisable(true);
				int finalScore=combination.size()-1;
				BackEnd.addScore("scores.csv", finalScore);
				String scoreList="Scores\n";
				ArrayList<Integer> scoreData=BackEnd.getScores("scores.csv");
				for(int x=0;x<10;x++)
				{
					if(x<scoreData.size())
					{
						scoreList+=scoreData.get(x).toString()+"\n";
					}
				}
				Label highScores=new Label(scoreList);
				VBox nspace=new VBox(highScores);
				Scene scene2=new Scene(nspace,300,300);
				stage.setScene(scene2);
				System.out.println(scoreList);
				stage.show();
			}
			else if(combination.size()==userInput.size())
			{
				red.setDisable(true);
				green.setDisable(true);
				blue.setDisable(true);
				yellow.setDisable(true);
				int score=Integer.parseInt(scoreDisp.getText().substring(7,scoreDisp.getText().length()));
				score++;
				scoreDisp.setText("Score: "+score);
				addOne(combination);
				for(int i=0;i<combination.size();i++)
				{
					System.out.println(combination.get(i));
					if(combination.get(i).equals("Red"))
					{
						red.setStyle("-fx-background-color: red;");
					}
					else if(combination.get(i).equals("Green"))
					{
						green.setStyle("-fx-background-color: green;");
					}
					else if(combination.get(i).equals("Blue"))
					{
						blue.setStyle("-fx-background-color: blue;");
					}
					else
					{
						yellow.setStyle("-fx-background-color: yellow;");
					}
					red.setStyle("-fx-background-color: lightgray;");
					blue.setStyle("-fx-background-color: lightgray;");
					green.setStyle("-fx-background-color: lightgray;");
					yellow.setStyle("-fx-background-color: lightgray;");
				}
				userInput.clear();
				red.setDisable(false);
				green.setDisable(false);
				blue.setDisable(false);
				yellow.setDisable(false);
			}
		});
		blue.setOnAction(e ->
		{
			userInput.add("Blue");
			if(!checkPress(combination, userInput))
			{
				red.setDisable(true);
				green.setDisable(true);
				blue.setDisable(true);
				yellow.setDisable(true);
				int finalScore=combination.size()-1;
				BackEnd.addScore("scores.csv", finalScore);
				String scoreList="Scores\n";
				ArrayList<Integer> scoreData=BackEnd.getScores("scores.csv");
				for(int x=0;x<10;x++)
				{
					if(x<scoreData.size())
					{
						scoreList+=scoreData.get(x).toString()+"\n";
					}
				}
				Label highScores=new Label(scoreList);
				VBox nspace=new VBox(highScores);
				Scene scene2=new Scene(nspace,300,300);
				stage.setScene(scene2);
				System.out.println(scoreList);
				stage.show();
			}
			else if(combination.size()==userInput.size())
			{
				red.setDisable(true);
				green.setDisable(true);
				blue.setDisable(true);
				yellow.setDisable(true);
				int score=Integer.parseInt(scoreDisp.getText().substring(7,scoreDisp.getText().length()));
				score++;
				scoreDisp.setText("Score: "+score);
				addOne(combination);
				for(int i=0;i<combination.size();i++)
				{
					System.out.println(combination.get(i));
					if(combination.get(i).equals("Red"))
					{
						red.setStyle("-fx-background-color: red;");
					}
					else if(combination.get(i).equals("Green"))
					{
						green.setStyle("-fx-background-color: green;");
					}
					else if(combination.get(i).equals("Blue"))
					{
						blue.setStyle("-fx-background-color: blue;");
					}
					else
					{
						yellow.setStyle("-fx-background-color: yellow;");
					}
					red.setStyle("-fx-background-color: lightgray;");
					blue.setStyle("-fx-background-color: lightgray;");
					green.setStyle("-fx-background-color: lightgray;");
					yellow.setStyle("-fx-background-color: lightgray;");
				}
				userInput.clear();
				red.setDisable(false);
				green.setDisable(false);
				blue.setDisable(false);
				yellow.setDisable(false);
			}
		});
		yellow.setOnAction(e ->
		{
			userInput.add("Yellow");
			if(!checkPress(combination, userInput))
			{
				red.setDisable(true);
				green.setDisable(true);
				blue.setDisable(true);
				yellow.setDisable(true);
				int finalScore=combination.size()-1;
				BackEnd.addScore("scores.csv", finalScore);
				String scoreList="Scores\n";
				ArrayList<Integer> scoreData=BackEnd.getScores("scores.csv");
				for(int x=0;x<10;x++)
				{
					if(x<scoreData.size())
					{
						scoreList+=scoreData.get(x).toString()+"\n";
					}
				}
				Label highScores=new Label(scoreList);
				VBox nspace=new VBox(highScores);
				Scene scene2=new Scene(nspace,300,300);
				stage.setScene(scene2);
				System.out.println(scoreList);
				stage.show();
			}
			else if(combination.size()==userInput.size())
			{
				red.setDisable(true);
				green.setDisable(true);
				blue.setDisable(true);
				yellow.setDisable(true);
				int score=Integer.parseInt(scoreDisp.getText().substring(7,scoreDisp.getText().length()));
				score++;
				scoreDisp.setText("Score: "+score);
				addOne(combination);
				for(int i=0;i<combination.size();i++)
				{
					System.out.println(combination.get(i));
					if(combination.get(i).equals("Red"))
					{
						red.setStyle("-fx-background-color: red;");
					}
					else if(combination.get(i).equals("Green"))
					{
						green.setStyle("-fx-background-color: green;");
					}
					else if(combination.get(i).equals("Blue"))
					{
						blue.setStyle("-fx-background-color: blue;");
					}
					else
					{
						yellow.setStyle("-fx-background-color: yellow;");
					}
					red.setStyle("-fx-background-color: lightgray;");
					blue.setStyle("-fx-background-color: lightgray;");
					green.setStyle("-fx-background-color: lightgray;");
					yellow.setStyle("-fx-background-color: lightgray;");
				}
				userInput.clear();
				red.setDisable(false);
				green.setDisable(false);
				blue.setDisable(false);
				yellow.setDisable(false);
			}
		});
		VBox space=new VBox(100,buttons,scoreDisp);
		Scene scene=new Scene(space,300,300);
		stage.setScene(scene);
		stage.show();
		red.setDisable(true);
		green.setDisable(true);
		blue.setDisable(true);
		yellow.setDisable(true);
		if(combination.get(0).equals("Red"))
		{
			red.setStyle("-fx-background-color: red;");
		}
		else if(combination.get(0).equals("Green"))
		{
			green.setStyle("-fx-background-color: green;");
		}
		else if(combination.get(0).equals("Blue"))
		{
			blue.setStyle("-fx-background-color: blue;");
		}
		else
		{
			yellow.setStyle("-fx-background-color: yellow;");
		}
		new Timer().schedule
		(
			new TimerTask()
			{
				public void run()
				{
					red.setStyle("-fx-background-color: lightgray;");
					blue.setStyle("-fx-background-color: lightgray;");
					green.setStyle("-fx-background-color: lightgray;");
					yellow.setStyle("-fx-background-color: lightgray;");
					red.setDisable(false);
					green.setDisable(false);
					blue.setDisable(false);
					yellow.setDisable(false);
		        }
			},500
		);
	}
	public static boolean checkPress(ArrayList<String> correct, ArrayList<String> user)
	{
		if(user.get(user.size()-1).equals(correct.get(user.size()-1)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void addOne(ArrayList<String> combination)
	{
		int colorPick=getRandomInteger(1,4);
		String add;
		if(colorPick==1)
		{
			add="Red";
		}
		else if(colorPick==2)
		{
			add="Blue";
		}
		else if(colorPick==3)
		{
			add="Green";
		}
		else
		{
			add="Yellow";
		}
		combination.add(add);
	}
	private static int getRandomInteger(int low, int high)
	{
		if(low>high)
		{
			int swap=low;
			low=high;
			high=swap;
		}
		return (int)(Math.random()*(high-(low-1))+low);
	}
}