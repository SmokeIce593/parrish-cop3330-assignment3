/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex41;

import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;


public class NameSorterBase {

    public static void main(String[] args) throws Exception {
        // Turns input file into List
        List<String> names = convertFile();
        NameSorterSort.sortList(names);
        NameSorterExport.exportList(names);
        }



    private static List<String> convertFile() throws IOException {
        return Files.readAllLines(Path.of("Input/exercise41_input.txt"));
    }


}