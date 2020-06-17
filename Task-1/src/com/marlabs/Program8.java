package com.marlabs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program8 {
    public static void main(String[] args) throws IOException {
        String str1;
        System.out.println("Enter the string");
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        str1 = reader.readLine();
        System.out.println("Remove spaces");
        String[] words = str1.split("\\s+");
        StringBuilder output=new StringBuilder("");
        int L = words.length;
        for(int i=0;i<L;i++)
        {
            output.append(words[i]);
        }
        System.out.println(output);


    }
}
