/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aelion.fondamentals.users;

import com.aelion.fondamentals.share.interfaces.Helloable;
import com.aelion.fondamentals.share.strategies.SendToConsole;

/**
 *
 * @author root
 */
public abstract class User {
    /**
     * Nom de l'utilisateur
     */
    protected String name;
    
    /**
     * Prénom de l'utilisateur
     */
    protected String firstName;
    
    /**
     * Détermine le sexe de l'utilisateur, default true
     */
    protected boolean isMale = true;
    
    protected Helloable strategy = new SendToConsole();
    
    /**
     * Constructeur standard
     */
    protected User() {}
    
    /**
     * Constructeur avec nom et prénom
     * @param name
     * @param firstName 
     */
    protected User(String name, String firstName) {
        this.name = name.toUpperCase();
        this.firstName = firstName;
    }
    
    /**
     * Constructeur avec nom, prénom et genre
     * @param name
     * @param firstName
     * @param isMale 
     */
    protected User(String name, String firstName, boolean isMale) {
        this.name = name.toUpperCase();
        this.firstName = firstName;
        this.isMale = isMale;
    }
    
    public void setStrategy(Helloable strategy) {
        this.strategy = strategy;
    }
    
    /**name
     * Store firstName of this User
     * @param firstName name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    


    
    /**name
     * Returns name of this User
     * @return 
     */
    public String getName() {
        return this.name;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public boolean getIsMale() {
        return this.isMale;
    }
 
     /**
     * Store uppercase name param into name attribute
     * @param name Name to convert into uppercase string
     */
    public void setName(String name) {
        this.name = name.toUpperCase();
    }
    
    public User name(String name) {
        this.name = name.toUpperCase();
        return this;
    }
    
    public String name() {
        return this.name;
    }
    
    public User firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    public String firstName() {
        return this.firstName;
    }
    
    /**
     * Store the gender of this User
     * @param isMale 
    */    
    public User isMale(boolean isMale) {
        this.isMale = isMale;
        return this;
    }
    
    public boolean isMale() {
        return this.isMale;
    }
    /**
     * Retourne une chaîne avec le nom, le prénom et le sexe du User
     * @return String
     */
    public abstract void sayHello();
}
