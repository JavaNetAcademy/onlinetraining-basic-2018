package com.hoe.hero;

import com.hoe.core.BaseFactory;

/**
 *
 * @author netacademia
 */
public class HeroFactory implements BaseFactory{
    private static final Hero heroWithDefaultDescription = new Hero("", "DEFAULT HERO DESCRIPTION");
   

    @Override
    public Hero createEmpty() {
        return new Hero();
    }

    @Override
    public Hero createWithDefaultValues() {
        try {
            return heroWithDefaultDescription.clone();
        } catch (CloneNotSupportedException ex) {
            return createEmpty();
        }
    }
    
}
