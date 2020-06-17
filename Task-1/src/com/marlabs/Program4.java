package com.marlabs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program4 {

    static boolean checkPallindrome(String str1)
    {

        int str1Len = str1.length();
        if(str1Len<1) return true;
        int i=0,j=str1Len-1;
        char temp;
        while(i<j)
        {
            if(Character.toLowerCase(str1.charAt(i)) == Character.toLowerCase(str1.charAt(j)))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String s = new String(reader.readLine());
        boolean ans = checkPallindrome(s);
        String msg = ans ? "a pallindrome" : "not a pallindrome";
        System.out.println(s+"is "+msg);
    }

}
