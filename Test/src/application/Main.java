package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		
			
			
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("Reg2.fxml"));
			
			/* Button btn = new Button("Submit");
			
			btn.setOnAction(event ->
			
					System.out.println("Beam me up Scottie!"));
			 
			root.getChildren().add(btn);*/
			
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.print("the shit didnt work");
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
