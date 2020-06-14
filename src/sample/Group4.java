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

public class Group4 implements ComponentLinker
{
    private HBox hBox;

    private void showCheckBoxError()
    {
        Alert alert2 = new Alert(AlertType.ERROR);
        alert2.setTitle("ERROR MESSAGE!!!");
        alert2.setHeaderText("Error type: checkbox error");
        alert2.setContentText("There is no such checkbox in the list!");

        alert2.showAndWait();
    }

    @Override
    public void link()
    {
        //GROUP 4!!!!!
        Label label4 = new Label("Group #4");
        label4.setLayoutX(50); label4.setLayoutY(10);

        TextField JTextField4 = new TextField();
        JTextField4.setLayoutX(50); JTextField4.setLayoutY(40);

        Button JButton4 = new Button("");
        JButton4.setLayoutX(50); JButton4.setLayoutY(80);
        JButton4.setShape(new Circle(30));
        JButton4.setMinSize(30, 30);

        JButton4.setStyle("-fx-background-color: lightgray");
        JButton4.setOnMouseEntered(event ->
        {
            JButton4.setStyle("-fx-background-color: pink");
        });
        JButton4.setOnMouseExited(event ->
        {
            JButton4.setStyle("-fx-background-color: lightgray");
        });

        CheckBox JCheckBox1 = new CheckBox("Ch1");
        JCheckBox1.setLayoutX(50); JCheckBox1.setLayoutY(120);

        CheckBox JCheckBox2 = new CheckBox("Ch2");
        JCheckBox2.setLayoutX(50); JCheckBox2.setLayoutY(140);

        CheckBox JCheckBox3 = new CheckBox("Ch3");
        JCheckBox3.setLayoutX(50); JCheckBox3.setLayoutY(160);

        JButton4.setOnAction(event ->
        {
            if( JTextField4.getText().equals(JCheckBox1.getText()) )
            {
                JCheckBox1.fire();
            }
            else
            if( JTextField4.getText().equals(JCheckBox2.getText()) )
            {
                JCheckBox2.fire();
            }
            else
            if( JTextField4.getText().equals(JCheckBox3.getText()) )
            {
                JCheckBox3.fire();
            }
            else showCheckBoxError();
        });

        Pane pane4 = new Pane();
        pane4.getChildren().addAll(JTextField4, JButton4, label4, JCheckBox1, JCheckBox2, JCheckBox3);
        hBox.getChildren().addAll(JTextField4, JButton4, label4, JCheckBox1, JCheckBox2, JCheckBox3);
    }

    @Override
    public HBox component()
    {
        return this.hBox;
    }
}
