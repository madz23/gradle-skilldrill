package edu.isu.cs.cs2263.javafx;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    //this is the entry point for javafx applications
    //the start method is called after init is returned and after the system is ready for the application to begin running
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Did it work?");

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}