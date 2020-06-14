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

public class Group5 implements ComponentLinker
{
    private HBox hBox;
    @Override
    public void link()
    {
        //GROUP 5!!!!!
        Label label5 = new Label("Group #5");
        label5.setLayoutX(50); label5.setLayoutY(10);

        TextField JTextField5 = new TextField();
        JTextField5.setLayoutX(50); JTextField5.setLayoutY(40);

        Button JButton11 = new Button("");
        JButton11.setLayoutX(50); JButton11.setLayoutY(80);
        JButton11.setShape(new Circle(30));
        JButton11.setMinSize(30, 30);

        JButton11.setStyle("-fx-background-color: lightgray");
        JButton11.setOnMouseEntered(event ->
        {
            JButton11.setStyle("-fx-background-color: purple");
        });
        JButton11.setOnMouseExited(event ->
        {
            JButton11.setStyle("-fx-background-color: lightgray");
        });

        Button JButton22 = new Button("");
        JButton22.setLayoutX(100); JButton22.setLayoutY(80);
        JButton22.setShape(new Circle(30));
        JButton22.setMinSize(30, 30);

        JButton22.setStyle("-fx-background-color: lightgray");
        JButton22.setOnMouseEntered(event ->
        {
            JButton22.setStyle("-fx-background-color: orange");
        });
        JButton22.setOnMouseExited(event ->
        {
            JButton22.setStyle("-fx-background-color: lightgray");
        });

        Button JButton33 = new Button("");
        JButton33.setLayoutX(150); JButton33.setLayoutY(80);
        JButton33.setShape(new Circle(30));
        JButton33.setMinSize(30, 30);

        JButton33.setStyle("-fx-background-color: lightgray");
        JButton33.setOnMouseEntered(event ->
        {
            JButton33.setStyle("-fx-background-color: brown");
        });
        JButton33.setOnMouseExited(event ->
        {
            JButton33.setStyle("-fx-background-color: lightgray");
        });


        TableColumn col1 = new TableColumn("X");
        col1.setCellValueFactory(new PropertyValueFactory("Key"));
        TableColumn col2 = new TableColumn("Y");
        col2.setCellValueFactory(new PropertyValueFactory<>("Value"));
        col1.setPrefWidth(100); col2.setPrefWidth(100);


        ObservableList<Pair<String, String>> data = FXCollections.observableArrayList(new Pair<String, String>("1", "2"));
        TableView JTable = new TableView();
        JTable.setLayoutX(50); JTable.setLayoutY(120);

        JTable.getColumns().addAll(col1, col2);
        JTable.setItems(data);
        JTable.setPrefWidth(200);
        JTable.setPrefHeight(200);
        data.clear();

        //Pair p1 = new Pair("3","4");

        JButton11.setOnAction(event ->
        {
            boolean key = false;
            for (int i = 0; i < data.size(); i++)
            {
                if (data.get(i).getKey().equals(""))
                {
                    Pair<String, String> temp = data.get(i);
                    data.set(i, new Pair<String, String>(JTextField5.getText(), temp.getValue()));
                    key = true;
                    break;
                }
            }
            if (!key)
            {
                data.add(new Pair<String, String>(JTextField5.getText(), ""));
            }
        });

        JButton22.setOnAction(event ->
        {
            boolean key = false;
            String value = "";
            for (int i = data.size() - 1; i >= 0; i--)
            {
                if (!data.get(i).getKey().isEmpty())
                {
                    value = data.get(i).getKey();
                    String temp = data.get(i).getValue();
                    data.set(i, new Pair<String, String>("", temp));
                    key = true;
                    break;
                }
            }
            if (key)
            {
                boolean newKey = false;
                for (int i = 0; i < data.size(); i++)
                {
                    if (data.get(i).getValue().isEmpty())
                    {
                        String temp = data.get(i).getKey();
                        data.set(i, new Pair<String, String>(temp, value));
                        newKey = true;
                        break;
                    }
                }
                if (!newKey)
                {
                    data.add(new Pair<String, String>("", value));
                }
            }


        });

        JButton33.setOnAction(event ->
        {
            boolean key = false;
            String value = "";
            for (int i = data.size() - 1; i >= 0; i--)
            {
                if (!data.get(i).getValue().isEmpty())
                {
                    value = data.get(i).getValue();
                    String temp = data.get(i).getKey();
                    data.set(i, new Pair<String, String>(temp, ""));
                    key = true;
                    break;
                }
            }
            if (key)
            {
                boolean newKey = false;
                for (int i = 0; i < data.size(); i++)
                {
                    if (data.get(i).getKey().isEmpty())
                    {
                        String temp = data.get(i).getValue();
                        data.set(i, new Pair<String, String>(value, temp));
                        newKey = true;
                        break;
                    }
                }
                if (!newKey)
                {
                    data.add(new Pair<String, String>(value, ""));
                }
            }

        });

        //Table JTable = new JTable();
        //


        Pane pane5 = new Pane();
        pane5.getChildren().addAll(JTextField5, label5, JButton11, JButton22, JButton33, JTable);
        hBox.getChildren().addAll(JTextField5, label5, JButton11, JButton22, JButton33, JTable);
    }

    @Override
    public HBox component()
    {
        return this.hBox;
    }
}
