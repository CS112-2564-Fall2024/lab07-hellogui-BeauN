package edu.miracosta.cs112.lab07;//package name here depending on your IDE

import javafx.application.Application;  //abstract class used for JavaFX GUI's
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;              //class for GUI window
import javafx.scene.Scene;              //class for specific view in GUI window
import javafx.scene.layout.VBox;        //class for layout pane, organized top-to-bottom
import javafx.scene.control.Label;      //class for label component
import javafx.scene.control.Button;     //class for button component
import javafx.event.EventHandler;       //interface for handling events
import javafx.event.ActionEvent;        //class for type of event for action (like button or key pressed)
import javafx.scene.layout.Pane;
public class HelloApplication extends Application implements EventHandler<ActionEvent>  { //inheriting core functionality + this class will handle events
    /*** GUI COMPONENTS ***/
    // TODO: follow step 25 in README.md to create reference variables

    /*** DRIVER main ***/
    public static void main(String[] args) {
        launch(args); //method from Application class, must be called to setup javafx application
    }

    // TODO: follow steps 2-9 in README.md to create a start method
    Label label = new Label("WHFUIWHSEGOIESGHOIG");
    Button button = new Button("IF YOU CLICK ME I WILL EXPLODE");
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("A VIRUS WAAAAAAHGN beau nicholas");
        StackPane layout = new StackPane();
        //launch sets up core varablies
        //init is with variables with dependencies
        //start is the old main
        //stop cleans up your resources! You lazy slob!

        //stackpane smashes everything on top of each other, based on order.
        //first thing made, first thing displayed.

        //a border pane seperates parts of the window, and can be used to display things! you can also have panes in panes!
        //A button can be inside a pane as it's own pane!
        //meanwhile, if i just wanted a wall of text, i'd just have one pane, less thou wanted a fancy layout.

        //so: a pane for text, a pane for an image next to it, then a pane in a pane for a button!

        //anchorpane also sets panes to a certain location, and won't change with resizing! Maybe!

        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        // TODO: follow steps 10-21 in README.md to add objects to your layout (inside start)


        label.setText("IM GONNA BLOW");

        //WHY NO CHILDRNE????
        layout.getChildren().add(label);
        AnchorPane anchorPane = new AnchorPane();
        //above, the label is auto crated in the center. below, it sets it to a certain position.
        anchorPane.setBottomAnchor(label, 100.0);
        anchorPane.setRightAnchor(label, 150.0);
        anchorPane.getChildren().add(label);
        layout.getChildren().add(anchorPane);
        //the layout possesses all the children(in this case, labels. can be objects!)
        //the anchor then gets the children from layout, and puts it inside of itself!
        //the anchor assigns some special features to the label(position)
        //then the layout gets the special changes from the anchor!


        anchorPane.setBottomAnchor(button, 0.0);
        anchorPane.setLeftAnchor(button, 0.0);
        anchorPane.getChildren().add(button);
        button.setOnAction(this);
        //this button stick to the bottom left regardless of window size...
        //but the label moves around!

        //it makes sense for the button to be in the bottom left, as it is 0,0, typically the bottom left in most maps/graphs.
        //perhaps RightAnchor is making comparisons for the right of the screen?



        //now lets add an event handler!

    }
    public void handle(ActionEvent e)  {
       if(e.getSource() == button)
       {
           label.setText("IM EXPPPDLLLINGNGG");
       }

    }


    // TODO: follow steps 22-34 in README.md to create an event handler
}