/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package patient;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class AmbulanceController implements Initializable {

    ToggleGroup tg;
    @FXML
    private RadioButton emergancyToggoleButton;
    @FXML
    private RadioButton preBookingToogleButton;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tg = new ToggleGroup();
        emergancyToggoleButton.setToggleGroup(tg);
        preBookingToogleButton.setToggleGroup(tg);
        
    }    

    @FXML
    private void backButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Patients Dashboard.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void confirmButton(ActionEvent event) throws IOException {
        if(preBookingToogleButton.isSelected()){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PreBookingAmbulance.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
        }
        else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("emergancyAmbulanceBook.fxml"));
            Parent parent = loader.load();

            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            Scene newScene = new Scene(parent);

            currentStage.setScene(newScene);
            currentStage.show();
        
        }
    }
    
}
