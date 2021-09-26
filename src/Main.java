
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

    // private void textDisplay(GridPane grid, String theText, int row, int col) {
    // Text text = new Text();
    // text.setWrappingWidth(50);
    // text.setText(theText);
    // text.setTextAlignment(TextAlignment.CENTER);
    // GridPane.setRowIndex(text, row);
    // GridPane.setColumnIndex(text, col);
    // grid.getChildren().addAll(text);
    // }

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
