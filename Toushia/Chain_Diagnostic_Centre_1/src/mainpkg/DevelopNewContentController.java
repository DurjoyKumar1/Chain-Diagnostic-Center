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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author kazis
 */
public class DevelopNewContentController implements Initializable {

    @FXML
    private ComboBox<?> AddModulesComboBox;
    @FXML
    private TableView<?> newContentTable;
    @FXML
    private TableColumn<?, ?> serialnoColumn;
    @FXML
    private TableColumn<?, ?> newContentColumn;
    @FXML
    private TableColumn<?, ?> ObjectContentcolumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addModuleComboBox(ActionEvent event) {
    }

    @FXML
    private void submittoEmployeeMouseOnClicked(ActionEvent event) {
    }
    
}
