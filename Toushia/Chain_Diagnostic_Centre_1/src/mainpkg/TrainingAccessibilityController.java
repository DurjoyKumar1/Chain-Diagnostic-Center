/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
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
public class TrainingAccessibilityController implements Initializable {

    @FXML
    private TextArea suggestionTextArea;
    @FXML
    private TableView<?> accessebiltyTableView;
    @FXML
    private TableColumn<?, ?> serialColumn;
    @FXML
    private TableColumn<?, ?> TrainingName;
    @FXML
    private TableColumn<?, ?> TrainingMaterialAccessibilty;
    @FXML
    private RadioButton AudioButton;
    @FXML
    private RadioButton VideoRadioButton;
    @FXML
    private RadioButton writtenMaterialsButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
