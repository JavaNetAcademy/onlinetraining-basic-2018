/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.hero;

import com.hoe.core.BasicData;

/**
 *
 * @author netacademia
 */
public  class Hero extends BasicData implements Cloneable{
    private String description;

    public Hero() {}
    
    public Hero(String name, String description) {
        super(name);
        this.description = description;
    }
    
   

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Hero clone() throws CloneNotSupportedException {
        return new Hero(name, description);
    }
    
    
    public Builder builder(){ return new Builder(this);}
    
    public static class Builder{
        private Hero hero;

        public Builder(Hero hero) {
            this.hero = hero;
        }
        
        
        
        public Builder name(String pName){
            hero.setName(pName);
            return this;
        }
        
        public Builder description(String pDescription){
            hero.setDescription(pDescription);
            return this;
        }
        
        public Hero build(){
            return hero;
        }
        
    }
    
}