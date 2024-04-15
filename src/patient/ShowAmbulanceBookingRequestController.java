package patient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ShowAmbulanceBookingRequestController implements Initializable {

    @FXML
    private TableView<AmbReqDetails> ambulancePrebookingReqInfo;
    @FXML
    private TableColumn<AmbReqDetails, String> nameTableViewColumn;
    @FXML
    private TableColumn<AmbReqDetails, String> phoneNumTableViewColumn;
    @FXML
    private TableColumn<AmbReqDetails, String> addressTableViewColumn;
    @FXML
    private TableColumn<AmbReqDetails, String> emailTableViewColumn;
    @FXML
    private TableColumn<AmbReqDetails, Float> timeTableViewColumn;
    @FXML
    private TableColumn<AmbReqDetails, String> dateTableViewColumn;
    @FXML
    private TextArea ambulanceReqDetailsFXId;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeTableViewColumns();
    }

    private void initializeTableViewColumns() {
        nameTableViewColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        phoneNumTableViewColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNum"));
        addressTableViewColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        emailTableViewColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        timeTableViewColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        dateTableViewColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    void setData(ArrayList<AmbReqDetails> ambReqList) {
        ambulancePrebookingReqInfo.getItems().addAll(ambReqList);
    }

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("PreBookingAmbulance.fxml"));
        Scene newScene = new Scene(parent);

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    private void showDetailsReqButtonMouseOnClick(ActionEvent event) {
        try (BufferedReader br = new BufferedReader(new FileReader("amulanceDetails.text"))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            ambulanceReqDetailsFXId.setText(sb.toString());
        } catch (IOException ex) {
            Logger.getLogger(PreBookingAmbulanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
