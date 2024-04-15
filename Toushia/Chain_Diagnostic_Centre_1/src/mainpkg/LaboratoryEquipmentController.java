package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kazis
 */
public class LaboratoryEquipmentController implements Initializable {

    @FXML
    private RadioButton yesRadioButton;
    @FXML
    private RadioButton noRadioButton;
    @FXML
    private TextField EnterTheSupplies;

    private ToggleGroup equipmentToggleGroup;

    /**
     * Initializes the controller class. This setup initializes the toggle group,
     * binds radio buttons to this group, and sets up a listener to update the text field
     * whenever the radio button selection changes.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize the radio button group
        equipmentToggleGroup = new ToggleGroup();
        yesRadioButton.setToggleGroup(equipmentToggleGroup);
        noRadioButton.setToggleGroup(equipmentToggleGroup);

        // Select default value
        yesRadioButton.setSelected(true);

        // Add listener to the toggle group to update the text field whenever the selection changes
        equipmentToggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                if (newValue != null) {
                    RadioButton selectedRadioButton = (RadioButton) newValue;
                    EnterTheSupplies.setText("Equipment status: " + selectedRadioButton.getText());
                } else {
                    EnterTheSupplies.setText("Select an equipment status");
                }
            }
        });
    }

  
    @FXML
    private void serviceRequestButtonMouseOnClicked(ActionEvent event) {
   
        System.out.println("Submitted equipment status: " + EnterTheSupplies.getText());
    }

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("LabTechnicianDashboard.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }
    
}
