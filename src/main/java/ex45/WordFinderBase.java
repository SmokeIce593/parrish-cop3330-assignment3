/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex45;

import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;


public class WordFinderBase {

    public static void main(String[] args) throws Exception {
        WordFinderSort sort = new WordFinderSort();
        // Turns input file into List
        List<String> names = convertFile();
        names = sort.ChangeWord(names);
        WordFinderExport.exportList(names);
    }



    private static List<String> convertFile() throws IOException {
        return Files.readAllLines(Path.of("Input/exercise45_input.txt"));
    }


}