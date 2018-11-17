/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.hero;

/**
 *
 * @author netacademia
 */
public class HeroRepository {
    private static Hero[] heroes = new Hero[4];

    static {
        heroes[0] = new Hero("PapaSmurf", ".....");
        heroes[1] = new Hero("BrainySmurf", ".....");
        heroes[2] = new Hero("HeftySmurf", ".....");
        heroes[3] = new Hero("Smurfette", ".....");
    }
    
    public HeroRepository() {
        
    }

    public Hero[] getHeroes() {
        return heroes;
    }

    public void setHeroes(Hero[] heroes) {
        this.heroes = heroes;
    }

    
    
}
