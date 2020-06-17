package com.marlabs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program9 {
    static int[] findMissing(int calcsum,int calcSq,int n)
    {
        int[] ans= new int[2];
        int sumN = (n * (n + 1)) / 2;

        // Sum of squares of first n natural numbers
        int sumSqN = (n * (n + 1) * (2 * n + 1)) / 6;


        ans[0] = (((calcSq - sumSqN) / (calcsum - sumN)) + sumN - calcsum) / 2;
        ans[1] = calcsum - sumN + ans[0];

        return ans;
    }
    public static void main(String[] args) throws IOException {
        int sum=0;
        int square=0;
        String str1;
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number array separated by space");
        str1 = reader.readLine();
        String[] words = str1.split("\\s+");
        //System.out.println(words);
        int num[] = new int[words.length];
        for(int i=0;i<words.length;i++)
        {
            num[i]=Integer.parseInt(words[i]);
        }
        for(int i=0;i<words.length;i++)
        {
            sum+=num[i];
            square+= Math.pow(num[i], 2);
        }
        int[] ans= findMissing(sum,square,words.length);
        System.out.println("The repeating number is "+ans[1]+" and the missing number is  "+ans[0]);
    }
}
