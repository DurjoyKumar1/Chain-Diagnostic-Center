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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class LiveChatController implements Initializable {

    @FXML
    private TextArea msgFxId;
    @FXML
    private ComboBox<String> comboBoxFxID;
    @FXML
    private TextArea showLiveChatFxId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> live = FXCollections.observableArrayList("Accountant", "Patient");
        comboBoxFxID.setItems(live);
        try (BufferedReader br = new BufferedReader(new FileReader("liveChat.text"))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            showLiveChatFxId.setText(sb.toString());
        } catch (IOException ex) {
            Logger.getLogger(PreBookingAmbulanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    @FXML
    private void sendMsgButtonMouseOnClick(ActionEvent event) {
        String msg = msgFxId.getText();
        String showmsg = showLiveChatFxId.getText();
        
       
        
        
        try (FileWriter fw = new FileWriter("liveChat.text",true)) {
            fw.write( comboBoxFxID.getValue()+": "+msg + ",\n");
            
            
        } catch (IOException ex) {
            Logger.getLogger(Rating.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
}
