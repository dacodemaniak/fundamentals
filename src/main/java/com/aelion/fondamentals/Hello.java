/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aelion.fondamentals;

import com.aelion.fondamentals.share.strategies.SendToDialog;
import com.aelion.fondamentals.users.Attorney;
import com.aelion.fondamentals.users.Doctor;
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
        User bond = new Attorney();
        bond.setStrategy(new SendToDialog());
        // Define name and firstname, then gender
        bond
            .name("bond")
            .firstName("James");
        bond.sayHello();
        
        // Define another user
        User mond = new Doctor();
        mond
            .name("Monde")
            .firstName("Ray")
            .isMale(false);
        mond.sayHello();  // Dans la console
        
        User gentleman = new Doctor("Lupin", "Arsène");
        gentleman.setStrategy(new SendToDialog());
        gentleman.sayHello();
        
        
        User midget = new Attorney("Matthie", "Mimi", false);
        midget.sayHello();
        
        // Instancier un Attorney
        Attorney thibault = new Attorney();
        thibault
            .name("Trucmuche")
            .firstName("Thibault");
        thibault.setStrategy(new SendToDialog());
        thibault.sayHello();
    }
}