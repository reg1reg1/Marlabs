package com.marlabs.program5;

public class Bottle {
    public static void main(String args[])
    {
        String x="sweet";
        System.out.println("Welcome to the Bottle Class Main method");
        Water wObj = new Water();
        wObj.taste();
        Water wObj2= new Water(x,200,true);
        wObj2.taste();

    }
}
