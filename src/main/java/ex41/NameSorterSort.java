/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex41;

import java.util.List;


public class NameSorterSort {
    public static List<String> sortList(List<String> names) {
        names.sort(String.CASE_INSENSITIVE_ORDER);
        return names;
    }
}