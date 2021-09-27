
// import javafx.scene.Group;
import dessinplateau.DessinePlateau;
import javafx.application.Application;

// import javafx.fxml.FXMLLoader;
// import javafx.scene.Scene;
// import javafx.scene.layout.GridPane;
// import javafx.scene.paint.Color;
// import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
       
         Partie.getinstancePartie().nouvellePartie();// Creation d'une nouvelle partie
          DessinePlateau dessinePlateau= new DessinePlateau(primaryStage);
           dessinePlateau.dessineGrille();
               

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
