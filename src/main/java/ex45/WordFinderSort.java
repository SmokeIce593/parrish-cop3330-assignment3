/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex45;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;



public class WordFinderSort {
    public List<String> ChangeWord(List<String> lines) {
        List<String> editedList = new ArrayList<String>();

        // Goes through all lines
        for (int i = 0; i < lines.size(); i++) {
            // Goes through and replaces every instance of utilize with use
            editedList.add(lines.get(i).replaceAll("utilize","use"));
        }
        return editedList;
    }
}