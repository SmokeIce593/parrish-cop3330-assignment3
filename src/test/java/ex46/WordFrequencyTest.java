/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex46;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordFrequencyTest {
    @Test
    void SeperateFromSpaceorEnd() {
        WordFrequencySort sort = new WordFrequencySort();
        List<String> initialList = new ArrayList<String>();

        // Adding the List
        initialList.add("Test Test1 Test2");


        List<String> sorted = sort.Combiner(initialList);
        // What the sorted list should look like
        List<String> sortedCompare = new ArrayList<String>();
        sortedCompare.add("Test");
        sortedCompare.add("Test1");
        sortedCompare.add("Test2");

        Assert.assertEquals(sortedCompare, sorted);

    }
    @Test
    void TreeMapOrderingKey() {
        WordFrequencySort sort = new WordFrequencySort();
        List<String> initialList = new ArrayList<String>();

        // Adding the List
        initialList.add("cow");
        initialList.add("cow");
        initialList.add("cow");
        initialList.add("apple");
        initialList.add("apple");
        initialList.add("apple");
        initialList.add("apple");
        initialList.add("apple");
        initialList.add("horse");

        TreeMap<String, Integer> sorted = sort.WordFrequency(initialList);
        // What the sorted list should look like
        TreeMap<String, Integer> compare = new TreeMap<String, Integer>();
        compare.put("apple", 5);
        compare.put("cow", 3);
        compare.put("horse", 1);

        List<String> keyList1 = new ArrayList<String>();
        List<String> keyList2 = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : compare.entrySet()) {
            keyList1.add(entry.getKey());
        }
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            keyList2.add(entry.getKey());
        }


        Assert.assertEquals(keyList1, keyList2);

    }

    @Test
    void TreeMapOrderingValue() {
        WordFrequencySort sort = new WordFrequencySort();
        List<String> initialList = new ArrayList<String>();

        // Adding the List
        initialList.add("cow");
        initialList.add("cow");
        initialList.add("cow");
        initialList.add("apple");
        initialList.add("apple");
        initialList.add("apple");
        initialList.add("apple");
        initialList.add("apple");
        initialList.add("horse");

        TreeMap<String, Integer> sorted = sort.WordFrequency(initialList);
        // What the sorted list should look like
        TreeMap<String, Integer> compare = new TreeMap<String, Integer>();
        compare.put("apple", 5);
        compare.put("cow", 3);
        compare.put("horse", 1);


        List<Integer> valueList1 = new ArrayList<Integer>();
        List<Integer> valueList2 = new ArrayList<Integer>();
        for (Map.Entry<String, Integer> entry : compare.entrySet()) {
            valueList1.add(entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            valueList2.add(entry.getValue());
        }


        Assert.assertEquals(valueList1, valueList2);

    }

}
