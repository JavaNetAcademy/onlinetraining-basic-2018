/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.ability;

import com.hoe.core.BaseObjectRepository;
import com.hoe.core.BaseRepository;

/**
 *
 * @author netacademia
 */
public class AbilityRepository  extends BaseObjectRepository<Ability> implements BaseRepository<Ability>{
   private static AbilityRepository  instance;
    static {
        instance = new AbilityRepository();
    }

    public static AbilityRepository getInstance() {
        return instance;
    }
    

    {
        elements = new Ability[3] ;
        elements[0] = new Ability("magic",(byte)10,(byte)20,(byte)30);
        elements[1] = new Ability("Teamwork",(byte)20,(byte)30,(byte)40);
        elements[2] = new Ability("Smell",(byte)10,(byte)20,(byte)30);
    }
    

    @Override
    public Ability[] getElements() {
       return elements;    
    }
    
}
