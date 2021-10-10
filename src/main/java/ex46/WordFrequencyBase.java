/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex46;

import java.util.HashMap;
import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.Map;
import java.util.TreeMap;


public class WordFrequencyBase {

    public static void main(String[] args) throws Exception {
        TreeMap Frequency = new TreeMap();
        WordFrequencyExport export = new WordFrequencyExport();
        WordFrequencySort sort = new WordFrequencySort();
        // Turns input file into List
        List<String> names = convertFile();
        names = sort.Combiner(names);
        Frequency = sort.WordFrequency(names);
        export.printList(Frequency);
    }



    private static List<String> convertFile() throws IOException {
        List<String> names = Files.readAllLines(Path.of("Input/exercise46_input.txt"));
        return names;
    }


}