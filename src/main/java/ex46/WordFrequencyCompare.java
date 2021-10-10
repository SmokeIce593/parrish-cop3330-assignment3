/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex46;
import java.util.Comparator;
import java.util.Map;

class WordFrequencyCompare implements Comparator<String> {
    Map<String, Integer> base;

    public WordFrequencyCompare(Map<String, Integer> base) {
        this.base = base;
    }

    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }
}