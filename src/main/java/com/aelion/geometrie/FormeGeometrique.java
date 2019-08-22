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
public class FormeGeometrique {
    protected String color;
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public double calculerPerimetre() {
        return 0;
    }
}
