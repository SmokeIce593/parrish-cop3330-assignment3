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
        List<String> info = convertFile();
        info = sort.Combiner(info);
        table.TableOutput(info);
    }



    private static List<String> convertFile() throws IOException {
        return Files.readAllLines(Path.of("Input/exercise42_input.txt"));
    }


}