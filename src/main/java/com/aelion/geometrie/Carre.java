/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aelion.geometrie;

/**
 *
 * @author root
 */
public class Carre extends FormeGeometrique {
    private double lg;
    
    public void setLg(double lg) {
        this.lg = lg;
    }
    
    @Override
    public double calculerPerimetre() {
        return this.lg * 4;
    }
}
