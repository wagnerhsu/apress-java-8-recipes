package org.java8recipes.chapter01.recipe1_02;


/* The main program begins in this class */
public class HelloWorld {
    public static void main(String[] args) {
        HelloMessage hm;
        hm = new HelloMessage();
        System.out.println(hm.getMessage());
        hm.setMessage("Hello, World");
        System.out.println(hm.getMessage());
    }
}