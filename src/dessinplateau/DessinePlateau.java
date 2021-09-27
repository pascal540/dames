package dessinplateau;

import constantes.Constantes;
// import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
// import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
// import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DessinePlateau {

    // Variables
    Group root = new Group();
    Scene scene = new Scene(root, 1024, 768, Color.BEIGE);

    private Stage _primaryStage;
    private GridPane _grille;
    private StackPane _stackpane;
    private Image _pionNoir;
    private Image _pionBlanc;

    /**
     * Constructeur
     * 
     * @param primaryStage
     */
    public DessinePlateau(Stage primaryStage) {
        this._primaryStage = primaryStage;
        this._grille = new GridPane();
        // this._stackpane = new StackPane();
        this._pionNoir = new Image("/images/pionn.png");
        this._pionBlanc = new Image("/images/pionb.png");
        // this._pionBlanc = new Image("/images/pion_test.png");

    }

    public void dessineGrille() {

        for (int ligne = 0; ligne < Constantes.NBRE_LIGNES_DAMIER; ligne++) {
            for (int col = 0; col < Constantes.NBRE_LIGNES_DAMIER; col++) {
                if (ligne != Constantes.NBRE_LIGNES_DAMIER) {
                    _stackpane = new StackPane();

                    Rectangle rectangle = new Rectangle(Constantes.LARGEUR_CASE, Constantes.LARGEUR_CASE);

                    _stackpane.getChildren().add(rectangle);
                    ImageView imageView = new ImageView(); // ajout imageview

                    // toutes les deux cases
                    if ((ligne % 2 == 0 && col % 2 == 0) || (ligne % 2 != 0 && col % 2 != 0)) {
                        // cases 'blanches'
                        rectangle.setFill(Color.valueOf("#856D4D"));

                    } else {
                        // cases 'noires'
                        rectangle.setFill(Color.valueOf("#4E3D28"));
                        if (ligne < 4) {
                            imageView.setImage(this._pionNoir);

                        } else if (ligne > 5) {
                            imageView.setImage(this._pionBlanc);
                        }
                    }

                    _stackpane.getChildren().add(imageView);

                    // Ajout des rectangles aux lignes colonnes
                    this._grille.getChildren().add(_stackpane);

                    // GridPane.setRowIndex(rectangle, ligne); // placement de
                    // GridPane.setColumnIndex(rectangle, col); // colo col

                    GridPane.setRowIndex(_stackpane, ligne);
                    GridPane.setColumnIndex(_stackpane, col);

                    // GridPane.setRowIndex(imageView, ligne); // placement d'un
                    // GridPane.setColumnIndex(imageView, col); // colo col

                }
            }

        }
        // Posiitonnement du damier sur la fenetre principale
        this._grille.setLayoutX(Constantes.POSITION_X_GRILLE);
        this._grille.setLayoutY(Constantes.POSITION_Y_GRILLE);

        // Ceation d'une ligne autour de la grille
        // Taille

        Line sup = new Line(Constantes.POSITION_X_GRILLE, Constantes.POSITION_Y_LINE_SUP,
                Constantes.POSITION_X_GRILLE + Constantes.LONGUEUR_LIGNE_GRILLE, Constantes.POSITION_Y_LINE_SUP);
        sup.setStrokeWidth(Constantes.EPAISSEUR_LIGNE);
        sup.setStroke(Color.RED);

        Line inf = new Line(Constantes.POSITION_X_GRILLE,
                Constantes.POSITION_Y_LINE_SUP + Constantes.LONGUEUR_LIGNE_GRILLE + Constantes.EPAISSEUR_LIGNE,
                Constantes.POSITION_X_GRILLE + Constantes.LONGUEUR_LIGNE_GRILLE,
                Constantes.POSITION_Y_LINE_SUP + Constantes.LONGUEUR_LIGNE_GRILLE + Constantes.EPAISSEUR_LIGNE);
        inf.setStrokeWidth(Constantes.EPAISSEUR_LIGNE);
        inf.setStroke(Color.RED);

        Line gauche = new Line(Constantes.POSITION_X_GRILLE, Constantes.POSITION_Y_LINE_SUP,
                Constantes.POSITION_X_GRILLE, Constantes.POSITION_Y_GRILLE + Constantes.LONGUEUR_LIGNE_GRILLE);
        gauche.setStrokeWidth(Constantes.EPAISSEUR_LIGNE);
        gauche.setStroke(Color.RED);

        Line droite = new Line(Constantes.POSITION_X_GRILLE + Constantes.LONGUEUR_LIGNE_GRILLE,
                Constantes.POSITION_Y_LINE_SUP, Constantes.POSITION_X_GRILLE + Constantes.LONGUEUR_LIGNE_GRILLE,
                Constantes.POSITION_Y_GRILLE + Constantes.LONGUEUR_LIGNE_GRILLE);
        droite.setStrokeWidth(Constantes.EPAISSEUR_LIGNE);
        droite.setStroke(Color.RED);

        // ajout de tous les elements dans le groupe principal 'root'
        root.getChildren().addAll(this._grille, sup, inf, gauche, droite);
        this._primaryStage.setTitle("Jeu de Dames");
        this._primaryStage.setResizable(false);
        this._primaryStage.setScene(scene);
        this._primaryStage.show();
        this._primaryStage.setAlwaysOnTop(true);
        this._primaryStage.centerOnScreen();
    }

    /**
     * Affichae des 20 pions de couleur sur l'echiquier
     */
    public void creerPionsDansGrille() {

        // imageView.S
        // this._grille.getChildren().add(new ImageView(image));
        // root.getChildren().add(this._grille);

    }
}
