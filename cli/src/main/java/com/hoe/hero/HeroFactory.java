package com.hoe.hero;

import com.hoe.core.BaseFactory;
import com.hoe.core.BasicData;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public Hero createWithDefaultDescription() {
        try {
            return heroWithDefaultDescription.clone();
        } catch (CloneNotSupportedException ex) {
            return createEmpty();
        }
    }
    
}
