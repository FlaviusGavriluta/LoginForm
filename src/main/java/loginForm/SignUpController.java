package loginForm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        btn_Continue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!tf_UserID.getText().trim().isEmpty()
                        && !tf_Password.getText().trim().isEmpty()
                        && !tf_ConfirmPassword.getText().trim().isEmpty()
                        && tf_Password.getText().equals(tf_ConfirmPassword.getText())) {
                    DBUtils.signUpUser(actionEvent,
                            tf_Firstname.getText(),
                            tf_Lastname.getText(),
                            convertToLocalDate(tf_Birthday.getText()),
                            cb_CountryRegion.getTypeSelector(),
                            tf_UserID.getText(),
                            tf_Password.getText());
                } else {
                    System.out.println("Please fill in all information");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please fill in all information to sign up!");
                }
            }
        });
        btn_SignIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.changeScene(actionEvent, "sample.fxml", "Log in!", null);
            }
        });
        btn_Cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.changeScene(actionEvent, "sample.fxml", "Log in!", null);
            }
        });
    }

    private Date convertToLocalDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(dateStr, formatter);
        return Date.valueOf(localDate);
    }
}
