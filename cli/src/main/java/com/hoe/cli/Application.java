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

        HeroRepository hrepo = new HeroRepository();
        hrepo.getHeroes()[0].setDescription("????????????????");

        HeroRepository hrepo0 = new HeroRepository();

        System.out.println(hrepo0.getHeroes()[0].getDescription());
        
        byte i=0;
        do {            
            System.out.println(hrepo.getHeroes()[i].getName());            
            i++;         
        } while (i<hrepo.getHeroes().length);
    }
    
}
