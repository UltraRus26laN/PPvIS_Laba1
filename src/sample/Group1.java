package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumnBase;
import javafx.collections.FXCollections;
import javafx.util.Pair;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class Group1 implements ComponentLinker
{
    private HBox hBox;

    private void showAddError()
    {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("ERROR MESSAGE!!!");
        alert.setHeaderText("Error type: error of adding");
        alert.setContentText("You are not able to add the text to the list!");

        alert.showAndWait();
    }

    @Override
    public void link()
    {
        //GROUP 1!!!!!
        Label label1 = new Label("Group #1");
        label1.setLayoutX(10); label1.setLayoutY(10);

        TextField JTextField = new TextField();
        JTextField.setLayoutX(10); JTextField.setLayoutY(40);
        //JTextField.setMinWidth(50);

        Button JButton = new Button("");
        JButton.setLayoutX(10); JButton.setLayoutY(80);
        JButton.setShape(new Circle(30));
        JButton.setMinSize(30, 30);

        ComboBox JComboBox = new ComboBox();
        JComboBox.setLayoutX(10); JComboBox.setLayoutY(120);
        //JComboBox.setMinWidth(50);

        JButton.setStyle("-fx-background-color: lightgray");
        JButton.setOnMouseEntered(event ->
        {
            JButton.setStyle("-fx-background-color: red");
        });
        JButton.setOnMouseExited(event ->
        {
            JButton.setStyle("-fx-background-color: lightgray");
        });

        JButton.setOnAction(event ->
        {
            if (JComboBox.getItems().contains(JTextField.getText())) showAddError();
            else JComboBox.getItems().add(JTextField.getText());
        });

        Pane pane1 = new Pane();
        pane1.getChildren().addAll(JTextField, JComboBox, JButton, label1);
        hBox.getChildren().addAll(JTextField, JComboBox, JButton, label1);
    }

    @Override
    public HBox component()
    {
        return this.hBox;
    }
}
