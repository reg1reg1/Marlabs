package com.marlabs;

import java.util.ArrayList;
import java.util.HashMap;

public class Program5 {
    public static void main(String[] args) {
        ArrayList<String> dict = new ArrayList<String>();

        dict.add("Welcome");
        dict.add("to");
        dict.add("the");
        dict.add("dark");
        dict.add("side.");

        // Iterating using For loop

        for(int i=0;i<dict.size();i++)
        {
            System.out.println(dict.get(i));
        }

        //Iterating using while loop
        int i=0;
        while(i<dict.size())
        {
            System.out.println(dict.get(i));
            i++;
        }

        //iterating using Enhanced for loop
        for (String word : dict) {
            System.out.println(word);
        }


    }





}
