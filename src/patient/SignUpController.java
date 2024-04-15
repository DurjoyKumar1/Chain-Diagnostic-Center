/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package patient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class SignUpController implements Initializable {

    @FXML
    private TextField nameFXId;
    @FXML
    private TextField phoneNoFxId;
    @FXML
    private PasswordField passwordFxId;
    ArrayList<Rating> signInfo;
    Alert seccess = new Alert(Alert.AlertType.CONFIRMATION, "Successfull" );
    Alert error = new Alert(Alert.AlertType.ERROR, "Please Complete all the field properly" );
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        signInfo = new ArrayList<>();
    }    

    @FXML
    private void createButtonMouseOnClick(ActionEvent event) {
        String name = nameFXId.getText();
        String Phone = phoneNoFxId.getText();
        String password = passwordFxId.getText();
        signUpClass signUp = new signUpClass(nameFXId.getText(),phoneNoFxId.getText(),passwordFxId.getText());
       
        
        if(!nameFXId.getText().isEmpty() && !phoneNoFxId.getText().isEmpty() && !passwordFxId.getText().isEmpty()){
        try (FileWriter fw = new FileWriter("signUp.text",true)) {
            fw.write( name + ",\n");
            fw.write(Phone +",\n" );
            fw.write(password+",\n");
            seccess.show();
            
        } catch (IOException ex) {
            Logger.getLogger(Rating.class.getName()).log(Level.SEVERE, null, ex);
        }
       }else{
           error.show();
       }
        
    }

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("patientDashboardLogin.fxml"));
        Scene newScene = new Scene(parent);

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(newScene);
        currentStage.show();
    }
    
}
