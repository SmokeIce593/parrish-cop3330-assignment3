/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex45;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class WordFinderTest {
    @Test
    void SeperateFromComma() {
        WordFinderSort sort = new WordFinderSort();
        List<String> initialList = new ArrayList<>();

        // Adding the List
        initialList.add("I would like to utilize the word utilize to use utilize");
        initialList.add("utilize");
        initialList.add("utilize");

        List<String> edited = sort.ChangeWord(initialList);
        // What the sorted list should look like
        List<String> sortedCompare = new ArrayList<>();
        sortedCompare.add("I would like to use the word use to use use");
        sortedCompare.add("use");
        sortedCompare.add("use");

        Assertions.assertEquals(sortedCompare, edited);

    }
}