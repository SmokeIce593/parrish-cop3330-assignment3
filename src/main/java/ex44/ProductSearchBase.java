/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex44;

import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;


public class ProductSearchBase {

    public static void main(String[] args) throws Exception {

    }



    private static List<String> convertFile() throws IOException {
        List<String> names = Files.readAllLines(Path.of("Input/exercise42_input.txt"));
        return names;
    }


}