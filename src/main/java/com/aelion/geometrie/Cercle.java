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
public class Cercle extends FormeGeometrique {
    private double radius;
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * this.radius;
    }
}
