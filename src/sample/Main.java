package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
import java.util.ArrayList;
import java.util.List;
//import java.lang.String;
//import javax.swing.table.TableColumn;

public class Main extends Application
{
    public static void main(String[] args){ launch(args); }

    public void start(Stage primaryStage)
    {
        VBox root = new VBox();

        List<ComponentLinker> linkers = new ArrayList<>();
        linkers.add(new Group1());
        linkers.add(new Group2());
        linkers.add(new Group3());
        linkers.add(new Group4());
        linkers.add(new Group5());

        List<HBox> groups = new ArrayList<>();
        for (ComponentLinker linker : linkers)
        {
            linker.link();
            groups.add(linker.component());
        }
        root.getChildren().addAll(groups);


        Scene scene = new Scene(root, 1100, 400);
        primaryStage.setTitle("PPvIS Laba1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
