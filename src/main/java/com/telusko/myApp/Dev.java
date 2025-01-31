package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {


    //Autowise to wire the connection between Dev and Laptop
    @Autowired
    private Laptop lappy;

//		public Dev(Laptop lappy){
//			this.lappy = lappy;
//		}

//		public void setLaptop(Laptop lappy){
//			this.lappy = lappy;
//		}

    public void build(){
        //caling Laptop from another to this class. Class inside class
        lappy.compile();
        System.out.println("I am going to build an Awesome project!!!");
    }
}
