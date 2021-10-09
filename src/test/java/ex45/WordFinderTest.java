/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex45;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {
    @Test
    void SeperateFromComma() {
        WordFinderSort sort = new WordFinderSort();
        List<String> initialList = new ArrayList<String>();

        // Adding the List
        initialList.add("I would like to utilize the word utilize to use utilize");
        initialList.add("utilize");
        initialList.add("utilize");

        List<String> edited = sort.ChangeWord(initialList);
        // What the sorted list should look like
        List<String> sortedCompare = new ArrayList<String>();
        sortedCompare.add("I would like to use the word use to use use");
        sortedCompare.add("use");
        sortedCompare.add("use");

        Assert.assertEquals(sortedCompare, edited);

    }
}