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

public class Group3 implements ComponentLinker
{
    private HBox hBox;

    private void showRadioButtonError()
    {
        Alert alert1 = new Alert(AlertType.ERROR);
        alert1.setTitle("ERROR MESSAGE!!!");
        alert1.setHeaderText("Error type: radiobutton error");
        alert1.setContentText("There is no such radiobutton in the list!");

        alert1.showAndWait();
    }

    @Override
    public void link()
    {
        //GROUP 3!!!!!
        Label label3 = new Label("Group #3");
        label3.setLayoutX(50); label3.setLayoutY(10);

        TextField JTextField3 = new TextField();
        JTextField3.setLayoutX(50); JTextField3.setLayoutY(40);

        Button JButton3 = new Button("");
        JButton3.setLayoutX(50); JButton3.setLayoutY(80);
        JButton3.setShape(new Circle(30));
        JButton3.setMinSize(30, 30);

        JButton3.setStyle("-fx-background-color: lightgray");
        JButton3.setOnMouseEntered(event ->
        {
            JButton3.setStyle("-fx-background-color: lightblue");
        });
        JButton3.setOnMouseExited(event ->
        {
            JButton3.setStyle("-fx-background-color: lightgray");
        });

        RadioButton JRadioButton1 = new RadioButton("R1");
        JRadioButton1.setLayoutX(50); JRadioButton1.setLayoutY(120);

        RadioButton JRadioButton2 = new RadioButton("R2");
        JRadioButton2.setLayoutX(50); JRadioButton2.setLayoutY(140);

        RadioButton JRadioButton3 = new RadioButton("R3");
        JRadioButton3.setLayoutX(50); JRadioButton3.setLayoutY(160);

        /*ToggleGroup togglegroup = new ToggleGroup();
        JRadioButton1.setToggleGroup(togglegroup);
        JRadioButton2.setToggleGroup(togglegroup);
        JRadioButton3.setToggleGroup(togglegroup);*/

        //JRadioButton1.setSelected(true);

        JButton3.setOnAction(event ->
        {
            if( JTextField3.getText().equals(JRadioButton1.getText()) )
            {
                JRadioButton1.setSelected(true);
                JRadioButton2.setSelected(false);
                JRadioButton3.setSelected(false);
            }
            else
            if( JTextField3.getText().equals(JRadioButton2.getText()) )
            {
                JRadioButton1.setSelected(false);
                JRadioButton2.setSelected(true);
                JRadioButton3.setSelected(false);
            }
            else
            if( JTextField3.getText().equals(JRadioButton3.getText()) )
            {
                JRadioButton1.setSelected(false);
                JRadioButton2.setSelected(false);
                JRadioButton3.setSelected(true);
            }
            else showRadioButtonError();
        });

        Pane pane3 = new Pane();
        pane3.getChildren().addAll(JTextField3, JButton3, JRadioButton1, JRadioButton2, JRadioButton3, label3);
        hBox.getChildren().addAll(JTextField3, JButton3, JRadioButton1, JRadioButton2, JRadioButton3, label3);
    }

    @Override
    public HBox component()
    {
        return this.hBox;
    }
}
