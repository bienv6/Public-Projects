import javafx.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class javafx_lesson1 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btn1 = new Button("Push Me");
		StackPane root = new StackPane();
		root.getChildren().add(btn1);
		Scene scene = new Scene(root, 400,200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
