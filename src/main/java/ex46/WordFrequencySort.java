/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex46;

import java.util.*;
import java.lang.*;


public class WordFrequencySort {
    public List<String> Combiner(List<String> textList) {
        List<String> spreadList = new ArrayList<>();

        // Goes through all lines
        for (int i=0; i<textList.size(); i++){
            String Current = textList.get(i);
            String CurrentBuild = "";

            // Goes through every character and checks for ,. Since the last name is before the first ,
            // And first name is before salary
            spreadList.addAll(CharCombiner(textList, Current, CurrentBuild, i) );

        }
        return spreadList;
    }

    public List<String> CharCombiner(List<String> textList, String Current, String CurrentBuild, int i) {
        List<String> spreadList = new ArrayList<>();
        // Goes through every character and checks for spaces. Since the last name is before the first ,
        // And first name is before salary
        int lastspace = -1;
        StringBuilder CurrentBuildBuilder = new StringBuilder(CurrentBuild);
        for(int j = 0; j<textList.get(i).length(); j++){
            // If last character in word then break
            if (j == textList.get(i).length()-1){
                spreadList.add(textList.get(i).substring(lastspace + 1));
                break;
            }

            // If current character == ' we need to add to list
            if(Current.charAt(j) == ' '){
                spreadList.add(CurrentBuildBuilder.toString());
                CurrentBuildBuilder = new StringBuilder();
                lastspace = j;
            }
            else{
                // This adds letter by letter to the last name until , is reached.
                CurrentBuildBuilder.append(Current.charAt(j));
            }
        }
        return spreadList;
    }

    // Gets the values of all words into a map
    public TreeMap<String, Integer> WordFrequency(List<String> textList) {
        Map<String, Integer> Frequency = new HashMap();
        for (String s : textList) {
            if (Frequency.containsKey(s)) {
                Frequency.replace(s, Frequency.get(s) + 1);
            } else {
                Frequency.put(s, 1);
            }

        }
        WordFrequencyCompare sort = new WordFrequencyCompare(Frequency);
        TreeMap<String, Integer> sorted = new TreeMap<>(sort);
        sorted.putAll(Frequency);

        return sorted;
    }




}

