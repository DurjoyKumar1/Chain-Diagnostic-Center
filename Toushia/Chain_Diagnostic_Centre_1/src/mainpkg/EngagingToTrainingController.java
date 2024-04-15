/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
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
public class EngagingToTrainingController implements Initializable {

    @FXML
    private TableView<?> reviewColumn;
    @FXML
    private TableColumn<?, ?> seriakColumn;
    @FXML
    private TableColumn<?, ?> contentTrainingColumn;
    @FXML
    private TableColumn<?, ?> employeeNameColumn;
    @FXML
    private TableColumn<?, ?> contentAttendingColumn;
    @FXML
    private ComboBox<?> rewardCombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
