import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Input fields
        Label label = new Label("Enter your name :");
        TextField textField = new TextField();

        // Button
        Button button = new Button("Submit");
        Label outputLabel = new Label();


        // Add an action/event
        button.setOnAction(e-> outputLabel.setText("Hello,"+textField.getText()+"!"));

        // Using vertical layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, textField, button, outputLabel);

        // Make a scene
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Simple JavaFx App");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
