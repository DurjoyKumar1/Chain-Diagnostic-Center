package mainpkg;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kazis
 */
public class TechnicalIssueController implements Initializable {

    @FXML
    private TableView<Issue> tableView; // Changed to specific type Issue for clarity
    @FXML
    private TableColumn<Issue, String> serialnoColumn; // Define the appropriate type
    @FXML
    private TableColumn<Issue, String> technicalissueColumn;
    @FXML
    private TableColumn<Issue, String> howtoFixedColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set up the columns in the table
        serialnoColumn.setCellValueFactory(new PropertyValueFactory<>("serialNo"));
        technicalissueColumn.setCellValueFactory(new PropertyValueFactory<>("technicalIssue"));
        howtoFixedColumn.setCellValueFactory(new PropertyValueFactory<>("howToFix"));

        // Load some dummy data
        tableView.setItems(getDummyData());
    }    

    private ObservableList<Issue> getDummyData() {
        ObservableList<Issue> data = FXCollections.observableArrayList(
            new Issue("001", "Screen does not turn on", "Check the power supply and cable connections."),
            new Issue("002", "Printer jams", "Remove any stuck paper and ensure correct paper size."),
            new Issue("003", "Software crash", "Restart the software and update if necessary.")
        );
        return data;
    }

    @FXML
    private void resolveIssueButtonOnClick(ActionEvent event) {
        Issue selectedIssue = tableView.getSelectionModel().getSelectedItem();
        if (selectedIssue != null) {
            System.out.println("Resolving issue: " + selectedIssue.getTechnicalIssue());
            // Logic to resolve the issue could go here
        }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("LabTechnicianDashboard.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }

    // Define the Issue class inside the TechnicalIssueController for simplicity
    public static class Issue {
        private final String serialNo;
        private final String technicalIssue;
        private final String howToFix;

        public Issue(String serialNo, String technicalIssue, String howToFix) {
            this.serialNo = serialNo;
            this.technicalIssue = technicalIssue;
            this.howToFix = howToFix;
        }

        public String getSerialNo() {
            return serialNo;
        }

        public String getTechnicalIssue() {
            return technicalIssue;
        }

        public String getHowToFix() {
            return howToFix;
        }
    }
}
