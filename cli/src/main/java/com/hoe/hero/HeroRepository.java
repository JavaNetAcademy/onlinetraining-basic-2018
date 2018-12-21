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

    private static final Hero heroWithDefaultDescription = new Hero("", "DEF. DESC");

    private static HeroRepository instance;

    static {
        instance = new HeroRepository();
    }

    public static HeroRepository getInstance() {
        return instance;
    }

    {
        elements = new Hero[4];
        try {
            elements[0] = heroWithDefaultDescription.clone();
            elements[0].setName("PapaSmurf");
        } catch (CloneNotSupportedException e) {
        }
        try {
            elements[1] = heroWithDefaultDescription.clone();
            elements[1].setName("BrainySmurf");
        } catch (CloneNotSupportedException e) {
        }
        try {
            elements[2] = heroWithDefaultDescription.clone();
            elements[2].setName("HeftySmurf");
        } catch (CloneNotSupportedException e) {
        }
        try {
            elements[3] = heroWithDefaultDescription.clone();
            elements[3].setName("Smurfette");
        } catch (CloneNotSupportedException e) {
        }
    }

    @Override
    public Hero[] getElements() {
        return elements;
    }

}
