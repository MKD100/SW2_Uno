/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_project;

/**
 *
 * @author matth
 */
public class Card {
    int [] hand;
    String color; 
    
    public void setColor(int i){
        if(i == 0)
            this.color="Yellow";
    }
}
