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
    @Override
    public String sayHello() {
        return "Hello Doctor " + this.name();
    }
}
