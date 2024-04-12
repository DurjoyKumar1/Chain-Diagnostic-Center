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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class BranchNameDetailsController implements Initializable {

    @FXML
    private TextArea branchDetailsTextField;
    private String branchName;
    private String phoneNum;
    private String address;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            
        
    }    

    public TextArea getBranchDetailsTextField() {
        return branchDetailsTextField;
    }
    
    
    public void setBranchDetails(String branchName, String phoneNum, String address) {
        this.branchName = branchName;
        this.phoneNum = phoneNum;
        this.address = address;
        updateBranchDetailsTextField();
    }
    public void setBranchDetailsTextField(TextArea branchDetailsTextField) {
        this.branchDetailsTextField = branchDetailsTextField;
    }
    private void updateBranchDetailsTextField() {
        if (branchDetailsTextField != null) {
            branchDetailsTextField.setText("Branch Name: " + branchName + "\n" +
                                           "Phone Number: " + phoneNum + "\n" + 
                                           "Address: " + address);
        }
    }

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BranchName.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }
    
}
