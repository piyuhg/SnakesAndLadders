/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package snakesandladders;

/**
 *
 * @author PIYUSH GUPTA
 */
public class Player {
    String playerColor;
    String playerName;
    javax.swing.JLabel pawnPosition;
    Boolean inPlay;

    public Player(String playerColor, String playerName, javax.swing.JLabel pawnPosition){
        this.playerColor = playerColor;
        this.playerName = playerName;
        this.pawnPosition = pawnPosition;
        inPlay = true;
    }

}
