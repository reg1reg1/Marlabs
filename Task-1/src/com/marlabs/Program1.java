package com.marlabs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Program1 {


    public static void main(String[] args)
    {

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        StringBuilder str1;
        try {
            str1 = new StringBuilder(reader.readLine());
            int str1Len = str1.length();
            int i=0,j=str1Len-1;
            char temp;
            while(i<j)
            {
                temp=str1.charAt(i);
                str1.setCharAt(i,str1.charAt(j));
                str1.setCharAt(j,temp);
                i++;
                j--;
            }
            System.out.println(str1);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
