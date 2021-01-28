package edu.isu.cs.cs2263;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

import java.util.List;


public class App extends Application {

    private String test_file = "students.obj";
    private List<Student> studentList;
    private IOManager ioManager = new IOManager();

    //this is the entry point for javafx applications
    //the start method is called after init is returned and after the system is ready for the application to begin running
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Course Info");

        //label//
        Label label = new Label ( "It worked!");

        //the list of students to print


        //button// -- needs to load a list of students from JSON file and "print" to left list
        Button stud_list_loader = new Button("Click here to see students.");

        //    stud_list_loader.setonAction();

        //two lists//-- yep
        VBox left_box = new VBox(stud_list_loader, label);

        VBox right_box = new VBox();

        HBox big_box = new HBox(left_box, right_box); //big box two hold the two column VBox's

        
        Scene scene = new Scene(big_box, 400, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}