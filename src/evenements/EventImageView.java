package evenements;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EventImageView implements EventHandler<ActionEvent> {
    // Variables 
    private int _yPosImageView; // position en y  du pion clique
    private int _xPosImageView; // posiito nen x du pion clique

    public EventImageView(int x,int y) {
        this._xPosImageView=x;
        this._yPosImageView = y;
    
}

    @Override
    public void handle(ActionEvent e) {
        System.out.println("Image view clique");
        
    }
    
}