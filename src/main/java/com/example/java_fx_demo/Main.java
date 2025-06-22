package com.example.java_fx_demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.*;
import javax.swing.*;
import com.github.sar

import java.io.IOException;

class Screen
{
    private static final GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
    private static final Rectangle bounds = g.getMaximumWindowBounds();
    private static final double width = bounds.width;
    private static final double height = bounds.height;
    public static double getWidth()
    {
        return width;
    }
    public static double getHeight()
    {
        return height;
    }
}

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), Screen.getWidth() - 5, Screen.getHeight() - 35);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}