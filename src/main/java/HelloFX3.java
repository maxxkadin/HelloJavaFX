import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloFX3 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("My First JavaFX App");

        Label label = new Label("Hello World, JavaFX !");
        Scene scene = new Scene(label, 400, 200);
        scene.setCursor(Cursor.OPEN_HAND);

        stage.setScene(scene);

        stage.setX(400);
        stage.setY(400);

        stage.setWidth(300);
        stage.setHeight(300);

        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }


}
