package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//Laptop implements interface which is also a kind of Laptop
public class Laptop implements Computer{

    /* Now I want Dev class to call the Laptop. How will the Laptop be called from the service */
    public void compile(){
        System.out.println("I want Laptop for my Dev work!!");
    }
}
