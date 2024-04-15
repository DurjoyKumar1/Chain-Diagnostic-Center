package mainpkg;

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
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 */
public class QualityControlController implements Initializable {

    @FXML
    private RadioButton YesRadioButton;
    @FXML
    private RadioButton NoRadioButton;
    @FXML
    private TextField enterTheQuality;

    private ToggleGroup qualityToggleGroup;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize radio button group
        qualityToggleGroup = new ToggleGroup();
        YesRadioButton.setToggleGroup(qualityToggleGroup);
        NoRadioButton.setToggleGroup(qualityToggleGroup);
        
        // Select default value
        YesRadioButton.setSelected(true);
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