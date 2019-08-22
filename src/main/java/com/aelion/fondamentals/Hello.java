/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aelion.fondamentals;

import com.aelion.fondamentals.users.User;

/**
 * Point d'entrée dans l'application
 * @author Aélion - Jean-Luc - jla.webprojet@gmail.com
 */
public class Hello {
    /**
     * 
     * @param args Tableau de chaîne en entrée
     */
    public static void main(String args[]) {
        // Build one user... Bond, James Bond...
        User bond = new User();
        // Define name and firstname, then gender
        bond.setName("bond");
        bond.setFirstName("James");
        
        // Define another user
        User mond = new User();
        mond.setName("Monde");
        mond.setFirstName("Ray");
        mond.isMale(false);
        
        System.out.println(bond.sayHello());
        System.out.println(mond.sayHello());
    }
}
