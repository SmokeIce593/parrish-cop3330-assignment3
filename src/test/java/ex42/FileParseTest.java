/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FileParseTest {
    @Test
    void SeperateFromComma() {
        FileParseSort sort = new FileParseSort();
        List<String> initialList = new ArrayList<>();

        // Adding the List
        initialList.add("Test,Test1,Test2");


        List<String> sorted = sort.Combiner(initialList);
        // What the sorted list should look like
        List<String> sortedCompare = new ArrayList<>();
        sortedCompare.add("Test");
        sortedCompare.add("Test1");
        sortedCompare.add("Test2");

        Assertions.assertEquals(sortedCompare, sorted);

    }

    @Test
    void Max0() {
        FileParseTable table = new FileParseTable();
        List<String> initialList = new ArrayList<>();

        // Adding the List
        initialList.add("1");
        initialList.add("12");
        initialList.add("123");
        initialList.add("1234");
        initialList.add("12345");

        int maxvalue = table.Max(initialList, 0);


        Assertions.assertEquals(maxvalue, 4);

    }

    @Test
    void Max1() {
        FileParseTable table = new FileParseTable();
        List<String> initialList = new ArrayList<>();

        // Adding the List
        initialList.add("1");
        initialList.add("12");
        initialList.add("123");
        initialList.add("1234");
        initialList.add("12345");

        int maxvalue = table.Max(initialList, 1);


        Assertions.assertEquals(maxvalue, 5);

    }

    @Test
    void Spaces() {
        FileParseTable table = new FileParseTable();


        String Spaces = table.Spaces(5, 3);
        String Compare = "     ";

        Assertions.assertEquals(Spaces, Compare);

    }

    @Test
    void Dashes() {
        FileParseTable table = new FileParseTable();


        String Dashes = table.Dash(5);
        String Compare = "-----";

        Assertions.assertEquals(Dashes, Compare);

    }

    @Test
    void DashMax() {
        FileParseTable table = new FileParseTable();
        List<String> initialList = new ArrayList<>();

        // Adding the List
        initialList.add("1");
        initialList.add("12");
        initialList.add("123");
        initialList.add("1234");
        initialList.add("12345");
        initialList.add("123456");

        String Spaces = table.SpaceMax(initialList);
        String Compare = "------------------------";

        Assertions.assertEquals(Spaces, Compare);

    }
}
