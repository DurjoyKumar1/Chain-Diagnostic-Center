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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class BranchNameController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void mirpurBranchButtonMouseOnCLick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BranchNameDetails.fxml"));
        Parent parent = loader.load();

        BranchNameDetailsController detailsController = loader.getController();
        detailsController.setBranchDetails("Mirpur", "01761068820", "Mirpur 11, Dhaka");

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void baddaBranchButtonMouseOnCLick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BranchNameDetails.fxml"));
        Parent parent = loader.load();

        BranchNameDetailsController detailsController = loader.getController();
        detailsController.setBranchDetails("Badda", "01761068820", "Moddho Badda, Dhaka");

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void uttoraBranchButtonMouseOnCLick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BranchNameDetails.fxml"));
        Parent parent = loader.load();

        BranchNameDetailsController detailsController = loader.getController();
        detailsController.setBranchDetails("Uttora", "01761068820", "Uttora 11, Dhaka");

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void farmgateBranchButtonMouseOnCLick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BranchNameDetails.fxml"));
        Parent parent = loader.load();

        BranchNameDetailsController detailsController = loader.getController();
        detailsController.setBranchDetails("Farmgate", "01761068820", "Farmgate, Dhaka");

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void motijheelBranchButtonMouseOnCLick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BranchNameDetails.fxml"));
        Parent parent = loader.load();

        BranchNameDetailsController detailsController = loader.getController();
        detailsController.setBranchDetails("Motijheel", "01761068820", "Mptijheel, Dhaka");

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void shamoliBranchButtonMouseOnCLick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BranchNameDetails.fxml"));
        Parent parent = loader.load();

        BranchNameDetailsController detailsController = loader.getController();
        detailsController.setBranchDetails("Shamoli", "01761068820", "Shamoli, Dhaka");

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void mogbajarBranchButtonMouseOnCLick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BranchNameDetails.fxml"));
        Parent parent = loader.load();

        BranchNameDetailsController detailsController = loader.getController();
        detailsController.setBranchDetails("Mogbajar", "01761068820", "Mogbajar, Dhaka");

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void dhanmondiBranchButtonMouseOnCLick(ActionEvent event) throws IOException {
     FXMLLoader loader = new FXMLLoader(getClass().getResource("BranchNameDetails.fxml"));
        Parent parent = loader.load();

        BranchNameDetailsController detailsController = loader.getController();
        detailsController.setBranchDetails("Dhanmondi", "01761068820", "Dhanmondi, Dhaka");

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();   
    }
    
}
