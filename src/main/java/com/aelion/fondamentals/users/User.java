/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aelion.fondamentals.users;

/**
 *
 * @author root
 */
public class User {
    /**
     * Nom de l'utilisateur
     */
    private String name;
    
    /**
     * Prénom de l'utilisateur
     */
    private String firstName;
    
    /**
     * Détermine le sexe de l'utilisateur, default true
     */
    private boolean isMale = true;
    
    /**
     * Store uppercase name param into name attribute
     * @param name Name to convert into uppercase string
     */
    public void setName(String name) {
        this.name = name.toUpperCase();
    }
    
    /**
     * Store firstName of this User
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * Store the gender of this User
     * @param isMale 
     */
    public void isMale(boolean isMale) {
        this.isMale = isMale;
    }
    
    /**
     * Retourne une chaîne avec le nom, le prénom et le sexe du User
     * @return String
     */
    public String sayHello() {
        String message = "Hello ";
        
        if (this.isMale) {
            message = message + " Mister ";
        } else {
            message = message + " Miss ";
        }
        
        message = message + this.firstName + " " + this.name;
        
        return message;
    }
}
