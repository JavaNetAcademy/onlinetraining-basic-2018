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
   private AbilityFactory factory = new AbilityFactory();
    static {
        instance = new AbilityRepository();
    }

    public static AbilityRepository getInstance() {
        return instance;
    }
    

    {
        elements = new Ability[3] ;
        elements[0] = factory.createWithDefaultValues().builder().name("magic").build();
        elements[1] = factory.createWithDefaultValues().builder().name("Teamwork").build();
        elements[2] = factory.createWithDefaultValues().builder().name("Smell").build();
    }
    

    @Override
    public Ability[] getElements() {
       return elements;    
    }
    
}
