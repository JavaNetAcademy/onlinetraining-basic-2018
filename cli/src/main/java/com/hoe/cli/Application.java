/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.cli;

import com.hoe.hero.Hero;
import com.hoe.hero.HeroRepository;

/**
 *
 * @author netacademia
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HeroRepository  hrepo = new HeroRepository();
        
        
        SpeciesRepository  srepo = new SpeciesRepository();

        hrepo.getElements()[0].setDescription("????????????????");

        System.out.println(hrepo.getElements()[0].getDescription());
        
        byte i=0;
        do {            
            System.out.println(hrepo.getElements()[i].getName());            
            i++;         
        } while (i<hrepo.getElements().length);
        
        for(Species s: srepo.getElements()){
            System.out.println(s.getName());
        }
    }
    
}
