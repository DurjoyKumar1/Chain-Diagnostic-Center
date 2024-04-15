package patient;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.MenuBar;

public class MainDashboardController implements Initializable {

    @FXML
    private BorderPane borderPaneFxId;
    @FXML
    private MenuBar menubarFxId;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialization code goes here, if needed
    }    

    @FXML
    private void patientMouseOnClick(ActionEvent event) {
        try {
            changeScene("patientDashboardLogin.fxml");
        } catch (IOException ex) {
            Logger.getLogger(MainDashboardController.class.getName()).log(Level.SEVERE, "Error loading patient scene", ex);
        }
    }

    @FXML
    private void accountantMouseOnClick(ActionEvent event) {
        try {
            changeScene("AccountantLogIn.fxml");
        } catch (IOException ex) {
            Logger.getLogger(MainDashboardController.class.getName()).log(Level.SEVERE, "Error loading accountant scene", ex);
        }
    }

    private void changeScene(String filename) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(filename));
        try {
            Parent root = loader.load();
            borderPaneFxId.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(MainDashboardController.class.getName()).log(Level.SEVERE, "Error loading FXML file: " + filename, ex);
            throw ex;
        }
    }
}
