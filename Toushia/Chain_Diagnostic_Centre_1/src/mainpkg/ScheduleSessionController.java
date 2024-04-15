/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
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
public class ScheduleSessionController implements Initializable {

    @FXML
    private TextArea newScheduleTextArea;
    @FXML
    private TableView<?> existingSchedule;
    @FXML
    private TableColumn<?, ?> serialNoColumn;
    @FXML
    private TableColumn<?, ?> traininName;
    @FXML
    private TableColumn<?, ?> trainingDateColumn;
    @FXML
    private TableColumn<?, ?> trainingTimeColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
