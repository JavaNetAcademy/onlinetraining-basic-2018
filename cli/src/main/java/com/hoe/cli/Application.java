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
        Hero hero = new Hero("PapaSmurf", ".....");
        System.out.println(hero.getName());
        System.out.println(hero.getDescription());
    }
    
}
