import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("damier.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 800);
        stage.setResizable(false);
        stage.setTitle("Jeu de Dames");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) throws Exception {
        launch();

    }
}
