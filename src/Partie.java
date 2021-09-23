import controller.DamesController;

/**
 * @pattern design pattern singleton
 */
public class Partie {
    /*
     * static veut dire que le membre appartient a lui meme et non à une instance de
     * ce type : donc une seule instance de ce membre static est crée et partagé par
     * tous les membres de la classe : ne depend pas de l'instanciation mais de la classe Partie
     */

    private static Partie _instancePartie = null; // unique
    private  DamesController _monJeu;

    private Partie() {
        _monJeu = new DamesController();
    
    }


   // methode static est accessible depuis la classe
    /**
     * 
     * @return instancePartie
     */
    public static Partie getinstancePartie() {
        if (_instancePartie == null) {
            _instancePartie = new Partie();
        }
        return _instancePartie;

    }
/**
 * Cree une nouvelle partie
 */
    public void nouvellePartie(){
        _monJeu.nouvellePartie();
        

    }

}