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
    
    public Builder builder(){return new Builder(this);}

    public static class Builder{
        private Species species;

        public Builder(Species species) {
            this.species = species;
        }
        
        public Builder name(String pName){
            this.species.setName(pName);
            return this;
        }
        
        public Species build(){
            return this.species;
        }
    }
    
}
