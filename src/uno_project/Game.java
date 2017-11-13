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
    int numberOfPlayers;
    Player p1;
    Player p2;
    Player p3;
    Player p4;
    Player p5;
    Player p6;
    Player p7;
    Player p8;
    Player p9;
    Player p10;
    Boolean reversed = false;
    Boolean skipNext = false;
    public Game(){
        Deck d = new Deck();
        d.shuffle();
    }
    public void genPlayer(int numPlayers){
        this.numberOfPlayers = numPlayers;
        if(numPlayers>1 || numPlayers<11){
            switch (numPlayers){
                case 2: 
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p1 = new Player(hand, 1);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p2 = new Player(hand, 2);
                        }
                    }
                    break;
                case 3: 
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p1 = new Player(hand,1);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p2 = new Player(hand,2);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p3 = new Player(hand,3);
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p1 = new Player(hand,1);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p2 = new Player(hand,2);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p3 = new Player(hand,3);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p4 = new Player(hand,4);
                        }
                    }
                    break;
                case 5: 
                     for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p1 = new Player(hand,1);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p2 = new Player(hand,2);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p3 = new Player(hand,3);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p4 = new Player(hand,4);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p5 = new Player(hand,5);
                        }
                    }
                    
                    break;
                case 6: 
                     for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p1 = new Player(hand,1);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p2 = new Player(hand,2);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p3 = new Player(hand,3);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p4 = new Player(hand,4);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p5 = new Player(hand,5);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p6 = new Player(hand,6);
                        }
                    }

                    break;
                case 7: 
                     for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p1 = new Player(hand,1);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p2 = new Player(hand,2);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p3 = new Player(hand,3);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p4 = new Player(hand,4);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p5 = new Player(hand,5);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p6 = new Player(hand,6);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p7 = new Player(hand,7);
                        }
                    }

                    break;
                case 8: 
                     for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p1 = new Player(hand,1);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p2 = new Player(hand,2);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p3 = new Player(hand,3);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p4 = new Player(hand,4);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p5 = new Player(hand,5);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p6 = new Player(hand,6);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p7 = new Player(hand,7);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p8 = new Player(hand,8);
                        }
                    }

                    break;
                case 9: 
                     for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p1 = new Player(hand,1);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p2 = new Player(hand,2);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p3 = new Player(hand,3);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p4 = new Player(hand,4);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p5 = new Player(hand,5);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p6 = new Player(hand,6);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p7 = new Player(hand,7);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p8 = new Player(hand,8);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p9 = new Player(hand,9);
                        }
                    }

                                       
                    break;
                case 10: 
                     for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p1 = new Player(hand,1);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p2 = new Player(hand,2);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p3 = new Player(hand,3);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p4 = new Player(hand,4);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p5 = new Player(hand,5);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p6 = new Player(hand,6);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p7 = new Player(hand,7);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p8 = new Player(hand,8);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p9 = new Player(hand,9);
                        }
                    }
                    for (int i = 0; i <= numPlayers; i++) {
                        ArrayList<Card> hand = new ArrayList<Card>();
                        for (int j = 0; j < 8; i++) {
                            hand.add(d.getCard());
                            p10 = new Player(hand,10);
                        }
                    }
                                      
                    break;
            }
        }else{
            System.out.println("too many or too few players");
        }
        
    }
    
    public int nextPlayer(int currentPlayer){
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

        return nextPlayerPID;
    }
    
    
    
    
    
}
