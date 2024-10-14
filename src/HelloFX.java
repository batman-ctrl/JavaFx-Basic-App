import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
       // Load the fxml file
        Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));

        Scene scene = new Scene(root,500, 500);
        stage.setTitle("Using scene builder");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
