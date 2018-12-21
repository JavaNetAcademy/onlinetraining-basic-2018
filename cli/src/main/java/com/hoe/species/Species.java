/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.species;

import com.hoe.core.BasicData;

/**
 *
 * @author netacademia
 */
public class Species extends BasicData implements Cloneable{

    public Species() {
    }

    public Species(String name) {
        super(name);
    }

    @Override
    public Species clone() throws CloneNotSupportedException {
        return new Species(name);
    }

    
}
