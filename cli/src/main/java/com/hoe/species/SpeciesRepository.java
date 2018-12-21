/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.species;

import com.hoe.core.BaseObjectRepository;
import com.hoe.core.BaseRepository;

/**
 *
 * @author netacademia
 */
public class SpeciesRepository  extends BaseObjectRepository<Species> implements BaseRepository<Species>{
private static SpeciesRepository  instance;
private SpeciesFactory factory = new SpeciesFactory();
    
    static {
        instance = new SpeciesRepository();
    }

    public static SpeciesRepository getInstance() {
        return instance;
    }
    

    {
        elements = new Species[3] ;
        elements[0] = factory.createEmpty();
        elements[0].setName("Smurf");
        
        elements[1] = factory.createEmpty();
        elements[1].setName("Orc");
        
        elements[2] = factory.createEmpty();
        elements[2].setName("Human");
    }
    

    @Override
    public Species[] getElements() {
       return elements;    
    }
    
}
