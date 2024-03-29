//My first JavaFX Program to calculate a person's age
//2/8/2024
package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * JavaFX App
 */
public class Calculator extends Application {

    private static Scene scene;
    private static Stage primaryStage;
  

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene = new Scene(loadFXML("mainscene"), 640, 480);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Calculator.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
     

    public static void main(String[] args) {
        launch();
    }

}