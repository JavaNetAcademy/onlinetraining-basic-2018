package com.hoe.ability;

import com.hoe.species.*;
import com.hoe.hero.*;
import com.hoe.core.BaseFactory;
import com.hoe.core.BasicData;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author netacademia
 */
public class AbilityFactory implements BaseFactory{
    private static final Ability abilityWithDefaultDescription = new Ability("", (byte)0, (byte)0, (byte)0);
   

    @Override
    public Ability createEmpty() {
        return new Ability();
    }

    @Override
    public Ability createWithDefaultValues() {
        try {
            return abilityWithDefaultDescription.clone();
        } catch (CloneNotSupportedException ex) {
            return createEmpty();
        }
    }
    
}
