/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package patient;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.jar.Attributes.Name;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class TestAndChargesController implements Initializable {

    @FXML
    private ComboBox<String> testNameComboBox;
    @FXML
    private TextField nameFxId;
    @FXML
    private TextField phoneNumberFxId;
    @FXML
    private TextArea testDetailsFxId;
    @FXML
    private TextField emailFxId;
    @FXML
    private DatePicker datePickerFxId;
    
    Alert seccess = new Alert(Alert.AlertType.CONFIRMATION, "Successfully Complete Appoinment Request" );
    Alert error = new Alert(Alert.AlertType.ERROR, "Please Complete all the field properly" );
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> testName = FXCollections.observableArrayList("T1","T2","T3","T4");
        testNameComboBox.setItems(testName);
        
        nameFxId.getText();
        phoneNumberFxId.getText();
        emailFxId.getText();
        datePickerFxId.getValue();       
        
    }    

    @FXML
    private void submitButtonMouseOnClick(ActionEvent event) {
       String phoneNumber = phoneNumberFxId.getText();
   if(testNameComboBox.getValue() != null && 
      !nameFxId.getText().isEmpty() && 
      !phoneNumber.isEmpty() &&
      containsOnlyDigits(phoneNumber) &&
      phoneNumber.length() == 11 &&
      !emailFxId.getText().isEmpty() && 
      datePickerFxId.getValue() != null) {
        seccess.show();
    } else {
        error.show();
   }
    }
    
    private boolean containsOnlyDigits(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        return pattern.matcher(str).matches();
    }

    @FXML
    private void testNameComboBoxOnActiobn(ActionEvent event) {
        switch(testNameComboBox.getValue()){
            case "T1":
                testDetailsFxId.setText("Test Name: T1 \nTest Price: 2500 BDT");
                break;
                
            case "T2":
                testDetailsFxId.setText("Test Name: T2 \nTest Price: 2500 BDT");
                break;
            
            case "T3":
                testDetailsFxId.setText("Test Name: T3 \nTest Price: 2500 BDT");
                break;
            
            case "T4":
                testDetailsFxId.setText("Test Name: T4 \nTest Price: 2500 BDT");
                break;
            default:
                testDetailsFxId.setText("Please Select a test");
                
        }        
    }
    
}