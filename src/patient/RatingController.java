/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package patient;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class RatingController implements Initializable {

    @FXML
    private ComboBox<Integer> ratingComboBox;
    @FXML
    private TextArea textAreaBoxFxId;
    ArrayList<Rating> ratingUs;
    Alert seccess = new Alert(Alert.AlertType.CONFIRMATION, "Successfull" );
    Alert error = new Alert(Alert.AlertType.ERROR, "Please Complete all the field properly" );
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Integer> rating = FXCollections.observableArrayList(1,2,3,4,5);
        ratingComboBox.setItems(rating);
        ratingUs = new ArrayList<>();
        
    }    
    
   
    
    @FXML
    private void rateUsSubmitButtoon(ActionEvent event) {
        String rate = textAreaBoxFxId.getText();
        Integer rateValue = ratingComboBox.getValue();
        Rating ratingClass = new Rating(rate,rateValue);
        ratingUs.add(ratingClass);
       if(!textAreaBoxFxId.getText().isEmpty() && ratingComboBox.getValue() !=null){
        try (FileWriter fw = new FileWriter("rating.text",true)) {
            fw.write("Review: " + rate + "\n");
            fw.write("Rating: " + rateValue );
            seccess.show();
            
        } catch (IOException ex) {
            Logger.getLogger(Rating.class.getName()).log(Level.SEVERE, null, ex);
        }
       }else{
           error.show();
       }
    }
     public ArrayList<Rating> getMyList() {
        return ratingUs;
    }

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Patients Dashboard.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }
    
}
