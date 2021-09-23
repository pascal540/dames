package dessinplateau;

import constantes.Constantes;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class DessinePlateau {

    // Variables
     Group root = new Group();
     Scene scene = new Scene(root, 1024, 768, Color.BEIGE);

     Stage _primaryStage;

     /**
      * Constructeur
      * @param primaryStage
      */
     public DessinePlateau(Stage primaryStage) {
         this._primaryStage = primaryStage;
    }

    public void dessineGrille() {

        GridPane grille = new GridPane();

        for (int ligne = 0; ligne < Constantes.NBRE_LIGNES_DAMIER; ligne++) {
            for (int col = 0; col < Constantes.NBRE_LIGNES_DAMIER; col++) {
                if (ligne != Constantes.NBRE_LIGNES_DAMIER) {
                    Rectangle rectangle = new Rectangle();
                    rectangle.setWidth(Constantes.LARGEUR_CASE); // largeur case
                    rectangle.setHeight(Constantes.LARGEUR_CASE);// hauteur case

                    // toutes les deux cases
                    if ((ligne % 2 == 0 && col % 2 == 0) || (ligne % 2 != 0 && col % 2 != 0)) {
                        rectangle.setFill(Color.WHITE);
                    } else {
                        rectangle.setFill(Color.BLACK);
                    }
                    // Ajout des rectangles aux lignes colonnes
                    GridPane.setRowIndex(rectangle, ligne); // placement de 'l'enfant' rectangle'
                    GridPane.setColumnIndex(rectangle, col);
                    grille.getChildren().addAll(rectangle);
                }
            }

        }
        // Posiitonnement du damier sur la fenetre principale
        grille.setLayoutX(Constantes.POSITION_X_GRILLE);
        grille.setLayoutY(Constantes.POSITION_Y_GRILLE);

        // Ceation d'une ligne autour de la grille
        // Taille
        
        Line sup = new Line(Constantes.POSITION_X_GRILLE, Constantes.POSITION_Y_LINE_SUP,
          Constantes.POSITION_X_GRILLE + Constantes.LONGUEUR_LIGNE_GRILLE, Constantes.POSITION_Y_LINE_SUP); 
        sup.setStrokeWidth(Constantes.EPAISSEUR_LIGNE);
        sup.setStroke(Color.RED);

        Line inf = new Line(Constantes.POSITION_X_GRILLE,Constantes.POSITION_Y_LINE_SUP +Constantes.LONGUEUR_LIGNE_GRILLE+Constantes.EPAISSEUR_LIGNE,
             Constantes.POSITION_X_GRILLE + Constantes.LONGUEUR_LIGNE_GRILLE, Constantes.POSITION_Y_LINE_SUP+Constantes.LONGUEUR_LIGNE_GRILLE+Constantes.EPAISSEUR_LIGNE);
        inf.setStrokeWidth(Constantes.EPAISSEUR_LIGNE);
        inf.setStroke(Color.RED);

        Line gauche = new Line(Constantes.POSITION_X_GRILLE, Constantes.POSITION_Y_LINE_SUP,
             Constantes.POSITION_X_GRILLE, Constantes.POSITION_Y_GRILLE+Constantes.LONGUEUR_LIGNE_GRILLE);
        gauche.setStrokeWidth(Constantes.EPAISSEUR_LIGNE);
        gauche.setStroke(Color.RED);

        Line droite = new Line(Constantes.POSITION_X_GRILLE + Constantes.LONGUEUR_LIGNE_GRILLE,
                Constantes.POSITION_Y_LINE_SUP, Constantes.POSITION_X_GRILLE + Constantes.LONGUEUR_LIGNE_GRILLE,
                Constantes.POSITION_Y_GRILLE + Constantes.LONGUEUR_LIGNE_GRILLE);
        droite.setStrokeWidth(Constantes.EPAISSEUR_LIGNE);
        droite.setStroke(Color.RED);

        // ajout de tous les elements crés sur la grille sur la fenetre principale
        // 'root'
        root.getChildren().addAll(grille, sup, inf, gauche,droite );
        this._primaryStage.setTitle("Jeu de Dames");
        this._primaryStage.setResizable(false);
        this._primaryStage.setScene(scene);
        this._primaryStage.show();
        this._primaryStage.setAlwaysOnTop(true);
        this._primaryStage.centerOnScreen();
    }
}
