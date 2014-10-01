package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LaunchApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Calculator");

        initRootLayout();
        showCalculator();
    }

    public void showCalculator() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(LaunchApp.class.getResource("calculator.fxml"));
            AnchorPane calculator = (AnchorPane) loader.load();
            rootLayout.setCenter(calculator);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(LaunchApp.class.getResource("RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
