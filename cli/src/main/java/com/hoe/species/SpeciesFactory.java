package com.hoe.species;

import com.hoe.hero.*;
import com.hoe.core.BaseFactory;
import com.hoe.core.BasicData;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author netacademia
 */
public class SpeciesFactory implements BaseFactory{
    private static final Species speciesWithDefaultDescription = new Species("DEFAULT SPECIES NAME");
   

    @Override
    public Species createEmpty() {
        return new Species();
    }

    @Override
    public Species createWithDefaultValues() {
        try {
            return speciesWithDefaultDescription.clone();
        } catch (CloneNotSupportedException ex) {
            return createEmpty();
        }
    }
    
}
