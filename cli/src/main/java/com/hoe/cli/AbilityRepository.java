/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.cli;

import com.hoe.cli.BaseRepository;

/**
 *
 * @author netacademia
 */
public class AbilityRepository  extends BaseRepository<Ability>{
    private static Ability[] abilities;

    static {
        abilities = new Ability[3] ;
        abilities[0] = new Ability("magic",(byte)10,(byte)20,(byte)30);
        abilities[1] = new Ability("Teamwork",(byte)20,(byte)30,(byte)40);
        abilities[2] = new Ability("Smell",(byte)10,(byte)20,(byte)30);
    }
    

    @Override
    public Ability[] getElements() {
       return abilities;    
    }
    
}
