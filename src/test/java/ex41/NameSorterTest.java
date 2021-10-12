/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class NameSorterTest {
    @Test
    void SortTrial(){
        List<String> initialList = new ArrayList<>();

        // Adding the unorganized List
        initialList.add("w");
        initialList.add("Y");
        initialList.add("A");
        initialList.add("B");

        // Sorting the unorganized List
        List<String> sorted = NameSorterSort.sortList(initialList);

        // What the sorted list should look like
        List<String> sortedCompare = new ArrayList<>();
        sortedCompare.add("A");
        sortedCompare.add("B");
        sortedCompare.add("w");
        sortedCompare.add("Y");

        Assertions.assertEquals(sortedCompare, sorted);

    }
}