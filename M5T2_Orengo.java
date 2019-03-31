/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5t2_orengo;

import java.util.Scanner;

/**
 *
 * @author orengoa0459
 */
public class M5T2_Orengo {
    // this method will greet the user
    public static void showMessage(){
        System.out.println("Hello!");
    }//show message ()ends 
    
    public static void myMethod() {
        int value = 5;
        System.out.println(value);
    }
    
    public static void displayValue(int num) {
        
           
        System.out.println("the value is " + num);
        
        
    }
    // the main program
    public static void main(String[] args) {
        // this program will say hello to the user
        showMessage();
        
        myMethod();
        int age = 21;
        
        displayValue(age);
               
        //do it again
        showMessage();
        
            
       /*
        // then ask for their name
        String name;
        Scanner keyb = new Scanner (System.in);
        System.out.println("What's your name ");
        name = keyb.next();
        
        // then ask for their age
        System.out.println("How old are you?");
        int age = keyb.nextInt();
        
        // finally, it will repeat those back
        System.out.println("Nice to meet you " + name);
        System.out.println(" I'm much younger than " + age);
        */
    
    }// main ends
    
}
