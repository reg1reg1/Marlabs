package com.marlabs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        try {
            File myObj = new File("./resources/myTextFile.txt");
            HashMap<String, Integer> dict = new HashMap<String, Integer>();
            Scanner myReader = new Scanner(myObj);
            StringBuilder text = new StringBuilder("");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                text.append(data);

            }
            System.out.println(text.toString());
            myReader.close();
            String[] words = text.toString().split("([.,!?:;'\"-]|\\s)+");
            System.out.println("js");
            int maxC=-1;
            String ans="";
            for(int i=0;i<words.length;i++)
            {

                Integer n = dict.get(words[i]);
                n = (n == null) ? 1 : ++n;
                dict.put(words[i], n);

            }


            for(HashMap.Entry<String,Integer> entry : dict.entrySet())
            {
                String key = entry.getKey();
                 if(maxC<(int)entry.getValue())
                 {
                     maxC=(int)entry.getValue();
                     ans=key;
                 }

            }
            System.out.println("The word \""+ ans+"\" occurred the most "+"("+maxC+" times)");

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
