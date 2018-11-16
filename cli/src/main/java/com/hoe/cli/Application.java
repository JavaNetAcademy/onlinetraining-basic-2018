/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.cli;

import com.hoe.hero.Hero;

/**
 *
 * @author netacademia
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hero[] heroes = new Hero[4];
                
        
        heroes[0] = new Hero("PapaSmurf", ".....");
        heroes[1] = new Hero("BrainySmurf", ".....");
        heroes[2] = new Hero("HeftySmurf", ".....");
        heroes[3] = new Hero("Smurfette", ".....");

        byte i=0;
        do {            
            System.out.println(heroes[i].getName());            
            i++;         
        } while (i<heroes.length);
    }
    
}
