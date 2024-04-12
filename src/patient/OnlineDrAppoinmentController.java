/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package patient;

import java.net.URL;
import static java.util.Locale.filter;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class OnlineDrAppoinmentController implements Initializable {

    @FXML
    private RadioButton newPatientRadioButton;
    @FXML
    private RadioButton oldPatientRadioButton;
    @FXML
    private ComboBox<String> departmentCombobox;
    @FXML
    private ComboBox<String> doctorCombobox;
    @FXML
    private TextField fullNameTextField;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private CheckBox agreeCheckBoxFxid;
    @FXML
    private TextArea infoTextArea;
    
    Alert seccess = new Alert(Alert.AlertType.CONFIRMATION, "Successfully Complete Appoinment Request" );
    Alert error = new Alert(Alert.AlertType.ERROR, "Please Complete all the field properly" );
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> department = FXCollections.observableArrayList("D1","D2","D3","D4");
        departmentCombobox.setItems(department);
        
        ToggleGroup tg = new ToggleGroup();
        newPatientRadioButton.setToggleGroup(tg);
        oldPatientRadioButton.setToggleGroup(tg);
        
    }    
     private boolean containsOnlyDigits(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        return pattern.matcher(str).matches();
    }
    
    
    @FXML
    private void submitButtonMouseOnClick(ActionEvent event) {
        String name = fullNameTextField.getText();
        String phoneNumber = phoneNumberTextField.getText(); 
        String email = emailTextField.getText();
        if (agreeCheckBoxFxid.isSelected()&& !name.isEmpty() && 
            !phoneNumber.isEmpty()&& containsOnlyDigits(phoneNumber) && phoneNumber.length()==11 
            && !email.isEmpty() && 
            (newPatientRadioButton.isSelected() || oldPatientRadioButton.isSelected())
            &&doctorCombobox.getValue() != null && departmentCombobox.getValue() != null){
        infoTextArea.setText("Patient Name: "+name+"\n"+"Phone Number: "+phoneNumber+"\n"+
                "Email: "+email+"\n"+
                "Department: "+departmentCombobox.getValue()+"\n" + "Doctor Name: " +doctorCombobox.getValue()
                
        
        );
        
        seccess.show();
        }else{
            error.show();
        }
    }

    @FXML
    private void departmentComboboxMouseOnClick(ActionEvent event) {
        
        
        switch( departmentCombobox.getValue()) {
            case "D1":
                ObservableList<String> doctorName = FXCollections.observableArrayList("D1","D2","D3","D4");
                doctorCombobox.setItems(doctorName);
                break;
            
            case "D2":
                ObservableList<String> doctorName1 = FXCollections.observableArrayList("D15","D25","D35","D45");
                doctorCombobox.setItems(doctorName1);
                break;
            
            case "D3":
                ObservableList<String> doctorName3 = FXCollections.observableArrayList("D13","D23","D33","D43");
                doctorCombobox.setItems(doctorName3);
                break;
            
            case "D4":
                ObservableList<String> doctorName4 = FXCollections.observableArrayList("D154","D254","D354","D454");
                doctorCombobox.setItems(doctorName4);
                break;    
        } 
        
    }
}
