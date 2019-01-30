package security.home;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;

public class HomeScreenControlla {

    @FXML
    private AnchorPane homePane;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField pword;

    @FXML
    private JFXButton loginBtn;

    @FXML
    private Hyperlink forgotPw;

    @FXML
    private JFXButton newEmp;

    @FXML
    void handleButtonAction(ActionEvent event) {

    }

}
