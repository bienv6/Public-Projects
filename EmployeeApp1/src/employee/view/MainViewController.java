package employee.view;

import java.io.IOException;

import employee.Main;
import javafx.fxml.FXML;

public class MainViewController {

	@FXML
	private Main main;
	
	public void goHome() throws IOException {
		main.showMainItems();
		
	}
}
