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

        HeroRepository.getHeroes()[0].setDescription("????????????????");

        System.out.println(HeroRepository.getHeroes()[0].getDescription());
        
        byte i=0;
        do {            
            System.out.println(HeroRepository.getHeroes()[i].getName());            
            i++;         
        } while (i<HeroRepository.getHeroes().length);
    }
    
}
