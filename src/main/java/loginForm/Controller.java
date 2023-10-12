package loginForm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button btn_Login;
    @FXML
    private Button btn_CreateUserID;
    @FXML
    private TextField tf_UserID;
    @FXML
    private TextField tf_Password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn_Login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.logInUser(actionEvent, tf_UserID.getText(), tf_Password.getText());
            }
        });
        btn_CreateUserID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.changeScene(actionEvent, "sign-up.fxml", "Sign Up!", null);
            }
        });
    }
}