/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex46;

import java.util.*;
import java.lang.*;


public class WordFrequencySort {
    public List<String> Combiner(List<String> textList) {
        List<String> spreadList = new ArrayList<String>();

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

    public List<String> CharCombiner(List<String> names, String Current, String CurrentBuild, int i) {
        List<String> spreadList = new ArrayList<String>();
        // Goes through every character and checks for ,. Since the last name is before the first ,
        // And first name is before salary
        int lastspace = -1;
        for(int j=0; j<names.get(i).length(); j++){
            // If size of spreadlist is 2 (When it's about to be the numbers) then break
            if (j == names.get(i).length()-1){
                spreadList.add(names.get(i).substring(lastspace + 1, names.get(i).length()));
                CurrentBuild = "";
                break;
            }

            // If current character == ' we need to add to list
            if(Current.charAt(j) == ' '){
                spreadList.add(CurrentBuild);
                CurrentBuild = "";
                lastspace = j;
            }
            else{
                // This adds letter by letter to the last name until , is reached.
                CurrentBuild = CurrentBuild + Current.charAt(j);
            }
        }
        return spreadList;
    }

    // Gets the values of all words into a map
    public TreeMap<String, Integer> WordFrequency(List<String> textList) {
        Map<String, Integer> Frequency = new HashMap();
        for(int i=0; i<textList.size(); i++){
            if(Frequency.containsKey(textList.get(i))){
                Frequency.replace(textList.get(i), Frequency.get(textList.get(i)) + 1);
            }
            else{
                Frequency.put(textList.get(i), 1);
            }

        }
        WordFrequencyCompare sort = new WordFrequencyCompare(Frequency);
        TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(sort);
        sorted.putAll(Frequency);

        return sorted;
    }




}

