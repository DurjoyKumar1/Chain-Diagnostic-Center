/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package patient;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class TaxController implements Initializable {

    @FXML
    private TextField amountFxId;
    @FXML
    private TextField vatPercentageFXId;
    @FXML
    private TextField showTaxAmountFxId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void calculateTaxButton(ActionEvent event) {
       Integer amount =Integer.parseInt (amountFxId.getText());
       Float vat = Float.parseFloat(vatPercentageFXId.getText()); 
       Float result = amount*(vat/100);
       showTaxAmountFxId.setText(Float.toString(result));
    }

    @FXML
    private void sendTaxAmount(ActionEvent event) {
        Integer amount =Integer.parseInt (amountFxId.getText());
       Float vat = Float.parseFloat(vatPercentageFXId.getText()); 
       Float result = amount*(vat/100);
       try (FileWriter fw = new FileWriter("Tax.text",true)) {
            fw.write("Vat Amount: " + result + "\n");
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Rating.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void BackButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Accountant Dashboard.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }
    
}
