/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_project;

import java.util.ArrayList;

/**
 *this class is for the came play Mechanics
 * player order 
 * check if cars are valid 
 * etc
 * @author matth
 */

public class Game {
    Deck d;
    Deck discard;
    Card topCard;
    int cardColor;//"Red", "Yellow", "Blue", "Green", "Wild"
    int numberOfPlayers;
    int currentPlayer = 0;
    ArrayList<Player> playerGroup = new ArrayList<Player>();
    Player p; 

    Boolean reversed = false;
    Boolean skipNext = false;
    public Game(){
        Deck d = new Deck();
        d.shuffle();
        topCard=d.getCard();
    }
    public void genPlayer(int numPlayers){
        this.numberOfPlayers = numPlayers;
        if(numPlayers>1 || numPlayers<11){
            for(int i=0; i<=numPlayers; i++){
                p = new Player(d.makeHand(), i);
                playerGroup.add(p);
            }
        }else{
            System.out.println("too many or too few players");
        }
        
    }
    
    public void nextPlayer(int currentPlayer){
        int nextPlayerPID;
        
        if (!reversed && !skipNext) {
            nextPlayerPID = currentPlayer + 1;
        } else if (reversed && !skipNext) {
            if (currentPlayer == 1) {
                nextPlayerPID = numberOfPlayers;
            } else {
                nextPlayerPID = currentPlayer - 1;
            }
        } else if (!reversed && skipNext) {
            nextPlayerPID = currentPlayer + 2;
        } else if (reversed && skipNext) {
            if (currentPlayer == 2) {
                nextPlayerPID = numberOfPlayers;
            } else {
                nextPlayerPID = currentPlayer - 2;
            }
        }else{
            nextPlayerPID = 0;
        }
        
        this.currentPlayer=nextPlayerPID;
    }
    
    //this is what determines if a discard is valid and what actions should be taken
    public void discard(Card c){
        if(topCard.getColor()==c.getColor() || topCard.getValue()==c.getValue()){
            topCard=c;
            if(topCard.getValue()==12 || topCard.getValue()==14){//current top card is a draw 2 or draw4 Wild card
                //card the current player is putting down is NOT a draw 2 or draw4 Wild card
                //Player draws cards and cannot discard
                if (c.getValue() == 12 || c.getValue() == 14) {
                    nextPlayer(currentPlayer);
                    if (c.getValue() == 12) {//draw 2
                        for (int i = 0; i < 3; i++) {
                            playerGroup.get(currentPlayer).drawCard(d.getCard());
                        }
                    }
                    if (c.getValue() == 12) {//draw 4
                        for (int i = 0; i < 5; i++) {
                            playerGroup.get(currentPlayer).drawCard(d.getCard());
                        }
                    }
                }else{
                    if(c.getValue()==12){//draw 2
                        
                    }
                    if(c.getValue()==14){//draw 4 color change
                        
                    }
                }
            }
        }
    }
    
    
    
    
}
