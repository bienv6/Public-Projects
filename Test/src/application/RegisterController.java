package application;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class RegisterController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField userid;

    @FXML
    private JFXPasswordField pword;

    @FXML
    private JFXButton login_btn;

    @FXML
    private Hyperlink forgot_pw;

    @FXML
    private Label exit_btn;

    @FXML
    void exitProgram(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert userid != null : "fx:id=\"userid\" was not injected: check your FXML file 'Reg2.fxml'.";
        assert pword != null : "fx:id=\"pword\" was not injected: check your FXML file 'Reg2.fxml'.";
        assert login_btn != null : "fx:id=\"login_btn\" was not injected: check your FXML file 'Reg2.fxml'.";
        assert forgot_pw != null : "fx:id=\"forgot_pw\" was not injected: check your FXML file 'Reg2.fxml'.";
        assert exit_btn != null : "fx:id=\"exit_btn\" was not injected: check your FXML file 'Reg2.fxml'.";

    }
}
