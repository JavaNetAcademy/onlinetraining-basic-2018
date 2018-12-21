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
public class Hero extends BasicData implements Cloneable{
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

     
    
    
    
    
    
}
