package com.marlabs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Program6 {



    public static void main(String[] args) throws IOException {
        Set<Character> letter = new HashSet<Character>();
        Set<Character> duplicates = new HashSet<Character>();
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        String str1;
        str1 = reader.readLine();
        int L = str1.length();

        for(int i=0;i<L;i++)
        {
            if(!letter.contains(str1.charAt(i)))
            {
                letter.add(str1.charAt(i));
            }
            else
            {
                duplicates.add(str1.charAt(i));

            }
        }
        //print the duplicate chars
        for(char i: duplicates)
        {
            System.out.print(i+", ");
        }

    }

}
