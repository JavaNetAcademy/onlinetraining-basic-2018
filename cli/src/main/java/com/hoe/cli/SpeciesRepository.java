/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.cli;

import com.hoe.hero.*;
import com.hoe.cli.BaseRepository;

/**
 *
 * @author netacademia
 */
public class SpeciesRepository  extends BaseRepository<Species>{
    private static Species[] species;

    static {
        species = new Species[3] ;
        species[0] = new Species("Smurf");
        species[1] = new Species("Orc");
        species[2] = new Species("Human");
    }
    

    @Override
    public Species[] getElements() {
       return species;    
    }
    
}
