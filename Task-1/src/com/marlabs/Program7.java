package com.marlabs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program7 {
    public static void main(String[] args) throws IOException {
        int fmax=-99999;
        int smax=-99999;
        String str1;
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number array separated by space");
        str1 = reader.readLine();
        String[] words = str1.split("\\s+");
        System.out.println(words);
        int num[] = new int[words.length];
        for(int i=0;i<words.length;i++)
        {
            num[i]=Integer.parseInt(words[i]);
        }
        int temp;
        for(int i:num)
        {
            if (i>=fmax)
            {
                temp=fmax;
                fmax=i;
                smax=temp;

            }
            else if(i>smax)
            {

                smax=i;
            }
        }
        System.out.println("Max "+fmax+" Second Max "+smax);
    }

}
