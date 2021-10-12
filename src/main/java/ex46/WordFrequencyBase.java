/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.TreeMap;


public class WordFrequencyBase {

    public static void main(String[] args) throws Exception {
        TreeMap Frequency;
        WordFrequencySort sort = new WordFrequencySort();
        // Turns input file into List
        List<String> textList = convertFile();
        textList = sort.Combiner(textList);
        Frequency = sort.WordFrequency(textList);
        WordFrequencyExport.printList(Frequency);
    }



    private static List<String> convertFile() throws IOException {
        return Files.readAllLines(Path.of("Input/exercise46_input.txt"));
    }


}