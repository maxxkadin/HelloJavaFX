import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    public void start(Stage stage) throws Exception {
        stage.setTitle("My First JavaFX App");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
