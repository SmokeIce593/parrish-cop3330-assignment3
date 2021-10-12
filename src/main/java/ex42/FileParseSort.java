/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex42;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;



public class FileParseSort {
    public List<String> Combiner(List<String> info) {
        List<String> spreadList = new ArrayList<>();

        // Goes through all lines
        for (int i=0; i<info.size(); i++){
            String Current = info.get(i);
            String CurrentBuild = "";

            // Goes through every character and checks for ,. Since the last name is before the first ,
            // And first name is before salary
            spreadList.addAll(CharCombiner(info, Current, CurrentBuild, i));

        }
        return spreadList;
    }

    public List<String> CharCombiner(List<String> info, String Current, String CurrentBuild, int i) {
            List<String> spreadList = new ArrayList<>();
            // Goes through every character and checks for ,. Since the last name is before the first ,
            // And first name is before salary
        StringBuilder CurrentBuildBuilder = new StringBuilder(CurrentBuild);
        for(int j = 0; j<info.get(i).length(); j++){
                // If size of spreadlist is 2 (When it's about to be the numbers) then break
                if (spreadList.size() == 2){
                    spreadList.add(info.get(i).substring(j));
                    break;
                }

                // If current character == ' we need to add to list
                if(Current.charAt(j) == ','){
                    spreadList.add(CurrentBuildBuilder.toString());
                    CurrentBuildBuilder = new StringBuilder();
                }
                else{
                    // This adds letter by letter to the last name until , is reached.
                    CurrentBuildBuilder.append(Current.charAt(j));
                }
            }
        return spreadList;
    }

}