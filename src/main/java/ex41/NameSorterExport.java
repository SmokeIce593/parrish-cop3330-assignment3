/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex41;

import java.io.IOException;
import java.io.FileWriter;
import java.util.List;



public class NameSorterExport {
    public static void exportList(List<String> Names) throws IOException {
        FileWriter outputWriter = new FileWriter("Output/exercise41_output1.txt");

        outputWriter.write("Total of " + Names.size() + " names\n");
        outputWriter.write("-----------------\n");
        for (String name : Names) {
            outputWriter.write(name + "\n");
        }
        outputWriter.close();
    }


}