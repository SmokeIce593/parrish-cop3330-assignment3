/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex41;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {
    @Test
    void SortTrial(){
        NameSorterSort sort = new NameSorterSort();
        List<String> initialList = new ArrayList<String>();

        // Adding the unorganized List
        initialList.add("w");
        initialList.add("Y");
        initialList.add("A");
        initialList.add("B");

        // Sorting the unorganized List
        List<String> sorted = sort.sortList(initialList);

        // What the sorted list should look like
        List<String> sortedCompare = new ArrayList<String>();
        sortedCompare.add("A");
        sortedCompare.add("B");
        sortedCompare.add("w");
        sortedCompare.add("Y");

        Assert.assertEquals(sortedCompare, sorted);

    }
}