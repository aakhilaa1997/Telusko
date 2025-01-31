package com.telusko.myApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    /* Now I want Dev class to call the Laptop. How will the Laptop be called from the service */
    public void compile(){
        System.out.println("I want Laptop for my Dev work!!");
    }
}
