package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {


    //After adding Computer Interface, its more like its calling Computer instead of Laptop. Always call the end Object.
    @Autowired
    @Qualifier("desktop")
    private Computer comp;

//		public Dev(Laptop lappy){
//			this.lappy = lappy;
//		}

//		public void setLaptop(Laptop lappy){
//			this.lappy = lappy;
//		}

    public void build(){
        //caling Laptop from another to this class. Class inside class
        comp.compile();
        System.out.println("I am going to build an Awesome project!!!");
    }
}
