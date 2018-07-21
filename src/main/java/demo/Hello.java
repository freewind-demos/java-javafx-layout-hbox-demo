package demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        HBox root = new HBox() {{
            getChildren().addAll(new Button("hello"), new Button("javafx"), new Button("HBox"));
            this.setSpacing(10);
            this.setPadding(new Insets(10.0));
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}