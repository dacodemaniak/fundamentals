/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aelion.fondamentals.share.strategies;

import com.aelion.fondamentals.share.interfaces.Helloable;

/**
 *
 * @author root
 */
public class SendToConsole implements Helloable {

    public void sayHello(String what) {
        System.out.println(what);
    }
    
}
