/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.hero;

import com.hoe.cli.BaseObjectRepository;
import com.hoe.cli.BaseRepository;

/**
 *
 * @author netacademia
 */
public class HeroRepository  extends BaseObjectRepository<Hero> implements BaseRepository<Hero>{
   
    private static HeroRepository  instance;
    
    static {
        instance = new HeroRepository();
    }

    public static HeroRepository getInstance() {
        return instance;
    }
    
    
    
    {
        elements = new Hero[4] ;
        elements[0] = new Hero("PapaSmurf", ".....");
        elements[1] = new Hero("BrainySmurf", ".....");
        elements[2] = new Hero("HeftySmurf", ".....");
        elements[3] = new Hero("Smurfette", ".....");
    }
    

    @Override
    public Hero[] getElements() {
       return elements;    
    }
    
}
