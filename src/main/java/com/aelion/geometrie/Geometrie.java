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
public class Geometrie {
    public static void main(String args[]) {
        Carre unCarre = new Carre();
        unCarre.setColor("Rouge");
        unCarre.setLg(4);
        System.out.println("Je dessine un carré de couleur : " + unCarre.getColor() + " de périmètre : " + unCarre.calculerPerimetre());
        
        Cercle unCercle = new Cercle();
        unCercle.setColor("Violet");
        unCercle.setRadius(2);
        System.out.println("Je dessine un cercle de couleur : " + unCercle.getColor() + " de périmètre : " + unCercle.calculerPerimetre());
        
        Rectangle unRectangle = new Rectangle();
        unRectangle.setLgLn(2, 5);
        unRectangle.setColor("Vert");
        System.out.println("Je dessine un rectangle de couleur : " + unRectangle.getColor() + " de périmètre : " + unRectangle.calculerPerimetre());
    }
}
