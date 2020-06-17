package com.marlabs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class Program2 {

    public static void main(String[] args) {
        HashMap<String, Integer> dict = new HashMap<String, Integer>();
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        String str1;
        try {
            str1 = reader.readLine();
            int str1Len = str1.length();
            String[] words = str1.split("\\s+");

            for(int i=0;i<words.length;i++)
            {

                Integer n = dict.get(words[i]);
                n = (n == null) ? 1 : ++n;
                dict.put(words[i], n);

            }


            //Program-3 Iterating over the dictionary using a while loop

            Iterator hmIterator = dict.entrySet().iterator();
            while (hmIterator.hasNext()) {
                HashMap.Entry mapElement = (HashMap.Entry)hmIterator.next();
                int count = (int)mapElement.getValue();
                System.out.println(mapElement.getKey() + " : " + count);
            }

            //Also Program-3, Iterating over Hashmap using Enhanced ForLoop
            for (HashMap.Entry<String,Integer> entry : dict.entrySet()) {
                String key = entry.getKey();
                int value = (int)entry.getValue();
                System.out.println(entry.getKey() + " : " + value);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }


    }
}
