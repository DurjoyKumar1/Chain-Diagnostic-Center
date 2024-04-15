/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package patient;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class SalaryController implements Initializable {

    @FXML
    private ComboBox<String> employeAsFxId;
    @FXML
    private ComboBox<Integer> employeIdFxId;
    @FXML
    private TextField accountNoFxId;
    @FXML
    private TextField nameFxId;
    @FXML
    private TextField amountFxId;
    @FXML
    private TableView<SalaryInfo> salaryInfOFxId;
    @FXML
    private TableColumn<SalaryInfo, String> employeStatustableViewCoulmnFXID;
    @FXML
    private TableColumn<SalaryInfo, Integer> idtableViewCoulmnFXID;
    @FXML
    private TableColumn<SalaryInfo, String> ACCtableViewCoulmnFXID;
    @FXML
    private TableColumn<SalaryInfo, String> nametableViewCoulmnFXID;
    @FXML
    private TableColumn<SalaryInfo, String> amounttableViewCoulmnFXID;
    
    ArrayList<SalaryInfo> salaryInfo;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> employe = FXCollections.observableArrayList("Doctor","Technisian", "ReciepTionist", "Accountant");
        employeAsFxId.setItems(employe);
        
         salaryInfo = new ArrayList<>();
        
        employeStatustableViewCoulmnFXID.setCellValueFactory(new PropertyValueFactory<SalaryInfo, String>("Employe"));
        idtableViewCoulmnFXID.setCellValueFactory(new PropertyValueFactory<SalaryInfo, Integer>("Id"));
        ACCtableViewCoulmnFXID.setCellValueFactory(new PropertyValueFactory<SalaryInfo, String>("AccNo"));
        nametableViewCoulmnFXID.setCellValueFactory(new PropertyValueFactory<SalaryInfo, String>("Name"));
        amounttableViewCoulmnFXID.setCellValueFactory(new PropertyValueFactory<SalaryInfo, String>("amount"));
        
    }    

    @FXML
    private void employeAsButtonMouseOnClick(ActionEvent event) {
         if(employeAsFxId.getValue()=="Doctor"){
            ObservableList<Integer> employeId = FXCollections.observableArrayList(111,222, 333, 444);
            employeIdFxId.setItems(employeId);
         }
         else if(employeAsFxId.getValue()=="Technisian"){
            ObservableList<Integer> employeId = FXCollections.observableArrayList(1111,1222, 1333, 1444);
            employeIdFxId.setItems(employeId);
         }
         else if(employeAsFxId.getValue()=="ReciepTionist"){
            ObservableList<Integer> employeId = FXCollections.observableArrayList(2111,2222, 2333, 2444);
            employeIdFxId.setItems(employeId);
         }
        else if(employeAsFxId.getValue()=="Accountant"){
            ObservableList<Integer> employeId = FXCollections.observableArrayList(3111,3222, 3333, 3444);
            employeIdFxId.setItems(employeId);
         }
    }

    @FXML
    private void employeIdButtonMouseOnClick(ActionEvent event) {
        if(employeAsFxId.getValue()=="Doctor"){
            if(employeIdFxId.getValue()==111){
                accountNoFxId.setText("000111000222");
                nameFxId.setText("D1");
                amountFxId.setText("120000");
            }
            else if(employeIdFxId.getValue()==222){
                accountNoFxId.setText("000111000221");
                nameFxId.setText("D2");
                amountFxId.setText("10000");
            }
            else if(employeIdFxId.getValue()==333){
                accountNoFxId.setText("000111000223");
                nameFxId.setText("D3");
                amountFxId.setText("150000");
            }
            else if(employeIdFxId.getValue()==444){
                accountNoFxId.setText("000111000224");
                nameFxId.setText("D4");
                amountFxId.setText("180000");
            }
        
        }
        else if(employeAsFxId.getValue()=="Technisian"){
            if(employeIdFxId.getValue()==1111){
                accountNoFxId.setText("000111000122");
                nameFxId.setText("T1");
                amountFxId.setText("12000");
            }
            else if(employeIdFxId.getValue()==1222){
                accountNoFxId.setText("000111000121");
                nameFxId.setText("T2");
                amountFxId.setText("10000");
            }
            else if(employeIdFxId.getValue()==1333){
                accountNoFxId.setText("000111000123");
                nameFxId.setText("T3");
                amountFxId.setText("15000");
            }
            else if(employeIdFxId.getValue()==1444){
                accountNoFxId.setText("000111000124");
                nameFxId.setText("T4");
                amountFxId.setText("18000");
            }
        
        }
        else if(employeAsFxId.getValue()=="ReciepTionist"){
            if(employeIdFxId.getValue()==2111){
                accountNoFxId.setText("000111000022");
                nameFxId.setText("R1");
                amountFxId.setText("13000");
            }
            else if(employeIdFxId.getValue()==2222){
                accountNoFxId.setText("000111000021");
                nameFxId.setText("R2");
                amountFxId.setText("12000");
            }
            else if(employeIdFxId.getValue()==2333){
                accountNoFxId.setText("000111000123");
                nameFxId.setText("R3");
                amountFxId.setText("15000");
            }
            else if(employeIdFxId.getValue()==2444){
                accountNoFxId.setText("000111000124");
                nameFxId.setText("R4");
                amountFxId.setText("16000");
            }
        
        }
        
    }

    @FXML
    private void sendButtonMouseOnClick(ActionEvent event) {
       
        
        SalaryInfo salarydata = new SalaryInfo(employeAsFxId.getValue(),employeIdFxId.getValue(),
        accountNoFxId.getText(),nameFxId.getText(),amountFxId.getText());
        salaryInfo.add(salarydata);
        ObservableList<SalaryInfo> data = FXCollections.observableArrayList(salaryInfo);
        salaryInfOFxId.setItems(data);
        
       
    }
    
    

    @FXML
    private void backButtonMouseOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Accountant Dashboard.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene newScene = new Scene(parent);

        currentStage.setScene(newScene);
        currentStage.show();
    }
    
}
