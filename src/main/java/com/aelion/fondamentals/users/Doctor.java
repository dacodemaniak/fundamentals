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
public class Doctor extends User {
    
    public Doctor() {
        super();
    }
    
    public Doctor(String name, String firstName) {
        super(name, firstName);
    }
    
    public Doctor(String name, String firstName, boolean isMale) {
        super(name, firstName, isMale);
    }
    
    @Override
    public void sayHello() {
        this.strategy.sayHello("Bonjour Docteur " + this.name + " " + this.firstName);
    }
}
