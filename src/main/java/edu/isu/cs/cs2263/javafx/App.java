package edu.isu.cs.cs2263.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.VBox;





public class App extends Application {

    //this is the entry point for javafx applications
    //the start method is called after init is returned and after the system is ready for the application to begin running
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Course Info");

        //label//
        Label label = new Label ( "It worked!");


        //button// -- needs to load a list of students from JSON file and "print" to left list
        Button stud_list_loader = new Button("Click here to see students.");

        //    stud_list_loader.setonAction();

        //two lists//-- yep
        VBox left_box = new VBox(stud_list_loader, label);
        VBox right_box = new VBox();

        Scene scene = new Scene(left_box, 400, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}