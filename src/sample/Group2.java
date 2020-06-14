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

public class Group2 implements ComponentLinker
{
    private HBox hBox;
    @Override
    public void link()
    {
        //GROUP 2!!!!!
        Label label2 = new Label("Group #2");
        label2.setLayoutX(50); label2.setLayoutY(10);

        TextField JTextField2 = new TextField();
        JTextField2.setLayoutX(50); JTextField2.setLayoutY(40);

        Button JButton1 = new Button("");
        JButton1.setLayoutX(50); JButton1.setLayoutY(80);
        JButton1.setShape(new Circle(30));
        JButton1.setMinSize(30, 30);

        JButton1.setStyle("-fx-background-color: lightgray");
        JButton1.setOnMouseEntered(event ->
        {
            JButton1.setStyle("-fx-background-color: green");
        });
        JButton1.setOnMouseExited(event ->
        {
            JButton1.setStyle("-fx-background-color: lightgray");
        });

        Button JButton2 = new Button("");
        JButton2.setLayoutX(50); JButton2.setLayoutY(120);
        JButton2.setShape(new Circle(30));
        JButton2.setMinSize(30, 30);

        JButton2.setStyle("-fx-background-color: lightgray");
        JButton2.setOnMouseEntered(event ->
        {
            JButton2.setStyle("-fx-background-color: yellow");
        });
        JButton2.setOnMouseExited(event ->
        {
            JButton2.setStyle("-fx-background-color: lightgray");
        });

        JButton1.setOnAction(event -> JButton2.setText(JTextField2.getText()));
        JButton2.setOnAction(event ->
        {
            String sss = JButton2.getText();
            JButton2.setText(JButton1.getText());
            JButton1.setText(sss);
        });

        Pane pane2 = new Pane();
        pane2.getChildren().addAll(JTextField2, JButton1, JButton2, label2);
        hBox.getChildren().addAll(JTextField2, JButton1, JButton2, label2);
    }

    @Override
    public HBox component()
    {
        return this.hBox;
    }
}
