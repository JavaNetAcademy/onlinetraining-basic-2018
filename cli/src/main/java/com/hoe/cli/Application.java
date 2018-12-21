/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.cli;

import com.hoe.ability.AbilityRepository;
import com.hoe.core.BaseRepository;
import com.hoe.species.Species;
import com.hoe.species.SpeciesRepository;
import com.hoe.hero.HeroRepository;

/**
 *
 * @author netacademia
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    
    
    public static BaseRepository repositoryFactory(RepositoryType pType){
        if(pType == RepositoryType.HERO)
            return HeroRepository.getInstance();
        else if(pType == RepositoryType.SPECIES)
            return SpeciesRepository.getInstance();
        else 
            return AbilityRepository.getInstance();
    }
    
    private static HeroRepository heroService = (HeroRepository) repositoryFactory(RepositoryType.HERO);
    private static SpeciesRepository speciesService = SpeciesRepository.class.cast(repositoryFactory(RepositoryType.SPECIES));
    
    
    public static void main(String[] args) {
        
       heroService.getElements()[0].setDescription("????????????????");
 
        System.out.println(HeroRepository.getInstance().getElements()[0].getDescription());
        
        byte i=0;
        do {            
            System.out.print(HeroRepository.getInstance().getElements()[i].getName()+" - ");            
            System.out.println(HeroRepository.getInstance().getElements()[i].getDescription());            
            i++;         
        } while (i<HeroRepository.getInstance().getElements().length);
        
        for(Species s:speciesService.getElements()){
            System.out.println(s.getName());
        }
    }
    
}
