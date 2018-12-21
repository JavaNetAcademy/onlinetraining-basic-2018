/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.hero;

import com.hoe.core.BaseObjectRepository;
import com.hoe.core.BaseRepository;

/**
 *
 * @author netacademia
 */
public class HeroRepository extends BaseObjectRepository<Hero> implements BaseRepository<Hero> {

    private static HeroRepository instance;
    private HeroFactory factory = new HeroFactory();
    
    static {
        instance = new HeroRepository();
    }

    public static HeroRepository getInstance() {
        return instance;
    }

    {
        elements = new Hero[4];
            elements[0] = factory.createWithDefaultDescription();
            elements[0].setName("PapaSmurf");
            elements[1] = factory.createWithDefaultDescription();
            elements[1].setName("BrainySmurf");
            elements[2] = factory.createWithDefaultDescription();
            elements[2].setName("HeftySmurf");
            elements[3] = factory.createWithDefaultDescription();
            elements[3].setName("Smurfette");
    }

    @Override
    public Hero[] getElements() {
        return elements;
    }

}
