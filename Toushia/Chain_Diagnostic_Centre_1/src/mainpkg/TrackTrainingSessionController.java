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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author kazis
 */
public class TrackTrainingSessionController implements Initializable {

    @FXML
    private TableView<?> employeeDevelopmnetTable;
    @FXML
    private TableColumn<?, ?> serialNoColumn;
    @FXML
    private TableColumn<?, ?> employeeNameColumn;
    @FXML
    private TableColumn<?, ?> trainierAttendingColumn;
    @FXML
    private TableColumn<?, ?> assesmentDoneByEmployeeColumn;
    @FXML
    private TextArea commentsColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void employeeDevelopmentMouseOnClicked(ActionEvent event) {
    }
    
}
