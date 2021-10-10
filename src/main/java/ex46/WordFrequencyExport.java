/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex46;

import java.io.IOException;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class WordFrequencyExport {
    public static void printList(TreeMap<String, Integer> list){
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            String keyString = entry.getKey();
            int valueMap = entry.getValue();
            String Staradd = Stars(valueMap);
            System.out.printf("%s: %s\n", keyString, Staradd);
        }
    }

    public static String Stars(int staramount){
        String StarString = "";
       for(int i=0; i<staramount; i++){
           StarString = StarString + "*";
       }
       return StarString;
    }

}