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
public class Attorney extends User {
    public Attorney() {}
    
    public Attorney(String name, String firstName) {
        super(name, firstName);
    }
    
    public Attorney(String name, String firstName, boolean isMale) {
        super(name, firstName, isMale);
    }
    
    @Override
    public String sayHello() {
        return "Hello Maître " + this.name;
    }
}
