package loginForm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInController implements Initializable {
    @FXML
    private Button btn_Signout;
    @FXML
    private Label label_Welcome;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn_Signout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.changeScene(actionEvent, "com.example.loginform.fxml", "Log in!", null);
            }
        });
    }

    public void setUserInformation(String username) {
        label_Welcome.setText("Welcome " + username + "!");
    }
}
