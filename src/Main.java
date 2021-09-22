
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Start methode appellée");
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("damier.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 800);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Jeu de Dames");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.centerOnScreen();

        // Stage fenetreDeux = new Stage();
        // fenetreDeux.setTitle("Fenetre deux");
        // fenetreDeux.setWidth(300);
        // fenetreDeux.setHeight(300);
        // fenetreDeux.show();

        // // Lambda expression
        // new Thread(() -> {
        // try {
        // Thread.sleep(5000);
        // Platform.runLater(() -> fenetreDeux.hide());
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }).start();

    }

    public static void main(String[] args) throws Exception {
        launch();

    }

    /**
     * Methode appellée avant start !
     */
    @Override
    public void init() {
        System.out.println("Init methode appellée ");
    }

}
