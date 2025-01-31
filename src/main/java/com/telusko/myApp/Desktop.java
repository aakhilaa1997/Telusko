package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/*Created Duplicate of Laptop as Desktop and running the Application.
 As both have @Component, Spring is confused which one to use
 1) Mark one as @Primary
 2) Add   @Qualifier("laptop"/desktop) in the main start of service class (Dev)
*/
//@Primary
public class Desktop implements Computer{

    /* Now I want Dev class to call the Laptop. How will the Laptop be called from the service */
    public void compile(){
        System.out.println("I want Desktop for my Dev work!!");
    }
}
