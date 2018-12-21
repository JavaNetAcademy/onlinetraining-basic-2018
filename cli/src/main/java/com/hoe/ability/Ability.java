/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.ability;

import com.hoe.core.BasicData;

/**
 *
 * @author netacademia
 */
public class Ability extends BasicData implements Cloneable{
    private byte attack, protect, clever;

    public Ability() {
    }

    public Ability(String name, byte attack, byte protect, byte clever) {
        super(name);
        this.attack = attack;
        this.protect = protect;
        this.clever = clever;
    }

    public byte getAttack() {
        return attack;
    }

    public void setAttack(byte attack) {
        this.attack = attack;
    }

    public byte getProtect() {
        return protect;
    }

    public void setProtect(byte protect) {
        this.protect = protect;
    }

    public byte getClever() {
        return clever;
    }

    public void setClever(byte clever) {
        this.clever = clever;
    }

    @Override
    public Ability clone() throws CloneNotSupportedException {
        return new Ability(name, attack, protect, clever);
    }
    
    public Builder builder(){return new Builder(this);}
    
    public static class Builder{
        private Ability ability;

        public Builder(Ability ability) {
            this.ability = ability;
        }
        
  
  
    public Builder attack(byte attack) {
        this.ability.setAttack(attack);
        return this;
    }

  
    public Builder protect(byte protect) {
        this.ability.setProtect(protect);
        return this;
    }

  
    public Builder clever(byte clever) {
        this.ability.setClever(clever);
        return this;
    }
      
    
    public Builder name(String pName) {
        this.ability.setName(pName);
        return this;
    }
        public Ability build(){return this.ability;}
        
    
    }
    
    
}
