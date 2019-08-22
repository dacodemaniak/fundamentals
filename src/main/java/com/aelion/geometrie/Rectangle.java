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
public class Rectangle extends FormeGeometrique {
    private double lg;
    private double ln;
    
    public void setLgLn(double lg, double ln) {
        this.lg = lg;
        this.ln = ln;
    }
    
    public void setLg(double lg) {
        this.lg = lg;
    }
    
    public void setLn(double ln) {
        this.ln = ln;
    }
    
    @Override
    public double calculerPerimetre() {
        return (this.lg + this.ln) * 2;
    }
}
