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
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kazis
 */
public class OperateImageController implements Initializable {

    @FXML
    private RadioButton preparefortestingButton;
    @FXML
    private RadioButton notPreparefortestingButton;
    @FXML
    private RadioButton YesButton;
    @FXML
    private RadioButton NoButton;

    // ToggleGroups for radio buttons
    private ToggleGroup prepareToggleGroup;
    private ToggleGroup yesNoToggleGroup;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize toggle groups
        prepareToggleGroup = new ToggleGroup();
        yesNoToggleGroup = new ToggleGroup();

        // Assign toggle groups to radio buttons
        preparefortestingButton.setToggleGroup(prepareToggleGroup);
        notPreparefortestingButton.setToggleGroup(prepareToggleGroup);
        YesButton.setToggleGroup(yesNoToggleGroup);
        NoButton.setToggleGroup(yesNoToggleGroup);
    }    

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("LabTechnicianDashboard.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }
}
