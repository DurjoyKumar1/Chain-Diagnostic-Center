/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author kazis
 */
public class TrainingSecurityController implements Initializable {

    @FXML
    private RadioButton yesRadioButton;
    @FXML
    private RadioButton NoRadioButton;
    @FXML
    private TextArea fixedTextArea;
    @FXML
    private TableView<?> tableCoulm;
    @FXML
    private TableColumn<?, ?> serialNoColumn;
    @FXML
    private TableColumn<?, ?> TrainingNameColumn;
    @FXML
    private TableColumn<?, ?> SecurityLevelColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void monitorSecurityMouseOnClicked(ActionEvent event) {
    }
    
}
