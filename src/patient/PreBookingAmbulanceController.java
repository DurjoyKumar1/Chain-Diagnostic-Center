package patient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class PreBookingAmbulanceController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField phoneNumbeTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private DatePicker dateTextField;
    @FXML
    private TextField timeTextField;
    @FXML
    private TextArea addressFxId;

    Alert successAlert = new Alert(Alert.AlertType.CONFIRMATION, "Successfully Complete your Ambulance Request");
    Alert errorAlert = new Alert(Alert.AlertType.ERROR, "Please Fill Up all the fields properly");

    private ArrayList<AmbReqDetails> ambReqList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ambReqList = new ArrayList<>();
    }

    @FXML
    private void submitButtonMouseOnClick(ActionEvent event) throws IOException {
        String name = nameTextField.getText();
        String phoneNumber = phoneNumbeTextField.getText();
        String email = emailTextField.getText();
        LocalDate date = dateTextField.getValue();
        Float time = Float.parseFloat(timeTextField.getText());
        String address = addressFxId.getText();
        
        if (isValidFormData(name, phoneNumber, email, date, address, time)) {
            AmbReqDetails ambReqDetail = new AmbReqDetails(name, phoneNumber, address, email, time, date);
            ambReqList.add(ambReqDetail);
            showAmbulanceBookingRequest(event);
            successAlert.show();
            
            
            try (FileWriter fw = new FileWriter("amulanceDetails.text",true)) {
            fw.write("Name: " + name + "\n");
            fw.write("Phone Number: " + phoneNumber + "\n");
            fw.write("Address: " + address + "\n");
            fw.write("Email: " + email + "\n");
            fw.write("Time: " + time + "\n");
            fw.write("Date: " + date.toString() + "\n");
        } catch (IOException ex) {
            Logger.getLogger(AmbReqDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
         else {
            errorAlert.show();
        }
    }

    private boolean isValidFormData(String name, String phoneNumber, String email, LocalDate date, String address, Float time) {
        return !name.isEmpty() && isValidPhoneNumber(phoneNumber) && !email.isEmpty() && date != null && !address.isEmpty() && time != null;
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        // Validate phone number: only digits and length 11
        return Pattern.matches("\\d+", phoneNumber) && phoneNumber.length() == 11;
    }

    private void showAmbulanceBookingRequest(ActionEvent event) throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("showAmbulanceBookingRequest.fxml"));
//        Parent parent = loader.load();
//        ShowAmbulanceBookingRequestController controller = loader.getController();
//        controller.setData(ambReqList);
//
//        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        Scene newScene = new Scene(parent);
//
//        currentStage.setScene(newScene);
//        currentStage.show();
    }

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Ambulance.fxml"));
        Scene newScene = new Scene(parent);

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(newScene);
        currentStage.show();
    }
}
