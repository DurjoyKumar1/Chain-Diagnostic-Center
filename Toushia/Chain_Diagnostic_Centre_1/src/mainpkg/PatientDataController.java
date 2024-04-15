package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 */
public class PatientDataController implements Initializable {

    @FXML
    private TableView<Patient> tableData; 
    @FXML
    private TableColumn<Patient, String> serialnoColumn; 
    @FXML
    private TableColumn<Patient, String> patientNameColumn;
    @FXML
    private TableColumn<Patient, Integer> ageColumn; 
    @FXML
    private TableColumn<Patient, String> testNameColumn;
    @FXML
    private TableColumn<Patient, String> sampleTypeColumn;

    private ObservableList<Patient> patientList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize TableView columns using PropertyValueFactory
        serialnoColumn.setCellValueFactory(new PropertyValueFactory<>("serialNo"));
        patientNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        testNameColumn.setCellValueFactory(new PropertyValueFactory<>("testName"));
        sampleTypeColumn.setCellValueFactory(new PropertyValueFactory<>("sampleType"));

        // Populate TableView with dummy data
        patientList = FXCollections.observableArrayList(
                new Patient("1", "John Doe", 30, "Test A", "Blood"),
                new Patient("2", "Jane Smith", 25, "Test B", "Urine"),
                new Patient("3", "Alice Johnson", 40, "Test C", "Saliva")
        );
        tableData.setItems(patientList);
    }

    @FXML
    private void RequestforRecieveSampleButtonMouseOnClicked(ActionEvent event) {
        Patient selectedPatient = tableData.getSelectionModel().getSelectedItem();

        if (selectedPatient != null) {
            System.out.println("Sample received for patient: " + selectedPatient.getName());
        } else {
            System.out.println("Please select a patient before requesting to receive sample.");
        }
    }

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("LabTechnicianDashboard.fxml"));
        Scene newScene = new Scene(parent);

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(newScene);
        currentStage.show();
    }
}
