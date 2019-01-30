package employee.view;

import java.io.IOException;

import employee.Main;
import javafx.fxml.FXML;

public class MainItemsController {
	
	private Main main;
	
	@FXML
	private void goToAcctDept() throws IOException {
		main.showAcctDept();
		
	}
	
	@FXML
	private void goToHrDept() throws IOException {
		main.showHrDept();
		
		
	}
	

}
