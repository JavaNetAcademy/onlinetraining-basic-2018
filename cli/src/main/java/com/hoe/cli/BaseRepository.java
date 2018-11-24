/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoe.cli;

/**
 *
 * @author netacademia
 */
public abstract class BaseRepository<T> {
    public abstract T[] getElements();
}
