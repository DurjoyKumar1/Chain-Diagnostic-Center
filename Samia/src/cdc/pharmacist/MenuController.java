/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cdc.pharmacist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author alkaf
 */
public class MenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Menu menuSupplier;

    @FXML
    private MenuItem menuItemCreateSupplier;

    @FXML
    private MenuItem menuItemListSupplier;

    @FXML
    private Menu menuMedicine;

    @FXML
    private MenuItem menuItemCreateMedicine;

    @FXML
    private MenuItem menuItemListMedicine;

    @FXML
    private Menu menuInventory;

    @FXML
    private MenuItem menuItemCreateInventory;

    @FXML
    private MenuItem menuItemListInventory;

    @FXML
    private Menu menuInvoice;

    @FXML
    private MenuItem menuItemCreateInvoice;

    @FXML
    private MenuItem menuItemListInvoice;

    @FXML
    private Menu menuSales;

    @FXML
    private MenuItem menuItemListSales;

    @FXML
    private Menu menuTrackReceipt;

    @FXML
    private MenuItem menuItemListTrackReceipt;

    @FXML
    private Menu menuLogout;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    void handleMenuAction(ActionEvent event) {
        if (event.getSource() == menuSupplier) {
        } else if (event.getSource() == menuItemCreateSupplier) {
            try {
                // Load CreateSupplier.fxml
                FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateSupplier.fxml"));
                Parent root = loader.load();

                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Create Supplier");
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (event.getSource() == menuItemListSupplier) {
        } else if (event.getSource() == menuMedicine) {
        } else if (event.getSource() == menuItemCreateMedicine) {
        } else if (event.getSource() == menuItemListMedicine) {
        } else if (event.getSource() == menuInventory) {
        } else if (event.getSource() == menuItemCreateInventory) {
        } else if (event.getSource() == menuItemListInventory) {
        } else if (event.getSource() == menuInvoice) {
        } else if (event.getSource() == menuItemCreateInvoice) {
        } else if (event.getSource() == menuItemListInvoice) {
        } else if (event.getSource() == menuSales) {
        } else if (event.getSource() == menuItemListSales) {
        } else if (event.getSource() == menuTrackReceipt) {
        } else if (event.getSource() == menuItemListTrackReceipt) {
        } else if (event.getSource() == menuLogout) {
        }
    }
    
}
