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
    /*
        color key 
        red=0
        green=1
        blue=2
        yellow=3
        special=4
    */
    String color;
    /*
        Skip
        Reverse
        Wild
        Wild+
    */
    String num;
    
    public void setColor(int i){
        if(i == 0){
            this.color="red";
        }
        if(i == 1){
            this.color="green";
        }
        if(i == 2){
            this.color="blue";
        }        
        if(i == 3){
            this.color="Yellow";
        }        
    }
    public void setNumber(int i){
        if(i > 0 || i <11){
            this.num = Integer.toString(i);
        }
        //SKIP
        if(i==11){
            this.num = "Skip";
        }
        //REVERSE
        if(i==12){
            this.num = "Reverse";
        }
        //WILD
        if(i==13){
            this.num = "Wild";
        }       
        //WILD +4
        if(i==14){
            this.num = "Wild+4";
        }     
    }
    
}
