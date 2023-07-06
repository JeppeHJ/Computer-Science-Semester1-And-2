package Opgaver.Opgave2.guifx;

import Opgaver.Opgave2.application.model.Customer;
import Opgaver.Opgave2.storage.Storage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CustomerSelectionWindow extends Stage {

    private ListView<Customer> customerListView;

    public CustomerSelectionWindow() {
        this.setTitle("Select Customers");

        VBox vbox = new VBox();
        this.customerListView = new ListView<>();

        // Allow multiple selection
        this.customerListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        Button selectButton = new Button("OK");
        selectButton.setOnAction(event -> handleSelectButton());

        vbox.getChildren().addAll(this.customerListView, selectButton);

        this.setScene(new Scene(vbox));
    }

    public void initData() {
        // Populate the list view with existing customers
        this.customerListView.getItems().addAll(Storage.getCustomers());
    }

    private void handleSelectButton() {
        // Here you handle the selection and add the customers to the company.
        // For this you might need a reference to the selected company
        // You can pass it when you create this window or create a setCompany method.

        this.close();
    }
}
