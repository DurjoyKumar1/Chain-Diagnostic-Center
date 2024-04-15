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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kazis
 */
public class LabTestController implements Initializable {

    @FXML
    private TableView<Patient> patientTable;
    @FXML
    private TableColumn<Patient, String> serialNoColumn;
    @FXML
    private TableColumn<Patient, String> patientNameColumn;
    @FXML
    private TableColumn<Patient, Integer> ageColumn;
    @FXML
    private TableColumn<Patient, String> testNameColumn;
    @FXML
    private TableColumn<Patient, String> sampleTypeColumn;
    @FXML
    private RadioButton doneRadioButton;
    @FXML
    private RadioButton notDoneRadioButton;

    // ToggleGroup to manage the radio buttons
    private final ToggleGroup testStatusGroup = new ToggleGroup();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        serialNoColumn.setCellValueFactory(new PropertyValueFactory<>("serialNo"));
        patientNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        testNameColumn.setCellValueFactory(new PropertyValueFactory<>("testName"));
        sampleTypeColumn.setCellValueFactory(new PropertyValueFactory<>("sampleType"));

        // Setting up the ToggleGroup for radio buttons
        doneRadioButton.setToggleGroup(testStatusGroup);
        notDoneRadioButton.setToggleGroup(testStatusGroup);
        doneRadioButton.setSelected(true); // Default selection

        // Loading some dummy data
        patientTable.setItems(getDummyData());
    }

    private ObservableList<Patient> getDummyData() {
        return FXCollections.observableArrayList(
            new Patient("001", "John Doe", 30, "Blood Test", "Blood"),
            new Patient("002", "Jane Smith", 25, "X-ray", "Radiology"),
            new Patient("003", "Alice Johnson", 45, "MRI", "Radiology")
        );
    }

    @FXML
    private void showTheListOfPatientButtonMouseOnClicked(ActionEvent event) {
        patientTable.setItems(getDummyData());
    }

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("LabTechnicianDashboard.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
        
       
    }

    
    @FXML
    private void onRadioButtonAction(ActionEvent event) {
        if (doneRadioButton.isSelected()) {
            System.out.println("Done is selected");
        } else if (notDoneRadioButton.isSelected()) {
            System.out.println("Not Done is selected");
        }
    }

    public static class Patient {
        private final String serialNo;
        private final String name;
        private final int age;
        private final String testName;
        private final String sampleType;

        public Patient(String serialNo, String name, int age, String testName, String sampleType) {
            this.serialNo = serialNo;
            this.name = name;
            this.age = age;
            this.testName = testName;
            this.sampleType = sampleType;
        }

        public String getSerialNo() {
            return serialNo;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getTestName() {
            return testName;
        }

        public String getSampleType() {
            return sampleType;
        }
    }
}
