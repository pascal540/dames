package constantes;

public class Constantes {

    // =============== CASES ================
    public final static int LARGEUR_CASE = 60;

    // ============= DAMIER ============
    public final static int NBRE_LIGNES_DAMIER = 10;

    // ============ GRILLE ==================
    public final static int POSITION_X_GRILLE = 300;
    public final static int POSITION_Y_GRILLE = 80;
    public final static int LONGUEUR_LIGNE_GRILLE = LARGEUR_CASE * NBRE_LIGNES_DAMIER;

    // ================= LIGNES ENTOURANT LE DAMIER =================
    public final static int POSITION_Y_LINE_SUP = POSITION_Y_GRILLE - 2;
    public final static int EPAISSEUR_LIGNE = 4;

}