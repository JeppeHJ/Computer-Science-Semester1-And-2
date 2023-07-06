package Opgaver.Opgave2.guifx;

import Opgaver.Opgave2.application.controller.Controller;
import Opgaver.Opgave2.application.model.Company;
import Opgaver.Opgave2.application.model.Customer;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.w3c.dom.Text;

public class CustomerWindow extends Stage {
    private Company company;
    private Customer customer;

    public CustomerWindow(Company company) {
        this.company = company;
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);

        this.setTitle("Customer Window");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    private TextField txfName;

    private void initContent(GridPane pane) {
        txfName = new TextField();
        pane.add(txfName, 0, 1);

        Button btnCancel = new Button("Cancel");
        pane.add(btnCancel, 1, 2);
        GridPane.setHalignment(btnCancel, HPos.LEFT);
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        pane.add(btnOK, 0, 2);
        GridPane.setHalignment(btnOK, HPos.RIGHT);
        btnOK.setOnAction(event -> this.okAction());
    }

    public void okAction() {
        String name = txfName.getText().trim();
        customer = Controller.createCustomer(name);
        company.addCustomer(customer);
        this.hide();
    }

    public void cancelAction() {
        this.hide();

    }

}
