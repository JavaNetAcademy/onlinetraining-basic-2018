/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.hero;

import com.hoe.cli.BaseRepository;

/**
 *
 * @author netacademia
 */
public class HeroRepository  extends BaseRepository<Hero>{
    private static Hero[] heroes;

    static {
        heroes = new Hero[4] ;
        heroes[0] = new Hero("PapaSmurf", ".....");
        heroes[1] = new Hero("BrainySmurf", ".....");
        heroes[2] = new Hero("HeftySmurf", ".....");
        heroes[3] = new Hero("Smurfette", ".....");
    }
    

    @Override
    public Hero[] getElements() {
       return heroes;    
    }
    
}
