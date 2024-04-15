
package mainpkg;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.net.URL;
import java.util.ResourceBundle;

public class DiagnosticReportController implements Initializable {

    @FXML
    private TableView<DiagnosticRecord> RecordFilesTable;
    @FXML
    private TableColumn<DiagnosticRecord, String> SerialNoColumn;
    @FXML
    private TableColumn<DiagnosticRecord, String> PatientNameColumn;
    @FXML
    private TableColumn<DiagnosticRecord, Integer> AgeColumn;
    @FXML
    private TableColumn<DiagnosticRecord, String> TestNameColumn;
    @FXML
    private TableColumn<DiagnosticRecord, String> SampleTypeColumn;
    @FXML
    private RadioButton YeSReportMadeButton;
    @FXML
    private RadioButton NoReportMadeButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        SerialNoColumn.setCellValueFactory(new PropertyValueFactory<>("serialNoProperty"));
        PatientNameColumn.setCellValueFactory(new PropertyValueFactory<>("patientNameProperty"));
        AgeColumn.setCellValueFactory(new PropertyValueFactory<>("ageProperty"));
        TestNameColumn.setCellValueFactory(new PropertyValueFactory<>("testNameProperty"));
        SampleTypeColumn.setCellValueFactory(new PropertyValueFactory<>("sampleTypeProperty"));

        loadTableData();
        setupRadioButtons();
    }

    private void loadTableData() {
        ObservableList<DiagnosticRecord> records = FXCollections.observableArrayList();
        records.add(new DiagnosticRecord("1", "asif", 30, "Blood Test", "Blood"));
        records.add(new DiagnosticRecord("2", "rahima", 25, "X-Ray", "None"));
        RecordFilesTable.setItems(records);
    }

    private void setupRadioButtons() {
        YeSReportMadeButton.selectedProperty().addListener((obs, wasSelected, isNowSelected) -> {
            if (isNowSelected) {
                System.out.println("Yes, report made is selected");
            }
        });

        NoReportMadeButton.selectedProperty().addListener((obs, wasSelected, isNowSelected) -> {
            if (isNowSelected) {
                System.out.println("No, report made is selected");
            }
        });
    }

    private static class DiagnosticRecord {

        public DiagnosticRecord(String string, String jane_Smith, int i, String xRay, String none) {
        }
    }
}
