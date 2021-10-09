/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex42;

import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;


public class FileParseBase {

    public static void main(String[] args) throws Exception {
        FileParseSort sort = new FileParseSort();
        FileParseTable table = new FileParseTable();
        // Turns input file into List
        List<String> names = convertFile();
        int total = names.size();
        names = sort.Combiner(names);
        table.TableOutput(names);
    }



    private static List<String> convertFile() throws IOException {
        List<String> names = Files.readAllLines(Path.of("Input/exercise42_input.txt"));
        return names;
    }


}