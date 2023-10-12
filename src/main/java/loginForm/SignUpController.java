package loginForm;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    @FXML
    private Button btn_SignIn;
    private Button btn_Continue;
    private Button btn_Cancel;
    private TextField tf_Firstname;
    private TextField tf_Lastname;
    private ChoiceBox cb_CountryRegion;
    private TextField tf_Birthday;
    private TextField tf_UserID;
    private TextField tf_Password;
    private TextField tf_ConfirmPassword;
    private ScrollBar sb_ScrollBar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
