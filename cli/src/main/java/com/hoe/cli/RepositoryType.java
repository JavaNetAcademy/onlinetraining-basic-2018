package com.hoe.cli;

/**
 *
 * @author netacademia
 */
public enum RepositoryType {
    HERO("hero"),SPECIES("species"),ABILITY("ability");

    private String name;
    private RepositoryType(String pName) {
        name=pName;
    }
    
    
}
